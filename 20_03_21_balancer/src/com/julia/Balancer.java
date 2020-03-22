package com.julia;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.util.*;

public class Balancer implements Runnable {
    private DatagramSocket socket;
    private byte[] buf = new byte[256];

    private ArrayList<Server> servers;
    private static Integer position = 0;

    public Balancer(ArrayList<Server> servers) throws Exception {
        this.servers = servers;
    }

    public Integer getTarget() {
        Integer target;
        synchronized (position) {
            if (position > servers.size() - 1) {
                position = 0;
            }
//            target = servers.get(position).getPort();
            position++;

            Server server = servers.stream()
                    .min(Comparator.comparing(Server::getWorkload))
                    .get();
            System.out.println(server.getId() + ":" + server.getWorkload());
            target = server.getPort();
        }
        return target;
    }

    @Override
    public void run() {
        try {
            socket = new DatagramSocket(6000);

            while (true) {
                DatagramPacket packet
                        = new DatagramPacket(buf, buf.length);

                socket.receive(packet);

                String received = new String(packet.getData(), 0, packet.getLength());
                handleServerMessage(received, packet.getPort());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void stopListening() {
        socket.close();
    }

    private void handleServerMessage(String message, Integer port) {
        if (message.contains("_submitted_")) {
            String serverId = message.split("#")[1];
            Server serverWithId = servers.stream()
                    .filter(server -> server.getId().equals(serverId))
                    .findFirst()
                    .orElse(null);
            if (serverWithId != null) {
                Integer workload = serverWithId.getWorkload();
                serverWithId.setWorkload(workload + 1);
            }
        }

        if (message.contains("_handled_")) {
            String serverId = message.split("#")[1];
            Server serverWithId = servers.stream()
                    .filter(server -> server.getId().equals(serverId))
                    .findFirst()
                    .orElse(null);
            if (serverWithId != null) {
                Integer workload = serverWithId.getWorkload();
                serverWithId.setWorkload(workload - 1);
            }
        }
    }
}

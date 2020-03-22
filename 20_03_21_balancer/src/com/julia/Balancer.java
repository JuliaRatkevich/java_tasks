package com.julia;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.util.*;

public class Balancer implements Runnable {
    private DatagramSocket socket;
    private byte[] buf = new byte[256];

    private List<ServerDescription> serverDescriptions;
    private static Integer position = 0;

    public Balancer(ArrayList<ServerDescription> serverDescriptions) throws Exception {
        this.serverDescriptions = Collections.synchronizedList(serverDescriptions);
    }

    public Integer getTarget() {
        Integer target;
//        synchronized (position) {
//            if (position > serverDescriptions.size() - 1) {
//                position = 0;
//            }
//            target = servers.get(position).getPort();
//            position++;

        ServerDescription serverDescription = serverDescriptions.stream()
                .min(Comparator.comparing(ServerDescription::getWorkload))
                .get();

        System.out.println("----------------------------------------------------");
        serverDescriptions.stream().forEach(s ->
                System.out.println(s.getId() + ":" + s.getWorkload())
        );
        System.out.println("Picked: " + serverDescription.getId() + ":" + serverDescription.getWorkload());
        System.out.println("----------------------------------------------------");
//            System.out.println(server.getId() + ":" + server.getWorkload());
        target = serverDescription.getPort();
        increaseWorklodFor(serverDescription.getId());
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
//        if (message.contains("_submitted_")) {
//            String serverId = message.split("#")[1];
//            ServerDescription serverDescriptionWithId = serverDescriptions.stream()
//                    .filter(serverDescription -> serverDescription.getId().equals(serverId))
//                    .findFirst()
//                    .orElse(null);
//            if (serverDescriptionWithId != null) {
//                Integer workload = serverDescriptionWithId.getWorkload();
//                serverDescriptionWithId.setWorkload(workload + 1);
//            }
//        }

        if (message.contains("_handled_")) {
            String serverId = message.split("#")[1];
            ServerDescription serverDescriptionWithId = serverDescriptions.stream()
                    .filter(serverDescription -> serverDescription.getId().equals(serverId))
                    .findFirst()
                    .orElse(null);
            if (serverDescriptionWithId != null) {
                Integer workload = serverDescriptionWithId.getWorkload();
                serverDescriptionWithId.setWorkload(workload - 1);
            }
        }
    }

    private void increaseWorklodFor(String serverId) {
        ServerDescription serverDescriptionWithId = serverDescriptions.stream()
                .filter(serverDescription -> serverDescription.getId().equals(serverId))
                .findFirst()
                .orElse(null);
        if (serverDescriptionWithId != null) {
            Integer workload = serverDescriptionWithId.getWorkload();
            serverDescriptionWithId.setWorkload(workload + 1);
        }
    }
}

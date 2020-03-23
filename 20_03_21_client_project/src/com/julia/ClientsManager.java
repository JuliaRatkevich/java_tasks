package com.julia;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class ClientsManager {
    private ArrayList<Client> clients = new ArrayList<>();
    private int count = 0;

    public void start() throws IOException {
        BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = consoleReader.readLine()) != null) {
            if (line.equals("new")) {
                createNewClient();
                continue;
            }

            if (line.equals("close")) {
                closeClient();
                continue;
            }

            sendMessage(line);
            sendMessageToNewCustomer(line);
        }
    }

    private Client createNewClient() throws IOException {
        String clientId = "Client#" + count;
        count++;
        Client client = new Client(clientId);
        client.startConnection("127.0.0.1", 6666);
        clients.add(client);
        printInfo();
        return client;
    }

    private void closeClient() throws IOException {
        Client client = randomClient();
        if (client != null) {
            client.stopConnection();
            clients.remove(client);
        }
        printInfo();
    }

    private void sendMessageToNewCustomer(String message) throws IOException {
        Client client = createNewClient();
        Sender sender = new Sender(client, message);
        ExecutorService executor = Executors.newSingleThreadExecutor();
        executor.submit(sender);
    }

    private void sendMessage(String message) throws IOException {
        for (Client client : clients) {
            Sender sender = new Sender(client, message);
            ExecutorService executor = Executors.newSingleThreadExecutor();
            executor.submit(sender);
        }
    }

    private void printInfo() {
        System.out.println("Clients: " + clients.size());
    }

    private static int position = 0;
    private Client randomClient() {
        if (clients.isEmpty()) {
            return null;
        }

        if (position > clients.size() - 1) {
            position = 0;
        }
        Client client = clients.get(position);
        position++;

        return client;

    }
}

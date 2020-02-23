package com.julia;
import com.julia.Operation.Operation;
import com.julia.Operation.ToLowerCaseOperation;
import com.julia.Operation.ToUpperCaseOperation;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Scanner;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Main {

    static int HANDLERS_COUNT = 10;

    public static void main(String[] args) throws FileNotFoundException, InterruptedException {
        BlockingQueue<String> queue = new LinkedBlockingQueue<>();

        FileReader fileReader = new FileReader("file.txt");
        Scanner scanner = new Scanner(fileReader);
        PrintWriter printWriter = new PrintWriter("output.txt");

        HashMap<String, Operation> operations = new HashMap<>();
        operations.put("upperCase", new ToUpperCaseOperation());
        operations.put("lowerCase", new ToLowerCaseOperation());

        OperationProvider operationProvider = new OperationProvider(operations);

        Producer producer = new Producer(scanner, queue, HANDLERS_COUNT);

        Thread[] handlers = new Thread[HANDLERS_COUNT];
        for (int i = 0; i < HANDLERS_COUNT; i++) {
            TextHandler textHandler = new TextHandler(operationProvider, queue, printWriter);
            Thread textHandlerThread = new Thread(textHandler);
            textHandlerThread.start();
            handlers[i] = textHandlerThread;
        }

        Thread producerThread = new Thread(producer);
        producerThread.start();
        producerThread.join();

        for (Thread thread: handlers) {
            thread.join();
        }

        printWriter.close();
    }
}
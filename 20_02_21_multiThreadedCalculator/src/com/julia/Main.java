package com.julia;

import com.julia.Operation.Operation;
import com.julia.Operation.ToLowerCaseOperation;
import com.julia.Operation.ToUpperCaseOperation;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Main {

    static int HANDLERS_COUNT = 10;

    public static void main(String[] args) throws FileNotFoundException {
        BlockingQueue<String> queue = new LinkedBlockingQueue<String>();

        FileReader fileReader = new FileReader("file.txt");

        HashMap<String, Operation> operations = new HashMap<>();
        operations.put("upperCase", new ToUpperCaseOperation());
        operations.put("lowerCase", new ToLowerCaseOperation());

        OperationProvider operationProvider = new OperationProvider(operations);

        Producer producer = new Producer(fileReader, queue, HANDLERS_COUNT);

        for (int i = 0; i < HANDLERS_COUNT; i++) {
            TextHandler textHandler = new TextHandler(operationProvider, queue);
            Thread textHandlerThread = new Thread(textHandler);
            textHandlerThread.start();
        }

        Thread producerThread = new Thread(producer);
        producerThread.start();
    }
}
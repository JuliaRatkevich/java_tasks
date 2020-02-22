package com.julia;

import com.julia.Operation.Operation;

import java.util.concurrent.BlockingQueue;

public class TextHandler implements Runnable {
    private OperationProvider operationProvider;
    private BlockingQueue<String> blockingQueue;

    public TextHandler(OperationProvider operationProvider, BlockingQueue<String> blockingQueue) {
        this.operationProvider = operationProvider;
        this.blockingQueue = blockingQueue;
    }

    @Override
    public void run() {
        try {
            while (true) {
                String fileString = blockingQueue.take();
//                Thread.sleep(1000);
                if (fileString == "!!#EXIT#!!") {
                    return;
                }

                String[] stringPlusOperation = fileString.split("#");
                if (stringPlusOperation.length == 2) {
                    String operationName = stringPlusOperation[1];
                    Operation operation = operationProvider.getOperationByName(operationName);
                    if (operation != null) {
                        String result = operation.operate(stringPlusOperation[0]);
                        System.out.println(result + ": " + Thread.currentThread().getName());
                    }
                }
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}




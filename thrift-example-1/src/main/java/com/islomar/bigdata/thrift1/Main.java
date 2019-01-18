package com.islomar.bigdata.thrift1;

import org.apache.thrift.TException;
import org.apache.thrift.transport.TTransportException;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String... args) throws InterruptedException {
        new Main().run();
    }

    private void run() throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(5);

        startServer(executorService);

        startClient(executorService);

        Thread.sleep(2000);

        stopServer(executorService);
    }

    private void startClient(ExecutorService executorService) {
        Runnable runnableClientStartTask = () -> {
            try {
                new CrossPlatformClient().start();
            } catch (TException e) {
                e.printStackTrace();
            }
        };
        executorService.submit(runnableClientStartTask);
    }

    private void startServer(ExecutorService executorService) {
        Runnable runnableServerStartTask = () -> {
            try {
                new CrossPlatformServiceServer().start();
            } catch (TTransportException e) {
                e.printStackTrace();
            }
        };
        executorService.submit(runnableServerStartTask);
    }

    private void stopServer(ExecutorService executorService) {
        Runnable runnableServerStartTask = () -> new CrossPlatformServiceServer().stop();
        executorService.submit(runnableServerStartTask);
    }
}

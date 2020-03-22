package com.julia;

public class Main {

    public static void main(String[] args) throws Exception {
        BalancerServer server = new BalancerServer();
        server.start(6666);
    }
}

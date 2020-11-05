package com.phyleet.messageQueueDemo;

import java.io.IOException;
import java.net.ServerSocket;

public class ServerInit {
    public static void main(String[] args) throws IOException {
        ServerSocket socket = new ServerSocket(BrokerServer.SERVICE_PORT);
        while (true) {
            BrokerServer server = new BrokerServer(socket.accept());
            new Thread(server).start();
        }
    }
}

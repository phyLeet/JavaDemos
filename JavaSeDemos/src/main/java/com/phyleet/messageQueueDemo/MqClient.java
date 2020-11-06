package com.phyleet.messageQueueDemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class MqClient {
    private final static int SERVER_PORT = 9999;

    public static void produce(String msg) throws IOException {
        Socket socket = new Socket(InetAddress.getLocalHost(), SERVER_PORT);
        PrintWriter out = new PrintWriter(socket.getOutputStream());
        out.println(msg);
        out.flush();
        out.close();
    }

    public static String consume() throws IOException {
        Socket socket = new Socket(InetAddress.getLocalHost(), SERVER_PORT);
        String msg = "";
        try (BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
             PrintWriter out = new PrintWriter(socket.getOutputStream());) {
            out.println("CONSUME");
            out.flush();
            msg = in.readLine();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return msg;
    }
}

package net.tcp.thread;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(1000);

        while (true) {
            Socket accept = serverSocket.accept();
            Thread thread = new Thread(new ServerRunnable(accept));
            thread.start();
        }
    }
}

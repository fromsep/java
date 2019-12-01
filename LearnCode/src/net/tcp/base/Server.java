package net.tcp.base;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(10000);

        while (true) {
            Socket acceptSocket = serverSocket.accept();
            InputStream inputStream = acceptSocket.getInputStream();
            byte[] msg = new byte[1024];

            inputStream.read(msg);
            System.out.println(new String(msg));
            acceptSocket.close();
        }

        // serverSocket.close();
    }
}

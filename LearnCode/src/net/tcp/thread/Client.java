package net.tcp.thread;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1", 1000);

        OutputStream outputStream = socket.getOutputStream();

        outputStream.write("hello".getBytes());
        outputStream.close();

        socket.close();
    }
}

package net.tcp.base;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1", 10000);

        OutputStream outputStream = socket.getOutputStream();

        String msg = "hello world";
        outputStream.write(msg.getBytes());

        socket.close();
    }
}

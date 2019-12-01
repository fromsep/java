package net.tcp.console;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String line = scanner.nextLine();

            if (line.equals("bye")) {
                break;
            }

            Socket socket = new Socket("127.0.0.1", 20000);
            OutputStream outputStream = socket.getOutputStream();

            outputStream.write(line.getBytes());
            outputStream.close();
            socket.close();
        }
    }
}

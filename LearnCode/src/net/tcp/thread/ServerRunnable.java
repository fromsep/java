package net.tcp.thread;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class ServerRunnable implements Runnable {
    private Socket acceptSocket;

    public ServerRunnable(Socket accept) {
        this.acceptSocket = accept;
    }

    @Override
    public void run() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.acceptSocket.getInputStream()));
            String line;
            while ((line = bufferedReader.readLine())!= null) {
                System.out.println(line);
            }
            this.acceptSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

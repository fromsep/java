package net.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Sender {
    public static void main(String[] args) throws IOException {
        run();
    }

    private static void run() throws IOException {
        DatagramSocket datagramSocket = new DatagramSocket();
        String msg = "hello world";
        DatagramPacket datagramPacket = new DatagramPacket(msg.getBytes(), msg.length(), InetAddress.getByName("127.0.0.1"), 10000);
        datagramSocket.send(datagramPacket);
        datagramSocket.close();
    }
}
package net.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Receiver {
    public static void main(String[] args) throws IOException {
        run();
    }


    private static void run() throws IOException {
        DatagramSocket datagramSocket = new DatagramSocket(10000, InetAddress.getByName("127.0.0.1"));

        byte[] data = new byte[1024];
        DatagramPacket packet = new DatagramPacket(data, data.length);
        datagramSocket.receive(packet);

        data =  packet.getData();

        System.out.println(new String(data, 0, packet.getLength()));

        datagramSocket.close();
    }
}

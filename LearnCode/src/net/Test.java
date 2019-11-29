package net;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Test {
    public static void main(String[] args) throws UnknownHostException {
        testInetAddress();
    }

    private static void testInetAddress() throws UnknownHostException {
        InetAddress localHost = InetAddress.getLocalHost();

        String hostAddress = localHost.getHostAddress();
        String hostName = localHost.getHostName();
        String canonicalHostName = localHost.getCanonicalHostName();

        System.out.println(hostAddress);
        System.out.println(hostName);
        System.out.println(canonicalHostName);
    }
}

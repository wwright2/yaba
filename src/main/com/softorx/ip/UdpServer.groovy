package com.softorx.ip

import java.net.DatagramSocket
import java.net.InetAddress
import java.net.SocketException
import java.net.UnknownHostException
import java.net.DatagramPacket


/**
 *
 * Created by duvall on 2/17/14.
 */
import org.apache.log4j.Logger;

public abstract class UdpServer extends Thread {

    private int bufferSize; // in bytes
    protected DatagramSocket socket;
    private Logger log;
    private boolean truck;

    public UdpServer(port=5050,bufferSize) throws SocketException,UnknownHostException
    {
        log = Logger.getLogger(this.getClass());
        InetAddress localHost = InetAddress.getLocalHost();
        log.info("Server: "
                + localHost.getHostName() + "("
                + localHost.getHostAddress() + "): " + port);

        this.bufferSize = bufferSize;
        this.socket = new DatagramSocket(port);
        truck = true
    }

    public UdpServer(int port=5050) throws SocketException, UnknownHostException
    {
        this(port, 8192);
    }

    public void stopServer()
    {
        truck = false
        this.join(25)
    }

    public void run()
    {
        byte[] buffer = new byte[bufferSize];
        while (truck) {
            DatagramPacket incoming = new DatagramPacket(buffer, buffer.length);
            try {
                socket.receive(incoming)
                respond(incoming)
            } catch (IOException e) {
                log.error("Exception", e);
            }
            yield();
        } // end while
    } // end run

    public abstract void respond(DatagramPacket request);
}



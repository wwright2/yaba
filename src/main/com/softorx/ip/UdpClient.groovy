package com.softorx.ip

import java.net.*


/**
 * Created by duvall on 2/17/14.
 */
class UdpClient {

    UdpClient()
    {
        // UDP client
        data = "Hello".getBytes("ASCII")
        addr = InetAddress.getByName("localhost")
        port = 5000
        packet = new DatagramPacket(data, data.length, addr, port)
        socket = new DatagramSocket()

        socket.send(packet)
        socket.setSoTimeout(30000) // block for no more than 30 seconds
        buffer = (' ' * 4096) as byte[]
        response = new DatagramPacket(buffer, buffer.length)

        //socket.receive(response)
        //s = new String(response.data, 0, response.length)
        //println "Server said: '$s'"
        // => Server said: 'Client said: 'Original Message''
        socket.close()
    }

}

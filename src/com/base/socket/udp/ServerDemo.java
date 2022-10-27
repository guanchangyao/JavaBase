package com.base.socket.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class ServerDemo {
    public static void main(String[] args) throws IOException {
        //创建接收的对象
        DatagramSocket datagramSocket=new DatagramSocket(10086);
        //创建接收的数据包
        byte[] bytes=new byte[1024];
        DatagramPacket datagramPacket=new DatagramPacket(bytes,bytes.length);
        datagramSocket.receive(datagramPacket);
        byte[] data = datagramPacket.getData();
        System.out.println(new String(data,0,data.length));
        datagramSocket.close();
    }
}

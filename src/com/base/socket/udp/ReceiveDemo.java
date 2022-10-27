package com.base.socket.udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * UDP 接收端
 */
public class ReceiveDemo {
    public static void main(String[] args) throws  Exception {
        //创建接收端的对象
        DatagramSocket datagramSocket=new DatagramSocket(10086);
        byte[] bytes=new byte[1024];
        //创建一个数据包
        DatagramPacket datagramPacket=new DatagramPacket(bytes, bytes.length);
        //将接收到的数据放入数据包
        datagramSocket.receive(datagramPacket);
        //打印数据包的数据
        System.out.println("接收的数据为:"+new String(datagramPacket.getData(),0,datagramPacket.getLength()));
    }
}

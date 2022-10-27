package com.base.socket.udp;

import java.io.IOException;
import java.net.*;

/**
 * UDP 发送端
 */
public class SendDemo {
    public static void main(String[] args) throws IOException {
        //创建通道
        DatagramSocket socket=new DatagramSocket();
        byte[] bytes = "HELLO ".getBytes();
        InetAddress address=InetAddress.getByName("127.0.0.1");
        //创建数据包
        DatagramPacket datagramPacket=new DatagramPacket(bytes,bytes.length,address,10086);
        //发送数据
        socket.send(datagramPacket);
        //释放资源
        socket.close();
    }
}

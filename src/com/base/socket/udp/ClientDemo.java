package com.base.socket.udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author guancy
 * @version 1.0
 * @project JavaBase
 * @description
 * @date 2022/10/26 19:37:34
 */
public class ClientDemo {
    
    public static void main(String[] args) throws Exception {
        //创建链接通道
        DatagramSocket datagramSocket=new DatagramSocket();
        //创建数据包
        byte[] bytes= "hello 广播".getBytes();
        InetAddress byName = InetAddress.getByName("255.255.255.255");
        DatagramPacket datagramPacket=new DatagramPacket(bytes,bytes.length,byName,10086);
        //发送数据
        datagramSocket.send(datagramPacket);
        //释放资源
        datagramSocket.close();
    }
}

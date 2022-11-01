package com.base.socket.tcp;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author guancy
 * @version 1.0
 * @project JavaBase
 * @description Tcp 练习服务器1
 * @date 2022/10/27 19:25:22
 */
public class ServerDemo1 {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket=new ServerSocket(10086);
        Socket socket = serverSocket.accept();
        InputStream inputStream = socket.getInputStream();
        int b;
        while ((b=inputStream.read())!=-1){
            System.out.println((char)b);
        }
        inputStream.close();
        socket.close();
        serverSocket.close();
    }
}

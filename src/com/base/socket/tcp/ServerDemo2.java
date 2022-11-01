package com.base.socket.tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author guancy
 * @version 1.0
 * @project JavaBase
 * @description 客户端发送数据 服务器给出反馈
 * @date 2022/10/27 19:32:37
 */
public class ServerDemo2 {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket=new ServerSocket(10086);
        Socket socket = serverSocket.accept();
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader( socket.getInputStream()));
        String line;
        while ((line=bufferedReader.readLine())!=null){
            System.out.println(line);
        }
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("我收到数据了，你退下吧".getBytes());
        outputStream.close();
        bufferedReader.close();
        socket.close();
        serverSocket.close();
    }
}

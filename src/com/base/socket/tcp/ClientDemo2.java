package com.base.socket.tcp;

import java.io.*;
import java.net.Socket;

/**
 * @author guancy
 * @version 1.0
 * @project JavaBase
 * @description 客户端发送数据 服务器给出反馈
 * @date 2022/10/27 19:32:07
 */
public class ClientDemo2 {
    public static void main(String[] args) throws IOException {
        Socket socket=new Socket("127.0.0.1",10086);
        //客户端发送数据
        byte[] bytes = "我是客户端发送来的数据".getBytes();
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write(bytes);
        socket.shutdownOutput();

        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String line;
        while ((line=bufferedReader.readLine())!=null){
            System.out.println(line);
        }
        bufferedReader.close();
        outputStream.close();
        socket.close();
    }
}

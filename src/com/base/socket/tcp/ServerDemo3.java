package com.base.socket.tcp;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author guancy
 * @version 1.0
 * @project JavaBase
 * @description Tcp练习传输文件
 * @date 2022/11/1 19:02:42
 */
public class ServerDemo3 {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket=new ServerSocket(10086);
        Socket socket = serverSocket.accept();
        BufferedInputStream bis=new BufferedInputStream(socket.getInputStream());
        BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("src/com/base/resource/img/copy.png"));
        int b;
        while((b=bis.read())!=-1){
            bos.write(b);
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        bufferedWriter.write("上传成功");
        bufferedWriter.close();
        bos.close();
        bis.close();
        socket.close();
        serverSocket.close();
    }
}

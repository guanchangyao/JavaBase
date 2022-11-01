package com.base.socket.tcp;

import java.io.*;
import java.net.Socket;

/**
 * @author guancy
 * @version 1.0
 * @project JavaBase
 * @description tcp练习传输文件
 * @date 2022/11/1 19:01:56
 */
public class ClientDemo3 {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1", 10086);
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("src/com/base/resource/img/default.png"));
        BufferedOutputStream bos=new BufferedOutputStream(socket.getOutputStream());
        int b;
        while ((b=bufferedInputStream.read())!=-1){
            bos.write(b);
        }
        bos.flush();
        socket.shutdownOutput();
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String line;
        while ((line=bufferedReader.readLine())!=null){
            System.out.println(line);
        }
        bufferedReader.close();
        bos.close();
        bufferedInputStream.close();
        socket.close();
    }

}

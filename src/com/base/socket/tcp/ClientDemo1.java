package com.base.socket.tcp;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @author guancy
 * @version 1.0
 * @project JavaBase
 * @description
 * @date 2022/10/27 19:24:37
 */
public class ClientDemo1 {
    public static void main(String[] args) throws IOException {
        Socket socket=new Socket("127.0.0.1",10086);
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("hello 服务器".getBytes());
        outputStream.close();
        socket.close();
    }
}

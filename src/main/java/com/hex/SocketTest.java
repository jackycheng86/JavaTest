package com.hex;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class SocketTest {

	public static void socketTest() throws IOException {
		// TODO Auto-generated method stub
		// 为了简单起见，所有的异常都直接往外抛
		String host = "127.0.0.1"; // 要连接的服务端IP地址
		int port = 3000; // 要连接的服务端对应的监听端口
		// 与服务端建立连接
		Socket client = new Socket(host, port);
		// 建立连接后就可以往服务端写数据了
		OutputStream writer = client.getOutputStream();
		String send="7F4AF00000000026520000000000007F7B22557365724E616D65223A22455A434153222C2250617373776F7264223A2254485446227D";
		writer.write(send.getBytes("UTF-8"));
		writer.flush();
		// 写完以后进行读操作
		InputStream reader = client.getInputStream();
		byte[] rs=new byte[client.getReceiveBufferSize()];
		reader.read(rs);
		System.out.println("来自服务端的数据: " + new String(rs));
		writer.close();
		reader.close();
		client.close();
	}

}

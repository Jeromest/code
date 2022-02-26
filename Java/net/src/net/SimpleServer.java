package net;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;


public class SimpleServer {

	public static void main(String[] args) {
		ServerSocket server=null;
		Socket socket=null;
		DataOutputStream out=null;
		DataInputStream in=null;
		InetAddress iaddress=null;
		int port=4300;			//服务器端监听的端口号，自己设定
		String requestStr, responseStr;
		try {
			server=new ServerSocket(port);
			System.out.println("服务器启动成功，等待用户请求....");
		} catch(IOException e) {
			e.printStackTrace();
		}
		try {
			socketS=server.accept();
			iaddress=socketS.getInetAddress();
			System.out.println("收到用户建立连接请求，客户端地址："+iaddress);
			
			in=new DataInputStream(socketS.getInputStream());
			out=new DataOutputStream(socketS.getOutputStream());
			
			requestStr=in.readUTF();
			System.out.println("服务器端收到请求信息："+requestStr);
			
			responseStr="你好，已收到发来的信息["+requestStr+"]";
			out.writeUTF(responseStr);
			System.out.println("服务器端返回响应信息："+responseStr);
			
			in.close();
			out.close();
			socket.close();
			System.out.println("断开网络连接，服务结束！");
		} catch(IOException e) {
			e.printStackTrace();
		}

	}

}

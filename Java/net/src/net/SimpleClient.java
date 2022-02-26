package net;


import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;


public class SimpleClient {

	public static void main(String[] args) {
		Socket socketC=null;
		DataOutputStream out=null;
		DataInputStream in=null;
		String ip="127.0.0.1";				//客户端请求的服务器IP地址
		int port=4300;						//客户端请求的服务器端口号
		String requestStr, responseStr;
		
		try {
			socketC=new Socket(ip, port);
			System.out.println("连接服务器成功！");
		}catch(Exception e) {
			e.printStackTrace();
		}
		try {
			out=new DataOutputStream(socketC.getOutputStream());
			in=new DataInputStream(socketC.getInputStream());
			
			requestStr="一个测试请求信息";
			out.writeUTF(requestStr);
			System.out.println("客户端发送请求信息："+requestStr);
			
			responseStr=in.readUTF();
			System.out.println("客户端收到响应信息："+responseStr);
			
			in.close();
			out.close();
			socketC.close();
			System.out.println("断开网络连接，请求结束！");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}

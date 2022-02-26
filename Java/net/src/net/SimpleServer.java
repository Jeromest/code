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
		int port=4300;			//�������˼����Ķ˿ںţ��Լ��趨
		String requestStr, responseStr;
		try {
			server=new ServerSocket(port);
			System.out.println("�����������ɹ����ȴ��û�����....");
		} catch(IOException e) {
			e.printStackTrace();
		}
		try {
			socketS=server.accept();
			iaddress=socketS.getInetAddress();
			System.out.println("�յ��û������������󣬿ͻ��˵�ַ��"+iaddress);
			
			in=new DataInputStream(socketS.getInputStream());
			out=new DataOutputStream(socketS.getOutputStream());
			
			requestStr=in.readUTF();
			System.out.println("���������յ�������Ϣ��"+requestStr);
			
			responseStr="��ã����յ���������Ϣ["+requestStr+"]";
			out.writeUTF(responseStr);
			System.out.println("�������˷�����Ӧ��Ϣ��"+responseStr);
			
			in.close();
			out.close();
			socket.close();
			System.out.println("�Ͽ��������ӣ����������");
		} catch(IOException e) {
			e.printStackTrace();
		}

	}

}

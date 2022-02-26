package net;


import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;


public class SimpleClient {

	public static void main(String[] args) {
		Socket socketC=null;
		DataOutputStream out=null;
		DataInputStream in=null;
		String ip="127.0.0.1";				//�ͻ�������ķ�����IP��ַ
		int port=4300;						//�ͻ�������ķ������˿ں�
		String requestStr, responseStr;
		
		try {
			socketC=new Socket(ip, port);
			System.out.println("���ӷ������ɹ���");
		}catch(Exception e) {
			e.printStackTrace();
		}
		try {
			out=new DataOutputStream(socketC.getOutputStream());
			in=new DataInputStream(socketC.getInputStream());
			
			requestStr="һ������������Ϣ";
			out.writeUTF(requestStr);
			System.out.println("�ͻ��˷���������Ϣ��"+requestStr);
			
			responseStr=in.readUTF();
			System.out.println("�ͻ����յ���Ӧ��Ϣ��"+responseStr);
			
			in.close();
			out.close();
			socketC.close();
			System.out.println("�Ͽ��������ӣ����������");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}

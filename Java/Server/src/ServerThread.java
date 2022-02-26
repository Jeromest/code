//服务器端线程类ServerThread
import java.net.*;
import java.io.*;
import java.util.*;
public class ServerThread extends Thread {
	Socket socket;
	boolean HAVE = false;
	String clientName;
	DataInputStream in = null;
	DataOutputStream out = null;
	String s = null;
	//ClientList clientList;
	//ClientNode pC;
	//ServerThread(Socket soc, ClientList list){
		socket = soc;
		//clientList = list;
		clientName = String.valueOf(socket.getInetAddress());
		try {
			in = new DataInputStream(socket.getInputStream());
			out = new DataOutputStream(socket.getOutputStream());
		}catch(IOException e) {}
	}
	//public void run() {
	//	clientList.inList(this);
		pC = clientList.getHead();
		pC = pC.next;
		System.out.println("客户列表：\n");
		while(pC!=null) {
			System.out.println(""+pC.thread.getName());
			pC = pC.next;
		}
		try {
			s = in.readUTF();
		//}catch(IOException e) {}
		String str = "#toAll";
		if(s.equals(str)) {
			while(true) {
				try {
					s = in.readUTF();
	//			}
			}
		}
	}

}

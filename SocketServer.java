package keyWordTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServer {
//	��1-1024֮����ѡһ���˿ں�
	public static final int PORT=8080;
	public static void main(String[] args) throws Exception{
		ServerSocket s=new ServerSocket(PORT);
		System.out.print("Started:"+s);
		try {
			Socket socket=s.accept();
			try {
				System.out.println("Connection accepted:"+socket);
				BufferedReader in=new BufferedReader(
						new InputStreamReader(socket.getInputStream()));
//				ͨ��PrintWriter�Զ�ˢ�����
				PrintWriter out=new PrintWriter(new BufferedWriter
						(new OutputStreamWriter(socket.getOutputStream())),true);
				while(true) {
					String str=in.readLine();
					if(str.equals("END")) break;
					System.out.println("Echoing:"+str);
					out.println(str);
				}
//				һֱ��Ҫ�ر�����Socket
			}finally {
				System.out.print("Closing....");
				socket.close();
			}
		}finally {
			s.close();
		}
	}

}

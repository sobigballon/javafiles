package keyWordTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;

public class SocketClient {
	public static void main(String[] args) throws Exception{
		InetAddress addr=InetAddress.getByName(null);
		System.out.println("addr="+addr);
		Socket socket=new Socket(addr,SocketServer.PORT);
		try{
			System.out.println("socket="+socket);
			BufferedReader in=new BufferedReader(
					new InputStreamReader(socket.getInputStream()));
//			设置PrintWriter的自动刷新
			PrintWriter out=new PrintWriter(new BufferedWriter
					(new OutputStreamWriter(socket.getOutputStream())),true);
			for(int i=0;i<10;i++) {
				out.println("howdy"+i);
				String str=in.readLine();
				System.out.println(str);
			}
			out.print("END");
		}finally {
			System.out.println("closing.....");
			socket.close();
		}
	}

}

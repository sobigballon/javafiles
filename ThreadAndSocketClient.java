package keyWordTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;

public class ThreadAndSocketClient {
	static final int MAX_THREADS=40;
	public static void main(String[] args) throws 
	IOException ,InterruptedException{
//		使用默认的本机端口号
		InetAddress addr=InetAddress.getByName(null);
		while(true) {
			if(ScoketClientThread.threadCount()<MAX_THREADS)
				new ScoketClientThread(addr);
			Thread.currentThread().sleep(100);
		}
	}

}

class ScoketClientThread extends Thread{
	private Socket socket;
	private BufferedReader in;
	private PrintWriter out;
	private static int counter=0;
	private int id=counter++;
	private static int threadcount=0;
	public static int threadCount() {
		return threadcount;
	}
	
	public ScoketClientThread(InetAddress addr) {
		System.out.println("Making client "+id);
		threadcount++;
		try{
			socket=new Socket(addr,SocketServer.PORT);
//		如果创建失败，不用清楚任何东西
		}catch(IOException e) {}
		try {
			in=new BufferedReader(
					new InputStreamReader(socket.getInputStream()));
			out=new PrintWriter(new BufferedWriter
					(new OutputStreamWriter(socket.getOutputStream())),true);
			start();
		}catch(IOException e) {
			try {
				socket.close();
			}catch(IOException e2) {}
		}
	}
	public void run() {
		try {
			for(int i=0;i<25;i++) {
				out.println("Client"+id+":"+i);
				String str=in.readLine();
				System.out.println(str);
			}
			out.println("END");
		}catch(IOException e) {
		}finally {
			try {
				socket.close();
			}catch(IOException e) {}
			threadcount--;
		}
	}
}

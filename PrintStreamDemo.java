package someotherTest;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class PrintStreamDemo {
	public static void main(String[] args) throws FileNotFoundException {
		PrintStream ps=new PrintStream("d:\\java.txt");
		ps.print("hello!");
		ps.append("\r\n");
		ps.print("world!");
		ps.append("\r\n");
		ps.append("hello!\r\n");
		ps.write(100);
		ps.close();
		
		PrintWriter pw=new PrintWriter("d:\\java2.txt");
		pw.write("this");
		pw.print("\r\n");
		pw.flush();
		pw.write("is");
		pw.print("\r\n");
		pw.flush();
		pw.write("good!");
		pw.print("\r\n");
		pw.close();
	}

}

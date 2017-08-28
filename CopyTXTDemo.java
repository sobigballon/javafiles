package someotherTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * 复制文本文件(9种，而我们选择字符流，就用5种方式实现)
 * A:基本字符流一次一个字符
 * B:基本字符流一次一个字符数组
 * C:高效字符流一次一个字符
 * D:高效字符流一次一个字符数组
 * E:高效字符流一次一个字符串
 * 
 * 数据源：
 * 		d:\\a.txt
 * 目的地：
 * 		d:\\b.txt
 */

public class CopyTXTDemo {	
	public static void main(String[] args) throws IOException {
		BAc();
		BAch();
		GAc();
		GAch();
		GAst();
		
	}
	
//	基本字符流一次一个字符
	public static void BAc() throws IOException {
		FileReader fr=new FileReader("d:\\a.txt");
		FileWriter fw=new FileWriter("d:\\b.txt");
		int len=0;
		while((len=fr.read())!=-1) {
			fw.write(len);
		}
		fr.close();
		fw.close();
	}
	
//	基本字符流一次一个字符数组
	public static void BAch() throws IOException {
		FileReader fr=new FileReader("d:\\a.txt");
		FileWriter fw=new FileWriter("d:\\b2.txt");
		char[] ch=new char[1024];
		int len=0;
		while((len=fr.read(ch))!=-1) {
			fw.write(ch,0,len);
		}
		fr.close();
		fw.close();
	}
	
//	高效字符流一次一个字符
	public static void GAc() throws IOException{
		BufferedReader bfr=new BufferedReader(new FileReader("d:\\a.txt"));
		BufferedWriter bfw=new BufferedWriter(new FileWriter("d:\\b3.txt"));
		int len=0;
		while((len=bfr.read())!=-1) {
			bfw.write(len);
		}
		bfr.close();
		bfw.close();
	}
	
//	高效字符流一次一个字符数组	
	public static void GAch() throws IOException{
		BufferedReader bfr=new BufferedReader(new FileReader("d:\\a.txt"));
		BufferedWriter bfw=new BufferedWriter(new FileWriter("d:\\b4.txt"));
		char[] ch=new char[1024];
		int len=0;
		while((len=bfr.read(ch))!=-1) {
			bfw.write(ch,0,len);
		}
		bfr.close();
		bfw.close();
	}
	
//	高效字符流一次一个字符串
	public static void GAst() throws IOException{
		BufferedReader bfr=new BufferedReader(new FileReader("d:\\a.txt"));
		BufferedWriter bfw=new BufferedWriter(new FileWriter("d:\\b5.txt"));
		String s=null;
		while((s=bfr.readLine())!=null) {
			bfw.write(s);
			bfw.newLine();
			bfw.flush();
		}
		bfr.close();
		bfw.close();
	}
	
}

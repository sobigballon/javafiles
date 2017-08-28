package someotherTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * �����ı��ļ�(9�֣�������ѡ���ַ���������5�ַ�ʽʵ��)
 * A:�����ַ���һ��һ���ַ�
 * B:�����ַ���һ��һ���ַ�����
 * C:��Ч�ַ���һ��һ���ַ�
 * D:��Ч�ַ���һ��һ���ַ�����
 * E:��Ч�ַ���һ��һ���ַ���
 * 
 * ����Դ��
 * 		d:\\a.txt
 * Ŀ�ĵأ�
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
	
//	�����ַ���һ��һ���ַ�
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
	
//	�����ַ���һ��һ���ַ�����
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
	
//	��Ч�ַ���һ��һ���ַ�
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
	
//	��Ч�ַ���һ��һ���ַ�����	
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
	
//	��Ч�ַ���һ��һ���ַ���
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

package someotherTest;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 字节输入流读数据步骤：
 * A:创建字节输入流对象
 * B:调用方法，读取数据
 * C:释放资源
 * 
 * 字节输入流读取数据有两种方式:
 * A:一次读取一个字节
 * B:一次读取一个字节数组
 * 
 * 一次读取一个字节：public int read()
 */

public class FileInputStreamDemo {
	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("d:\\java.txt");
//		按字节读取方式
//		按中文编码转换为字符流
		InputStreamReader isr=new InputStreamReader(fis,"GBK");
		int b=0;
		while((b=isr.read())!=-1) {
		System.out.println((char)b);
		}
		fis.close();
		isr.close();
//		按字节数组方式读取
		FileInputStream fis2=new FileInputStream("d:\\java.txt");
		byte[] by=new byte[1024*1024];
//		int len=fis.read(by);
//		System.out.println(new String(by,0,len));
		int len=0;
		while((len=fis2.read(by))!=-1) {
			System.out.print(new String(by,0,len));
		}
		fis2.close();	
		
	}

}

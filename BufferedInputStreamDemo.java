package someotherTest;
/* 字节缓冲输入流
* 		BufferedInputStream
* 字节缓冲输出流
* 		BufferedOutputStream
* 由于它们不能直接操作文件，是建立在流之上的，所以也叫高级流
*/

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedInputStreamDemo {
	public static void main(String[] args) throws IOException{
//		创建输入字符缓冲流
		BufferedInputStream bfio=new BufferedInputStream(new FileInputStream("d:\\java.txt"));
//		单字节读取
//		按中文编码转换字节流(转换流)
		InputStreamReader ifr=new InputStreamReader(bfio,"GBK");
		int b=ifr.read();
		while((b=ifr.read())!=-1) {
			System.out.println((char)b);
		}
		
		bfio.close();
		ifr.close();
		System.out.println("单字节读取操作完成！");
		
//		字节数组读取
		BufferedInputStream bfio2=new BufferedInputStream(new FileInputStream("d:\\java.txt"));
		byte[] by=new byte[1024];
		int len=0;
		while((len=bfio2.read(by))!=-1) {
			System.out.println(new String(by,0,len));
		}
		bfio2.close();
		System.out.println("字节数组读取操作完成！");
	}


}

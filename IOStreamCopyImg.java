package someotherTest;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOStreamCopyImg {
	public static void main(String[] args) throws IOException{
//		创建输入流
		FileInputStream fis=new FileInputStream("d:\\闭月羞花.bmp");
//		创建输出流
		FileOutputStream fos=new FileOutputStream("c:\\林青霞.bmp");
		byte[] by=new byte[1024*1024];
		int len=0;
		while((len=fis.read(by))!=-1) {
			fos.write(by, 0, len);
		}
		
		fis.close();
		fos.close();
		System.out.println("复制成功！");
	}

}

package someotherTest;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOStreamCopyImg {
	public static void main(String[] args) throws IOException{
//		����������
		FileInputStream fis=new FileInputStream("d:\\�����߻�.bmp");
//		���������
		FileOutputStream fos=new FileOutputStream("c:\\����ϼ.bmp");
		byte[] by=new byte[1024*1024];
		int len=0;
		while((len=fis.read(by))!=-1) {
			fos.write(by, 0, len);
		}
		
		fis.close();
		fos.close();
		System.out.println("���Ƴɹ���");
	}

}

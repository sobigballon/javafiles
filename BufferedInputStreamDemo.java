package someotherTest;
/* �ֽڻ���������
* 		BufferedInputStream
* �ֽڻ��������
* 		BufferedOutputStream
* �������ǲ���ֱ�Ӳ����ļ����ǽ�������֮�ϵģ�����Ҳ�и߼���
*/

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedInputStreamDemo {
	public static void main(String[] args) throws IOException{
//		���������ַ�������
		BufferedInputStream bfio=new BufferedInputStream(new FileInputStream("d:\\java.txt"));
//		���ֽڶ�ȡ
//		�����ı���ת���ֽ���(ת����)
		InputStreamReader ifr=new InputStreamReader(bfio,"GBK");
		int b=ifr.read();
		while((b=ifr.read())!=-1) {
			System.out.println((char)b);
		}
		
		bfio.close();
		ifr.close();
		System.out.println("���ֽڶ�ȡ������ɣ�");
		
//		�ֽ������ȡ
		BufferedInputStream bfio2=new BufferedInputStream(new FileInputStream("d:\\java.txt"));
		byte[] by=new byte[1024];
		int len=0;
		while((len=bfio2.read(by))!=-1) {
			System.out.println(new String(by,0,len));
		}
		bfio2.close();
		System.out.println("�ֽ������ȡ������ɣ�");
	}


}

package someotherTest;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * �ֽ������������ݲ��裺
 * A:�����ֽ�����������
 * B:���÷�������ȡ����
 * C:�ͷ���Դ
 * 
 * �ֽ���������ȡ���������ַ�ʽ:
 * A:һ�ζ�ȡһ���ֽ�
 * B:һ�ζ�ȡһ���ֽ�����
 * 
 * һ�ζ�ȡһ���ֽڣ�public int read()
 */

public class FileInputStreamDemo {
	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("d:\\java.txt");
//		���ֽڶ�ȡ��ʽ
//		�����ı���ת��Ϊ�ַ���
		InputStreamReader isr=new InputStreamReader(fis,"GBK");
		int b=0;
		while((b=isr.read())!=-1) {
		System.out.println((char)b);
		}
		fis.close();
		isr.close();
//		���ֽ����鷽ʽ��ȡ
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

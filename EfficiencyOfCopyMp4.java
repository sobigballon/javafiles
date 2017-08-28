package someotherTest;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 
 * ����һ��MP4�����ַ�ʽ�ĺ�ʱ�Ƚϣ�
 * A:�����ֽ���һ�ζ�дһ���ֽ�	
 * B:�����ֽ���һ�ζ�дһ���ֽ�����	
 * C:��Ч�ֽ���һ�ζ�дһ���ֽ�	
 * D:��Ч�ֽ���һ�ζ�дһ���ֽ�����	
 */

public class EfficiencyOfCopyMp4 {
	public static void main(String[] args) throws IOException {
		BAb();
		BAby();
		GAb();
		GAby();
		
	}
	
//	�����ֽ���һ�ζ�дһ���ֽ�
	public static void BAb() throws IOException {
		long starttime=System.currentTimeMillis();
		FileInputStream fis=new FileInputStream("d:\\��������.mp4");
		FileOutputStream fos=new FileOutputStream("c:\\��������.mp4");
		int b=0;
		while((b=fis.read())!=-1) {
			fos.write(b);
		}
		fis.close();
		fos.close();
		long endtime=System.currentTimeMillis();
		System.out.println("��һ�ַ�������ʱ:"+(endtime-starttime)+"����");
		
	}
	
//	�����ֽ���һ�ζ�дһ���ֽ�����
	public static void  BAby() throws IOException{
		long starttime=System.currentTimeMillis();
		FileInputStream fis=new FileInputStream("d:\\��������.mp4");
		FileOutputStream fos=new FileOutputStream("c:\\��������2.mp4");
		byte[] by=new byte[1024*1024];
		int len=0;
		while((len=fis.read(by))!=-1) {
			fos.write(by,0,len);
		}
		fis.close();
		fos.close();
		long endtime=System.currentTimeMillis();
		System.out.println("�ڶ��ַ�������ʱ:"+(endtime-starttime)+"����");
	}
//	��Ч�ֽ���һ�ζ�дһ���ֽ�
	public static void GAb() throws IOException{
		long starttime=System.currentTimeMillis();
		BufferedInputStream bfis=new BufferedInputStream(new FileInputStream("d:\\��������.mp4"));
		BufferedOutputStream bfos=new BufferedOutputStream(new FileOutputStream("c:\\��������3.mp4"));
		int b=0;
		while((b=bfis.read())!=-1) {
			bfos.write(b);
		}
		
		bfis.close();
		bfos.close();
		long endtime=System.currentTimeMillis();
		System.out.println("�����ַ�������ʱ:"+(endtime-starttime)+"����");
	}
	
//	��Ч�ֽ���һ�ζ�дһ���ֽ�����
	public static void GAby() throws IOException{
		long starttime=System.currentTimeMillis();
		BufferedInputStream bfis=new BufferedInputStream(new FileInputStream("d:\\��������.mp4"));
		BufferedOutputStream bfos=new BufferedOutputStream(new FileOutputStream("c:\\��������4.mp4"));
		byte[] by=new byte[1024*1024];
		int len=0;
		while((len=bfis.read(by))!=-1) {
			bfos.write(by,0,len);
		}
		
		bfis.close();
		bfos.close();
		long endtime=System.currentTimeMillis();
		System.out.println("�����ַ�������ʱ:"+(endtime-starttime)+"����");
	}
}

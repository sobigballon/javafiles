package someotherTest;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 
 * 复制一个MP4，四种方式的耗时比较：
 * A:基本字节流一次读写一个字节	
 * B:基本字节流一次读写一个字节数组	
 * C:高效字节流一次读写一个字节	
 * D:高效字节流一次读写一个字节数组	
 */

public class EfficiencyOfCopyMp4 {
	public static void main(String[] args) throws IOException {
		BAb();
		BAby();
		GAb();
		GAby();
		
	}
	
//	基本字节流一次读写一个字节
	public static void BAb() throws IOException {
		long starttime=System.currentTimeMillis();
		FileInputStream fis=new FileInputStream("d:\\哥有老婆.mp4");
		FileOutputStream fos=new FileOutputStream("c:\\哥有老婆.mp4");
		int b=0;
		while((b=fis.read())!=-1) {
			fos.write(b);
		}
		fis.close();
		fos.close();
		long endtime=System.currentTimeMillis();
		System.out.println("第一种方法共耗时:"+(endtime-starttime)+"毫秒");
		
	}
	
//	基本字节流一次读写一个字节数组
	public static void  BAby() throws IOException{
		long starttime=System.currentTimeMillis();
		FileInputStream fis=new FileInputStream("d:\\哥有老婆.mp4");
		FileOutputStream fos=new FileOutputStream("c:\\哥有老婆2.mp4");
		byte[] by=new byte[1024*1024];
		int len=0;
		while((len=fis.read(by))!=-1) {
			fos.write(by,0,len);
		}
		fis.close();
		fos.close();
		long endtime=System.currentTimeMillis();
		System.out.println("第二种方法共耗时:"+(endtime-starttime)+"毫秒");
	}
//	高效字节流一次读写一个字节
	public static void GAb() throws IOException{
		long starttime=System.currentTimeMillis();
		BufferedInputStream bfis=new BufferedInputStream(new FileInputStream("d:\\哥有老婆.mp4"));
		BufferedOutputStream bfos=new BufferedOutputStream(new FileOutputStream("c:\\哥有老婆3.mp4"));
		int b=0;
		while((b=bfis.read())!=-1) {
			bfos.write(b);
		}
		
		bfis.close();
		bfos.close();
		long endtime=System.currentTimeMillis();
		System.out.println("第三种方法共耗时:"+(endtime-starttime)+"毫秒");
	}
	
//	高效字节流一次读写一个字节数组
	public static void GAby() throws IOException{
		long starttime=System.currentTimeMillis();
		BufferedInputStream bfis=new BufferedInputStream(new FileInputStream("d:\\哥有老婆.mp4"));
		BufferedOutputStream bfos=new BufferedOutputStream(new FileOutputStream("c:\\哥有老婆4.mp4"));
		byte[] by=new byte[1024*1024];
		int len=0;
		while((len=bfis.read(by))!=-1) {
			bfos.write(by,0,len);
		}
		
		bfis.close();
		bfos.close();
		long endtime=System.currentTimeMillis();
		System.out.println("第四种方法共耗时:"+(endtime-starttime)+"毫秒");
	}
}

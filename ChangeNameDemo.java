package someotherTest;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * ���Ƶ����ļ�����ָ���ļ����޸��ļ�����
 * ���󣺰�d:\\java�ļ����µ�����java�ļ����Ƶ�d:\\jadĿ¼�£����޸ĺ�׺��Ϊjad��
 * 
 * ������
 * 		A:��װ����ԴĿ¼
 * 		B:��װĿ�ĵ�Ŀ¼
 * 		C:��ȡ����ԴĿ¼�µ������ļ���File����
 * 		D:����File����,�õ�ÿһ��File����
 * 		E:���Ƽ���
 * 			����Դ��d:\\java\\ForDemo.java
 * 			Ŀ�ĵأ�d:\\jad\\ForDemo.jad
 */

public class ChangeNameDemo {
	public static void main(String[] args) throws IOException {
//		��װ����ԴĿ¼
		File srFoler=new File("d:\\java");
//		��װĿ�ĵ�Ŀ¼
		File tarFoler=new File("d:\\jad");
		if(!tarFoler.exists()) {
			tarFoler.mkdir();
		}
//		��ȡ����ԴĿ¼�µ������ļ���File����
		File[] sf=srFoler.listFiles();
//		����File����,�õ�ÿһ��File����	
		for(File f:sf) {
			String name=f.getName();
			name=name.replace(".java", ".jad");
			File newfile=new File(tarFoler,name);
			
			copy(f,newfile);
		}
		
	}
	
	public static void copy(File f,File newfile) throws IOException{
		BufferedInputStream bis=new BufferedInputStream(new FileInputStream(f));
		BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream(newfile));
		byte[] by=new byte[1024];
		int len=0;
		while((len=bis.read(by))!=-1) {
			bos.write(by, 0, len);
		}
		
		bis.close();
		bos.close();
	}

}

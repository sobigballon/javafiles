package someotherTest;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*FileOutputStream�Ĺ��췽����
* 		FileOutputStream(File file)
* 		FileOutputStream(String name)
* 
* �ֽ�������������裺
* 		A:�����ֽ����������
* 		B:����д���ݹ���д����
* 		C:�ͷ���Դ
* 
* ��ϰ������ֽڵ�����д��һ���ı��ļ�
*/

public class FileOutputStreamDemo {
	public static void main(String[] args){
		FileOutputStream fos=null;
//		�������������
		try {
			fos=new FileOutputStream("d:\\java.txt");
			}catch (FileNotFoundException e) {
				System.out.println("�����ļ�ʧ�ܣ�");
			}
//		����д���ܣ�д��
	    try {
	    	fos.write("����ͨ������д��һ�仰".getBytes());
	        }catch(IOException e) {
	        	System.out.println("д���ֽ�ʧ�ܣ�");
	        }
//		����close()�ͷ���Դ
	    try {
	    	fos.close();
	    	}catch(IOException e) {
	    		System.out.println("�ͷ���Դʧ�ܣ�");
	    	}
		System.out.println("д��ɹ�!");
		
//		public FileOutputStream(String name,boolean append)
//		�����ֽ�������ʵ��׷��д�벢����
		FileOutputStream fos2=null;
		try {
			fos2=new FileOutputStream("d:\\java2.txt",true);
			}catch(FileNotFoundException e) {
				System.out.println("�����ļ�ʧ�ܣ�");
			}
//		ѭ��׷��д��
		for(int i=1;i<=10;i++) {
			try {
				fos2.write(("����һ�仰����Ҫд10�Σ����ǵ�"+i+"\r\n").getBytes());
			}catch(IOException e) {
				System.out.println("д���ֽ�ʧ�ܣ�");
			}
		}
		try {
			fos2.close();
			}catch(IOException e) {
				System.out.println("�ͷ���Դʧ�ܣ�");
			}
		
		System.out.println("д��ɹ�!");
	}
}

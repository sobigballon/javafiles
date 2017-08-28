package someotherTest;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*FileOutputStream的构造方法：
* 		FileOutputStream(File file)
* 		FileOutputStream(String name)
* 
* 字节输出流操作步骤：
* 		A:创建字节输出流对象
* 		B:调用写数据功能写数据
* 		C:释放资源
* 
* 练习：请把字节的名字写到一个文本文件
*/

public class FileOutputStreamDemo {
	public static void main(String[] args){
		FileOutputStream fos=null;
//		创建输出流对象
		try {
			fos=new FileOutputStream("d:\\java.txt");
			}catch (FileNotFoundException e) {
				System.out.println("创建文件失败！");
			}
//		调用写功能，写入
	    try {
	    	fos.write("这是通过程序写的一句话".getBytes());
	        }catch(IOException e) {
	        	System.out.println("写入字节失败！");
	        }
//		调用close()释放资源
	    try {
	    	fos.close();
	    	}catch(IOException e) {
	    		System.out.println("释放资源失败！");
	    	}
		System.out.println("写入成功!");
		
//		public FileOutputStream(String name,boolean append)
//		创建字节流对象，实现追加写入并换行
		FileOutputStream fos2=null;
		try {
			fos2=new FileOutputStream("d:\\java2.txt",true);
			}catch(FileNotFoundException e) {
				System.out.println("创建文件失败！");
			}
//		循环追加写入
		for(int i=1;i<=10;i++) {
			try {
				fos2.write(("这是一句话，我要写10次，这是第"+i+"\r\n").getBytes());
			}catch(IOException e) {
				System.out.println("写入字节失败！");
			}
		}
		try {
			fos2.close();
			}catch(IOException e) {
				System.out.println("释放资源失败！");
			}
		
		System.out.println("写入成功!");
	}
}

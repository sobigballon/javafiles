package learning_JAVA;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/**
 * 使用java1.1IIO的压缩来压缩和解压一个文件
 * @author Administrator
 *
 */

public class Gzipcompress {
	public static void main(String[] args) {
		try {
			BufferedReader in=
					new BufferedReader(
							new FileReader("d:\\x.txt"));
			BufferedOutputStream out=
					new BufferedOutputStream(new 
							GZIPOutputStream( new
									FileOutputStream("d:\\test.gz")));
			int c;
			while((c=in.read())!=-1) 
				out.write(c);
			in.close();
			out.close();
			System.out.print("Reading file ");
			BufferedReader in2=new BufferedReader(
					new InputStreamReader(
							new GZIPInputStream(
									new FileInputStream("d:\\test.gz"))));
			String s;
			while((s=in2.readLine())!=null)
				System.out.print(s);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	

}

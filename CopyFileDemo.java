package someotherTest;
//��D�̵��ļ����ݸ��Ƶ�C��
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFileDemo {
	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("d:\\java2.txt");
		FileOutputStream fos=new FileOutputStream("c:\\java3.txt");
		int by=0;
		while((by=fis.read())!=-1) {
			fos.write(by);
		}
		fis.close();
		fos.close();
	}

}

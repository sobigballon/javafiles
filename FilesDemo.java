package someotherTest;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * �������ܣ�
 * A:�����ļ�,����ļ������ڣ��ʹ��������ڣ��Ͳ�������
 * 		public boolean createNewFile() throws IOException
 * 		
 * B:�����ļ��У�����ļ��в����ڣ��ʹ��������ڣ��Ͳ�������
 * 	 public boolean mkdir() �����ļ���
 *   public boolean mkdirs() �༶�ļ���
 *   
 * ���״��������ļ������ļ��У�ȡ������ʹ�õķ�������ȡ���ں�׺����
 * �����Ĳ�һ���ǰ೤���������鳤��
 */

/*
 * ����������:public boolean renameTo(File dest)
 * ·����ͬ������
 * ·����ͬ�����в�����
 */

/*
 *public boolean isDirectory():�Ƿ����ļ���
 *public boolean isFile():�Ƿ����ļ�
 *public boolean exists():�Ƿ����
 *public boolean canRead():�Ƿ�ɶ�
 *public boolean canWrite():�Ƿ��д
 *public boolean isHidden():�Ƿ�����
 */

/*
*public String getAbsolutePath():��ȡ����·��
*public String getPath():��ȡ���·��
*public String getName():��ȡ����
*public long length():��ȡ�ļ��Ĵ�С
*public long lastModified():��ȡ���һ���޸�ʱ��ĺ���ֵ
*/

public class FilesDemo {
	public static void main(String[] args) throws IOException {
		File file=new File("d:\\test.txt");
		// public boolean createNewFile() throws IOException
		System.out.println("createNewFile:" + file.createNewFile());
		System.out.println("isDirectory:" + file.isDirectory());
		System.out.println("isFile:" + file.isFile());
		System.out.println("exists:" + file.exists());
		System.out.println("canRead:" + file.canRead());
		System.out.println("canWrite:" + file.canWrite());
		System.out.println("isHidden:" + file.isHidden());
		System.out.println(file.lastModified());
		
		Date d = new Date(file.lastModified());
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String s = sdf.format(d);
		System.out.println(s);
		
		System.out.println(file.length());
		
		// �����ļ���
		File file2=new File("d:\\demo");
		System.out.println("mdir:" + file2.mkdir());
		
		// �����༶�ļ���
		File file3 = new File("d:\\ccc\\dddd\\eee\\fff");
		System.out.println("mdirs:" + file3.mkdirs());
		// �����༶�ļ��У����ݺ�������
		File file4 = new File("d:\\ccc\\dddd\\test.txt");
		System.out.println("mdir:" + file4.mkdir());
		
	}

}

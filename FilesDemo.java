package someotherTest;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * 创建功能：
 * A:创建文件,如果文件不存在，就创建。存在，就不创建。
 * 		public boolean createNewFile() throws IOException
 * 		
 * B:创建文件夹，如果文件夹不存在，就创建。存在，就不创建。
 * 	 public boolean mkdir() 单级文件夹
 *   public boolean mkdirs() 多级文件夹
 *   
 * 到底创建的是文件还是文件夹，取决于你使用的方法。不取决于后缀名。
 * 骑白马的不一定是班长，可能是组长。
 */

/*
 * 重命名功能:public boolean renameTo(File dest)
 * 路径相同：改名
 * 路径不同：剪切并改名
 */

/*
 *public boolean isDirectory():是否是文件夹
 *public boolean isFile():是否是文件
 *public boolean exists():是否存在
 *public boolean canRead():是否可读
 *public boolean canWrite():是否可写
 *public boolean isHidden():是否隐藏
 */

/*
*public String getAbsolutePath():获取绝对路径
*public String getPath():获取相对路径
*public String getName():获取名称
*public long length():获取文件的大小
*public long lastModified():获取最后一次修改时间的毫秒值
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
		
		// 创建文件夹
		File file2=new File("d:\\demo");
		System.out.println("mdir:" + file2.mkdir());
		
		// 创建多级文件夹
		File file3 = new File("d:\\ccc\\dddd\\eee\\fff");
		System.out.println("mdirs:" + file3.mkdirs());
		// 创建多级文件夹，根据函数决定
		File file4 = new File("d:\\ccc\\dddd\\test.txt");
		System.out.println("mdir:" + file4.mkdir());
		
	}

}

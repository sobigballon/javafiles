package someotherTest;

import java.io.File;

/*
/*
* 删除带内容的目录
* D:\demo
* 
* 分析：
* 		A:封装指定目录
* 		B:获取指定目录下的所有文件或者文件夹的File数组
* 		C:遍历该File数组，获取得到每一个File对象
* 		D:判断该File对象
* 			是文件夹：回到B(递归)
* 			是文件：	
* 				直接删除
* 		E:删除文件夹
*/


public class RecursionDeleteDemo {
	public static void main(String[] args) {
//		封装制定目录
		File dfile=new File("d:\\ccc");
		
		File dfile2=new File("d:\\demo");
		deletef(dfile2);
		deletef(dfile);
	}
	
//  递归方法
	public static void deletef(File f) {
		File[] fl=f.listFiles();
		if(fl!=null) { //判断文件夹是否为空
			for(File i:fl) {
				if(i.isDirectory()) {
					deletef(i);
				}else {
					if(i.delete()) {System.out.println(i.getName()+"已被删除！");}//不含文件内容
				}
			}
		}
		if(f.delete()) {System.out.println(f.getName()+"已被删除！");} //为空则直接删除
	}

}

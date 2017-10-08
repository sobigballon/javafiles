package learning_JAVA;

import java.io.File;
import java.io.FilenameFilter;

public class DirList {
	public static void main(String[] args) {
		try {
			File path=new File(".");
			String[] list;
			if(args.length==0) {
				list=path.list();
			}else
				list=path.list(new DirFilter(args[0]));
			for(int i=0;i<list.length;i++)
				System.out.println(list[i]);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}

class DirFilter implements FilenameFilter{
	String afn;
	DirFilter(String afn){this.afn=afn;}
	@Override
	public boolean accept(File dir, String name) {
		// TODO 自动生成的方法存根
		//Strip path information
		String f=new File(name).getName();
		return f.indexOf(afn)!=-1;
	}
	
}

package someotherTest;

import java.io.File;

/*
/*
* ɾ�������ݵ�Ŀ¼
* D:\demo
* 
* ������
* 		A:��װָ��Ŀ¼
* 		B:��ȡָ��Ŀ¼�µ������ļ������ļ��е�File����
* 		C:������File���飬��ȡ�õ�ÿһ��File����
* 		D:�жϸ�File����
* 			���ļ��У��ص�B(�ݹ�)
* 			���ļ���	
* 				ֱ��ɾ��
* 		E:ɾ���ļ���
*/


public class RecursionDeleteDemo {
	public static void main(String[] args) {
//		��װ�ƶ�Ŀ¼
		File dfile=new File("d:\\ccc");
		
		File dfile2=new File("d:\\demo");
		deletef(dfile2);
		deletef(dfile);
	}
	
//  �ݹ鷽��
	public static void deletef(File f) {
		File[] fl=f.listFiles();
		if(fl!=null) { //�ж��ļ����Ƿ�Ϊ��
			for(File i:fl) {
				if(i.isDirectory()) {
					deletef(i);
				}else {
					if(i.delete()) {System.out.println(i.getName()+"�ѱ�ɾ����");}//�����ļ�����
				}
			}
		}
		if(f.delete()) {System.out.println(f.getName()+"�ѱ�ɾ����");} //Ϊ����ֱ��ɾ��
	}

}

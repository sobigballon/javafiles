package learning_JAVA;
/**
 * ����ObjectĬ�ϵ�hashcode()��equals()�����ᰴ�ն���ĵ�ַ�����hashtable,
 * �Ƚ�Ҳ�����Ƚϼ򵥵Ķ����ַ��
 * ����ڲ������У�if������õ�ִ�С�
 * ��Ҫ�ﵽԤ��Ч������Ҫ��д��Ϊkey����hashcode()��equals().
 * 
 */

import java.util.Hashtable;

public class SimpleHashCodeAndEquals {
	public static void main(String[] args) {
		Hashtable<Groundhog2,Prediction> ht=new Hashtable<Groundhog2,Prediction>();
		for(int i=0;i<10;i++) {
			ht.put(new Groundhog2(i), new Prediction());
		}
		
		System.out.println("ht="+ht+"\n");
		Groundhog2 gh=new Groundhog2(0);
		if(ht.containsKey(gh)) {
			System.out.println(ht.get(gh));
		}
/*
	Hashtable<Groundhog,Prediction> ht=new Hashtable<Groundhog,Prediction>();
		for(int i=0;i<10;i++) {
			ht.put(new Groundhog(i), new Prediction());
		}
		
		System.out.println(ht);
		Groundhog gh=new Groundhog(3);
		if(ht.containsKey(gh)) {
			System.out.println(ht.get(gh));
		}*/	
	
	}
}

//��Ϊֵ����
class Prediction{
	boolean shadow=Math.random()>0.5;
	public String toString() {
		if(shadow) {
			return "Six more weeks of Winter";
		}
		else
			return "Early SPring";
	}
}

//��Ϊ������
class Groundhog{
	int ghNumber;
	Groundhog(int n){
		ghNumber=n;
	}
}

//��д�˷�������
class Groundhog2{
	int ghNumber;
	Groundhog2(int n){
		ghNumber=n;
	}
//	��дObject��hashCode()������
	public int hashCode() {
		return ghNumber;
	}
//	��дObject��equals()����
	public boolean equals(Object o) {
		return ((o instanceof Groundhog2)
				&&(((Groundhog2)o).ghNumber==ghNumber));
	}
}


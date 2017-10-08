package learning_JAVA;
/**
 * 由于Object默认的hashcode()及equals()方法会按照对象的地址来存放hashtable,
 * 比较也紧紧比较简单的对象地址。
 * 因此在测试类中，if将不会得到执行。
 * 想要达到预期效果，需要重写作为key的类hashcode()和equals().
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

//作为值的类
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

//作为键的类
class Groundhog{
	int ghNumber;
	Groundhog(int n){
		ghNumber=n;
	}
}

//重写了方法的类
class Groundhog2{
	int ghNumber;
	Groundhog2(int n){
		ghNumber=n;
	}
//	重写Object的hashCode()方法。
	public int hashCode() {
		return ghNumber;
	}
//	重写Object的equals()方法
	public boolean equals(Object o) {
		return ((o instanceof Groundhog2)
				&&(((Groundhog2)o).ghNumber==ghNumber));
	}
}


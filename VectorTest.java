package learning_JAVA;
/**
 * 对于集合而言，对放入的对象会看作一样的类型，若不一样，怎在运行时会抛出异常。
 * 
 */

import java.util.Enumeration;
import java.util.Vector;

public class VectorTest {
	public static void main(String[] args) {
		Vector<cat> cats=new Vector<cat>();
		for(int i=0;i<=5;i++) {
			cats.addElement(new cat(i));
		}
		//cats.addElement(new dog(7));
		Enumeration<cat> e=cats.elements();
		while(e.hasMoreElements()){
			e.nextElement().print();
		}
		
		
//		for(int j=1;j<cats.size();j++) {
//			((cat) cats.elementAt(j)).print();
//		}
	}
	

}

//定义一个"狗"类
class dog {
	private int dogNumber;
	dog(int number){
		this.dogNumber=number;
	}
	public void print(){
		System.out.println("狗的数量是:"+dogNumber);
	}
}

//定义一个"猫"类
class cat{
	private int  catNumber;
	cat(int number){
		this.catNumber=number;
	}
	public void print() {
		System.out.println("猫的数量是："+catNumber);
	}
}

package learning_JAVA;
/**
 * ���ڼ��϶��ԣ��Է���Ķ���ῴ��һ�������ͣ�����һ������������ʱ���׳��쳣��
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

//����һ��"��"��
class dog {
	private int dogNumber;
	dog(int number){
		this.dogNumber=number;
	}
	public void print(){
		System.out.println("����������:"+dogNumber);
	}
}

//����һ��"è"��
class cat{
	private int  catNumber;
	cat(int number){
		this.catNumber=number;
	}
	public void print() {
		System.out.println("è�������ǣ�"+catNumber);
	}
}

package projecttest;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
	public static void main(String[] args) {
		Set<String> s=new HashSet<String>();
		s.add("Hello");
		s.add("world!");
		s.add("too");
//		s.add("too");   //���ʧ�ܣ�setԪ��Ψһ 
		
		for(String i:s) {
			System.out.println(i);
		}
	}

}

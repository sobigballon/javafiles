package learning_JAVA;

import java.util.Scanner;

public class Nesting_Tmo {
	public static void main(String[] args) {
		System.out.println("������һ���ɼ�");
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in );
		int score=sc.nextInt();
		char grade=score>=90?'A':score>=80?'B':score>=60?'C':'D';
		System.out.println("������ĳɼ�Ϊ:"+grade);
	}

}

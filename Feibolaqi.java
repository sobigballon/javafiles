package learning_JAVA;

import java.util.Scanner;

public class Feibolaqi {
	public static void main(String[] args) {
		System.out.println("������һ������:");
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Feibolaqi f=new Feibolaqi();
		System.out.println(f.dofefibolaqi(n));
		System.out.println(f.aotherdo(n));
	}
	
	
	public  int dofefibolaqi(int n) {
		int sum=0;
		if(n==1||n==2) {
			return 2;
		}
		if(n>=3) {
//			��n>3,�ݹ���ú���
			return dofefibolaqi(n-1)+dofefibolaqi(n-2);
		}
		return sum;
	}
	
//	ʹ�÷ǵݹ鷽ʽ
	public int aotherdo(int n) {
		int sum=0;
		if(n==1||n==2) {
			return 2;
		}
		if(n>=3) {
			int[] r=new int[n];
			r[0]=2;
			r[1]=2;
			for(int i=2;i<n;i++) {
				r[i]=r[i-1]+r[i-2];
				sum=r[i];
			}
		}
		return sum;
	}

}

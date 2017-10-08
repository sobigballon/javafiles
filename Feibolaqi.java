package learning_JAVA;

import java.util.Scanner;

public class Feibolaqi {
	public static void main(String[] args) {
		System.out.println("请输入一个整数:");
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
//			若n>3,递归调用函数
			return dofefibolaqi(n-1)+dofefibolaqi(n-2);
		}
		return sum;
	}
	
//	使用非递归方式
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

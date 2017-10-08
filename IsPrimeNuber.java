package learning_JAVA;

import java.util.Scanner;

public class IsPrimeNuber {
		public static void main(String[] args) {
			System.out.println("请输入一个需要判断的数:");
			@SuppressWarnings("resource")
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			IsPrimeNuber ipn=new IsPrimeNuber();
			boolean b1,b2,b3;
			b1=ipn.fu_one(n);
			b2=ipn.fu_two(n);
			b3=ipn.fu_three(n);
			if(b1==b2&&b2==b3) {
				System.out.println("方法都很好用！判断结果为"+b1);
			}
		}
//	方法一：只要能被2~n-1整除的数就一定不是素数。
	public boolean fu_one(int n) {
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
//	有约数的数，其中一个约数一定比其平方根小，另一个一定比其平方根大
	public boolean fu_two(int n) {
		double temp=Math.sqrt(n);
		for(int i=2;i<temp;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
	
//	孪生素数法，既素数一定在6或者6的倍数两侧,但6或者6的倍数两侧的数不一定都是素数,如25等，因此，可将步长设置为6进行验证
	public boolean fu_three(int n) {
		if(n==2||n==3) {return true;}
		if(n%6!=1&&n%6!=5) {
			return false;
		}
		double temp=Math.sqrt(n);
		for(int i=5;i<temp;i+=6) {
			if(n%i==0||n%(i+2)==0) {
				return false;
			}
		}
		return true;
	}

}

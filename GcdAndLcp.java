package learning_JAVA;

import java.util.Scanner;

/**
 * 输入两个数m,n;求两个数的最大公倍数和最小公约数
 * @author Administrator
 *解题思路，先用大数除以小树，若余数不为1，则将原来的小数作为大数字，余数作为较小的数，继续用大数除以小数，若余数为1,则大数即为最大公约数返回。
 *最大公倍数为二数之积除以最大公约数。
 *因存在两个数没有公约数的情况，增加了判断是否有公约数的函数。
 */

public class GcdAndLcp {
	public static void main(String[] args) {
		int m,n,gcd,lcp;
		System.out.println("请输入要求取公约数和公倍数的两个数：");
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		m=sc.nextInt();
		n=sc.nextInt();
		GcdAndLcp gal=new GcdAndLcp();
		gcd=gal.Gcd(m,n);
		lcp=gal.Lcp(m, n);
		if(gcd==0) {
			System.out.println("两数没有公约数！"+" "+"最小公倍数为："+lcp);
		}else {
			System.out.println("最大公约数为："+gcd+" "+"最小公倍数为："+lcp);
		}
	}
	
//	求最大公约数
	public int Gcd(int m,int n) {
		int max,min;
		max=Math.max(m,n);
		min=Math.min(m,n);
		if(!Ishasgcd(max,min)) {
			return 0;
		}
		int temp=max%min;
		while(temp!=1) {
			max=min;
			min=temp;
			temp=max/min;
		}
		
		return max;
	}
//	求最小公倍数
	public int Lcp(int m,int n) {
		if(!Ishasgcd(m,n)) {
			return m*n;
		}
		int gcd=Gcd(m,n);
		return m*n/gcd;
		
	}
//判断是是否有公约数	
	public boolean Ishasgcd(int m,int n) {
		int max,min;
		max=Math.max(m, n);
		min=Math.min(m, n);
		if(max<=0||min<=0) {
			return false;
		}
		for(int i=2;i<=min;i++) {
			if(min%i==0&&max%i==0) {
				return true;
			}
		}
		return false;
		
	}

}

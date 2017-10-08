package learning_JAVA;

import java.util.Scanner;

/**
 * ����������m,n;������������󹫱�������С��Լ��
 * @author Administrator
 *����˼·�����ô�������С������������Ϊ1����ԭ����С����Ϊ�����֣�������Ϊ��С�����������ô�������С����������Ϊ1,�������Ϊ���Լ�����ء�
 *��󹫱���Ϊ����֮���������Լ����
 *�����������û�й�Լ����������������ж��Ƿ��й�Լ���ĺ�����
 */

public class GcdAndLcp {
	public static void main(String[] args) {
		int m,n,gcd,lcp;
		System.out.println("������Ҫ��ȡ��Լ���͹���������������");
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		m=sc.nextInt();
		n=sc.nextInt();
		GcdAndLcp gal=new GcdAndLcp();
		gcd=gal.Gcd(m,n);
		lcp=gal.Lcp(m, n);
		if(gcd==0) {
			System.out.println("����û�й�Լ����"+" "+"��С������Ϊ��"+lcp);
		}else {
			System.out.println("���Լ��Ϊ��"+gcd+" "+"��С������Ϊ��"+lcp);
		}
	}
	
//	�����Լ��
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
//	����С������
	public int Lcp(int m,int n) {
		if(!Ishasgcd(m,n)) {
			return m*n;
		}
		int gcd=Gcd(m,n);
		return m*n/gcd;
		
	}
//�ж����Ƿ��й�Լ��	
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

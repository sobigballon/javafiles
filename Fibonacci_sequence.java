package someotherTest;

/*  쳲��������У�1,1,2,3,5,8...
*  
*  ���ɣ��ӵ����ʼ��ÿһ����ǰ����֮�͡�	
*  ���ڣ�ǰ����Ӧ������֪����һ��1���ڶ���1
*  
*  ���ڵ�������������a��b��ʾ
*  ��һ�����ڣ�a=1,b=1
*  �ڶ������ڣ�a=1,b=2
*  ���������ڣ�a=2,b=3
*  ���ĸ����ڣ�a=3,b=5
*  ...
*  ÿ����һ�����ڵ�a����ǰ��b��b����ǰ��a+b
*/
// ������20���µ����Ӷ���

public class Fibonacci_sequence {
	public static void main(String[] args) {
//		������ʵ��
		int[] f=new int[20];
		for(int i=0;i<f.length;i++) {
			if(i==0||i==1) {
				f[i]=1;
			}
			if(i>1) {
				f[i]=f[i-1]+f[i-2];
			}
		}
		System.out.println(f[19]);
		
//		�ݹ����
		System.out.println(fb(20));
		
		
	}
	
//	�ݹ麯��
	public static int fb(int n) {
		if(n==1||n==2) {
			return 1;
		}else {
			return fb(n-1)+fb(n-2);
		}
		
	}

}

package someotherTest;

/*�ݹ�:���������е��÷������������
* 
* ע�����
* 		A:�ݹ�һ��Ҫ�г��ڣ�����������ݹ�
* 		B:�ݹ�Ĵ������ܹ��࣬�����ڴ����
* 		C:���췽�����ܵݹ�ʹ��
* 
* StackOverflowError:��Ӧ�ó���ݹ�̫���������ջ���ʱ���׳��ô��� 
*/

/*
 * ������5�Ľ׳�
 */

public class Recursion {
	public static void main(String[] args) {
//		ѭ��ʵ��
		int sum=1;
		for(int i=1;i<=5;i++) {
			sum=sum*i;
			}
		System.out.println(sum);
//		�ݹ�ʵ��
		System.out.println(jc(5));
		
		
	}	
			

//	�ݹ麯��
	public static int jc(int n) {
		int sum=1;
		if(n==1) {
			return 1;
		}
		else {
			for(int i=1;i<=n;i++) {
				sum=n*jc(n-1);
			}
		}
		return sum;
	}
	

}

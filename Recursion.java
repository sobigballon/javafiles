package someotherTest;

/*递归:方法定义中调用方法本身的现象
* 
* 注意事项：
* 		A:递归一定要有出口，否则就是死递归
* 		B:递归的次数不能过多，否则内存溢出
* 		C:构造方法不能递归使用
* 
* StackOverflowError:当应用程序递归太深而发生堆栈溢出时，抛出该错误。 
*/

/*
 * 需求：求5的阶乘
 */

public class Recursion {
	public static void main(String[] args) {
//		循环实现
		int sum=1;
		for(int i=1;i<=5;i++) {
			sum=sum*i;
			}
		System.out.println(sum);
//		递归实现
		System.out.println(jc(5));
		
		
	}	
			

//	递归函数
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

package someotherTest;

/*  斐波那契数列：1,1,2,3,5,8...
*  
*  规律：从第三项开始，每一项是前两项之和。	
*  出口：前两项应该是已知。第一项1，第二项1
*  
*  相邻的两个月我们用a，b表示
*  第一个相邻：a=1,b=1
*  第二个相邻：a=1,b=2
*  第三个相邻：a=2,b=3
*  第四个相邻：a=3,b=5
*  ...
*  每次下一个相邻的a是以前的b，b是以前的a+b
*/
// 需求，求20个月的兔子对数

public class Fibonacci_sequence {
	public static void main(String[] args) {
//		用数组实现
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
		
//		递归调用
		System.out.println(fb(20));
		
		
	}
	
//	递归函数
	public static int fb(int n) {
		if(n==1||n==2) {
			return 1;
		}else {
			return fb(n-1)+fb(n-2);
		}
		
	}

}

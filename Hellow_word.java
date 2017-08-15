package learning_JAVA;
import java.util.Scanner;

public class Hellow_word {
	public static void main(String[] args) {
		System.out.println("Hello! word!");
		System.out.println(100);
		System.out.print(true);
		System.out.println("\n");
		System.out.println(0b100);//4
		System.out.println(0100);
		System.out.println('b'+1);
		System.out.println('b'+1+"Hello");
		short s=1;
		s+=1;
		System.out.println(s);
		Scanner sc=new Scanner(System.in);
		int x;
//		x=sc.nextInt();
//		System.out.println(x);
		double sub=0;
		int i=0;
		while (sub<100){
			sub=sub+2.5;
			i+=1;
			if (i%5==0) {
				sub=sub-6;
			}
		}
	   System.out.println(i);
	   int a=1,b=2,c=3;
	   System.out.println(a>b^b>c);//逻辑异或，相同false，不同True
	   System.out.println(a>b^c>b);
	   System.out.println(!(a>b));
	   System.out.println(!(a<b));
	   int y=(a>b)?a:b;
	   System.out.println(y);
//	   print_star();
	   int[] arr=new int[3];
	   arr[0]=1;
	   arr[1]=2;
	   arr[2]=3;
	   System.out.println(arr[1]);
	   int[] brr=new int[]{1,2,3};//or int[] arr={1,2,3}
//	   printYFTriangle();
	   
	}
	public static void print_star() {
		System.out.println("请输入一个整数：");
		Scanner sc=new Scanner(System.in);
		int z=sc.nextInt();
		for (int i=1;i<=z;i++) {
			for (int j=1;j<=z;j++) {
				System.out.println(i+"*"+j+"="+i*j);
			}
			System.out.println();
			}
		}
	
	 public static void printYFTriangle(){
	        System.out.println("how many lines you want:");
	        Scanner in = new Scanner(System.in);
	        int lines = in.nextInt();
	        int[] a = new int[lines + 1];
	        int previous = 1;
	        for (int i = 1; i <= lines; i ++){
	            for (int j = 1; j <= i; j++){
	                int current = a[j];
	                a[j] = previous + current;
	                previous = current;
	                System.out.print(a[j] + " ");
	            }
	            System.out.println();
	        }
	    }

}

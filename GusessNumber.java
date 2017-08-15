package projecttest;
import java.util.Scanner;

class GusessNumber {
	public static void main(String[] args) {
		int target=(int)(Math.random()*100+1);
		System.out.println(target);
	    while(true) {
	    	System.out.println("请输入您的数字（1-100）:");
	    	Scanner sc=new Scanner(System.in);
		    int gn=sc.nextInt();
		    if (target>gn) {
		    	System.out.println("您输入的数字"+gn+"小了");
		    }
		    else if (target<gn) {
		    	System.out.println("您输入的数字"+gn+"大了");
		    	
		    }
		    else {
		    	System.out.println("您猜对了！数字是"+gn);
		    	break;
		    }
		    }
	    }
}

package projecttest;
import java.util.Scanner;

class GusessNumber {
	public static void main(String[] args) {
		int target=(int)(Math.random()*100+1);
		System.out.println(target);
	    while(true) {
	    	System.out.println("�������������֣�1-100��:");
	    	Scanner sc=new Scanner(System.in);
		    int gn=sc.nextInt();
		    if (target>gn) {
		    	System.out.println("�����������"+gn+"С��");
		    }
		    else if (target<gn) {
		    	System.out.println("�����������"+gn+"����");
		    	
		    }
		    else {
		    	System.out.println("���¶��ˣ�������"+gn);
		    	break;
		    }
		    }
	    }
}

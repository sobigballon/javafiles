package learning_JAVA;


public class PerfectNumber {
	public static void main(String[] args) {
		System.out.println("1000以内所有的'完数'为：");
		for(int i=1;i<=1000;i++) {
			int number=0;
			for (int j=1;j<i;j++) {
				if(i%j==0) {
					number=number+j;
				}
			}
			if(number==i) {
				System.out.println(i+" ");
			}
		}
	}

}

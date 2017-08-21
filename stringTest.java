package projecttest;

public class stringTest {
	public static void  main(String[] args) {
		String s="agsfsf";
		select o=new select();
		System.out.println(o.sort(s));
		System.out.println(o.binary(o.sort(s),'s'));
	}

}

class select{
//	实现字符创排序
	public String sort(String str) {
		char[] s1=str.toCharArray();
		for (int i=0;i<s1.length;i++) {
			for (int j=0;j<i;j++) {
				if(s1[j]>s1[i]) {
					char temp=s1[j];
					s1[j]=s1[i];
					s1[i]=temp;
				}
			}
		}
		String st=new String(s1);
		return st;
	}
	
//	二分查找
	public int binary (String str,char c) {
		char[] s1=str.toCharArray();
		int low=0,high=s1.length-1;
		while(true) {
			int middle=(low+high)/2;
			if (c>s1[middle]){
				low=middle+1;
			}
			else if(c<s1[middle]) {
				high=middle-1;
			}
			else if(c==s1[middle]) {
				return middle;
			}
			
		}
	}
}

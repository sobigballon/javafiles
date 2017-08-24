package projecttest;

public class IntegerDemo {
	public static void main(String[] args) {
		System.out.println(Integer.toBinaryString(100));
		System.out.println(Integer.toOctalString(100));
		String s="100";
		Integer i=new Integer(s);
		System.out.println(i);
		String s1=i.toString();
		System.out.println(s1 instanceof String);
		int j=i.parseInt(s1);
		System.out.println(j);
		Integer x=100;//×Ô¶¯×°Ïä
	}

}

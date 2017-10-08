package learning_JAVA;

public class Rock {
	public Rock(){
		System.out.println("this is a Rock constructor!");
	}
	public static void main(String[] args) {
		System.out.println("This is a test!");
		for(int i=0;i<10;i++) {
			Rock r=new Rock();
			r.prt(1+5+"this is a printing test!");
		}
	}
	
	public void prt(String s) {
		System.out.println(s);
	}

}

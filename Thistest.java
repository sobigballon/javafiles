package learning_JAVA;

public class Thistest {
	private int i=0;
	Thistest increment() {
		i++;
		return this;
	}
	
	void print() {
		System.out.println("i="+i);
	}
	public static void main(String[] args) {
		Thistest tt=new Thistest();
		tt.increment().increment().increment().print();
	}
	
}

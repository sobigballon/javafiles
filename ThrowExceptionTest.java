package learning_JAVA;

public class ThrowExceptionTest {
	public static void main(String[] args) {
		try {
			throw new Exception("here is my Exceprion!");
		}catch(Exception e) {
			System.out.println("Caught Exception!");
			System.out.println("e.getMessage()"+e.getMessage());
			System.out.println("e.toString()"+e.toString());
			System.out.println("e.printStackTrace():");
			e.printStackTrace();
		}
		try {
			g();
		}catch(Exception e) {
			System.out.println("caught in main!e.printStackTrace()");
			e.printStackTrace();
		}
	}
	
	public static void f() throws Exception{
		System.out.println("originationg the exception of f()");
		throw new Exception("throw from f()");
	}
	
	public static void g() throws Exception {
		try {
			f();
		}catch(Exception e) {
			System.out.println("caught g()!");
			e.printStackTrace();
			throw e;
		}
	}
	
	

}

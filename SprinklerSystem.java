package learning_JAVA;

class Watersourse{
	private String s;
	Watersourse(){
		System.out.println("Watersourse(");
		s=new String("Constructed");
	}
	public String toString() {
		return s;
	}
}

public class SprinklerSystem {
	private String value1;
	Watersourse sourse;
	int i;
	float f;
	
	SprinklerSystem (){
		sourse=new Watersourse();
		value1="abcd";
		i=10;
		f=10;
	}
	
	void print() {
		System.out.println("value1 "+value1);
		System.out.println("sourse "+sourse);
		System.out.println("i "+i);
		System.out.println("f "+f);
	}
	
	public static void main(String[] args) {
		SprinklerSystem ss=new SprinklerSystem();
		ss.print();
	}

}

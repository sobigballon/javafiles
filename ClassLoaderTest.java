package learning_JAVA;
/**
 * ≤‚ ‘¿‡µƒ‘ÿ»Î
 * @author Administrator
 *
 */

public class ClassLoaderTest {
	public static void main(String[] args) {
		System.out.println("inside main");
		new Candy();
		System.out.println("After creating candy");	
		try {
			Class.forName("Gum");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("After Class.forName(\"Gum\")");
		new Cookie();
		System.out.println("After creating cookie!");
	}

}
class Candy{
	static {
		System.out.println("Loading candy!");;
	}
}


class Gum{
	static {
		System.out.println("Loading Gum!");
	}
}

class Cookie{
	static {
		System.out.println("Loading cookie!");
	}
}


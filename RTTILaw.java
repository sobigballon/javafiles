package learning_JAVA;

public class RTTILaw {
	public static void main(String[] args) {
		Class c=null;
		try {
			c=(Class) Class.forName("FancyToy");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		printInfo(c);
		Class[] faces=c.getInterfaces();
		for(int i=0;i<faces.length;i++)
			printInfo(faces[i]);
		Class cy=c.getSuperclass();
		Object o=null;
		try {
			o=cy.newInstance();
		}catch(InstantiationException e) {}
		 catch(IllegalAccessException e) {}
		printInfo(o.getClass());
	}
	
	static void printInfo(Class cc) {
		System.out.println("Class name"+cc.getName()+
				"is interface?["+
				cc.isInterface()+"]");
	}

}
interface HasBatteries{}
interface Waterproof{}
interface ShootThings{}
class Toy{
	Toy(){}
	Toy(int i){}
}

class FancyToy extends Toy implements HasBatteries,
			Waterproof,ShootThings{
	FancyToy(){
		super(1);
	}
}


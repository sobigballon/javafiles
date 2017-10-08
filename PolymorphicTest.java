package learning_JAVA;

public class PolymorphicTest {
	public static void main(String[] args) {
		Shape[] s=new Shape[7];
		for(int i=0;i<s.length;i++) {
			s[i]=Shapes.randomShape();
		}
//		��̬�Ķ�̬�����У�ʹ�ö�����ò�ͬ�ķ���
		for(int j=0;j<s.length;j++) {
			s[j].draw();
			s[j].erase();
		}
	}

}

class Shape{
	void draw() {}
	void erase() {}
}
//Բ�Σ��̳в���д��shape�ķ�����
class Circle extends Shape{
	void draw() {
		System.out.println("Circle.draw()");
	}
	
	void erase() {
		System.out.println("Circle.erase(");
	}
}
//���Σ��̳в���д��shape�ķ���
class Square extends Shape{
	public void draw() {
		System.out.println("Square.draw()");
	}
	
	public void erase() {
		System.out.println("Square.erase(");
	}
}

//�����Σ��̳в���д��shape�ķ���
class Triangle extends Shape{
	public void draw() {
		System.out.println("Triangle.draw()");
	}
	
	public void erase() {
		System.out.println("Triangle.erase(");
	}
}

//�ڸ�����ʹ��switchʵ���������ת�͡�
class Shapes{
	public static Shape randomShape(){
		switch((int)(Math.random()*3)) {
		default:
		case 0:
			return new Circle();
		case 1:
			return new Square();
		case 2:
			return new Triangle();
		}		
	}
}


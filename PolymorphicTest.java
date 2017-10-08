package learning_JAVA;

public class PolymorphicTest {
	public static void main(String[] args) {
		Shape[] s=new Shape[7];
		for(int i=0;i<s.length;i++) {
			s[i]=Shapes.randomShape();
		}
//		多态的动态绑定运行，使得对象调用不同的方法
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
//圆形，继承并重写了shape的方法。
class Circle extends Shape{
	void draw() {
		System.out.println("Circle.draw()");
	}
	
	void erase() {
		System.out.println("Circle.erase(");
	}
}
//方形，继承并重写了shape的方法
class Square extends Shape{
	public void draw() {
		System.out.println("Square.draw()");
	}
	
	public void erase() {
		System.out.println("Square.erase(");
	}
}

//三角形，继承并重写了shape的方法
class Triangle extends Shape{
	public void draw() {
		System.out.println("Triangle.draw()");
	}
	
	public void erase() {
		System.out.println("Triangle.erase(");
	}
}

//在该类中使用switch实现随机向上转型。
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


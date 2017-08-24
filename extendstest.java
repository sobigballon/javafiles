package projecttest;

class extendstest {
	public extendstest(){
		
	}
}

class teacher{
	public int age;
	public String name;
	public double salary;
	public teacher() {}
	public teacher(int a,String n) {
		this.age=a;
		this.name=n;
	}
	public teacher(int a,String n,double s) {
		this.age=a;
		this.name=n;
		this.salary=s;
	}
	
	public void setAge(int a) {
		this.age=a;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void setName(String n) {
		this.name=n;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setSalary(int s) {
		this.salary=s;
	}
	
	public double getSalary() {
		return this.salary;
	}
	
	public void sleep() {
		System.out.println("ZZZZ!");
	}
	
	public void eat() {
		System.out.println("巴拉巴拉，嗝~");
	}
	
	public void paySalary() {
		System.out.println("少算五毛！！");	
	} 
	
	public void showing() {
		System.out.println(age+name+salary);	
	}
	
}

class student3 extends teacher{
	private int id;
	public student3() {
		
	}
	
	public student3(int a,String n,int i) {
		super(a,n);
		this.id=i;
	}
	
	public void setId(int i) {
		id=i;
	}
	
	public int getId() {
		return id;
	}
	
	public void eat() {
		System.out.println("巴拉巴拉，巴拉巴拉");
	}
	
	public void havaingclass() {
		System.out.println("Excuse me！！");	
	}
	
	public void showing() {
		System.out.println(id+super.name+super.age);	
	}
	
}


class tsetDemo {
	public static void main(String[] args) {
		teacher t=new teacher(45,"老黄",5000.0);
		student3 s=new student3(20,"小明",123);
		student3 a=new student3();
		a.setName("小明");
		a.setAge(21);
		a.setId(678);
		t.showing();
		s.showing();
		t.eat();
		s.eat();
		s.sleep();
		s.paySalary();
		a.showing();
		teacher y=new student3(47,"老k",6500);
		System.out.println(y.salary);
		y.getName();
		y.eat();
		student3 q=(student3) y;
		q.getId();
	}	
}

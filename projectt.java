package projecttest;

public class projectt {
	private int age;
	private String name;
	private int sid;
	public projectt() {}
	public projectt(int age,String name,int sid) {
		this.age=age;
		this.name=name;
		this.sid=sid;
	}
	public void setAge(int a) {
		age=a;
	}
	public int getAge() {
		return age;
	}
	public void setName(String n) {
		name=n;
	}
	public String getName() {
		return name;
	}
	public void setSid(int s) {
		sid=s;
	}
	public int getSid() {
		return sid;
	}
	public void eat() {
		System.out.println("学生开始吃饭了！！");
	}
	public void learning() {
		System.out.println("早读开始！");
	}
	public void sleep() {
		System.out.println("ZZZZZ!");
	}
	
	public void show() {
		System.out.println("姓名："+name+"年龄"+age+"学号："+sid);
	}

}
class projecttDemo {
	public static void main(String[] args) {
		projectt p=new projectt();
		projectt q=new projectt(20,"小亮",123);
		p.setAge(15);
		p.setName("小明");
		p.setSid(123);
	    p.show();
	    q.show();
	    p.eat();
	    p.learning();
	    p.sleep();
	    int[] arr= {1,2,3,4,5};
	   for (int i=0;i<arr.length;i++) {
		   System.out.println(arr[i]);
	   }
	   System.out.println((int)(Math.random()*100+1));
	}
	
}

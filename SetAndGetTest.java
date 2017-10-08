package keyWordTest;

public class SetAndGetTest {
	public static void main(String[] args) {
		Student s=new Student();
		GetThread gt=new GetThread(s);
		SetThread st=new SetThread(s);
		gt.start();
		st.start();
		
	}

}

//学生对象，既普通对象
class Student{
	private int age;
	private String name;
	boolean flag = false; 
	public int getAge() {
		return this.age;
	}
	
	public void setAge(int a) {
		this.age=a;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String n) {
		this.name=n;
	}
	
}

//将get看作是消费者
class GetThread extends Thread{
	private Student s;
	public GetThread(Student s) {
		this.s=s;
	}
	public void run() {
		while(true) {
			synchronized(s) {
				System.out.println(s.getAge()+"----"+s.getName());
			}
		}
	}
}

//将set看作为生产者
class SetThread extends Thread{
	private Student s;
	private int x=0;
	
	public SetThread(Student s) {
		this.s=s;
	}
	public void run() {

		while(true) {
			synchronized(s) {
				if(x%2==0) {
					s.setAge(28);
					s.setName("林青霞");
				}else {
					s.setAge(30);
					s.setName("关之琳");
				}
				x++;
			}
		}
	}
}



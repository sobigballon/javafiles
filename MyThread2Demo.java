package someotherTest;

public class MyThread2Demo {
	public static void main(String[] args) {
		Mythread m1=new Mythread();
		Thread m=new Thread(m1,"天乐");
		m.start();
		System.out.println(m.getName());
		
	}

}

class Mythread implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("接口实现的线程运行了！");
	}
	
}

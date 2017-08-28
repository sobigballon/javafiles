package someotherTest;

public class MyThreadDemo {
	public static void main(String[] args) {
//		线程的基础练习
		ThreadDemo m1=new ThreadDemo();
//		m1.start();
		m1.setName("大兵");
		System.out.println("现在运行的线程名字是："+Thread.currentThread().getName());
//		设置线程优先级
		ThreadPriority t1=new ThreadPriority();
		ThreadPriority t2=new ThreadPriority();
		ThreadPriority t3=new ThreadPriority();
		t1.setName("青霞");
		t2.setName("之琳");
		t3.setName("嘉欣");
		t1.setPriority(7);
		t3.setPriority(3);
		t1.start();
//		练习join()仿佛
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t2.start();
		t3.start();
		
//		练习守护线程
		ThreadPriority t4=new ThreadPriority();
		ThreadPriority t5=new ThreadPriority();
		t4.setName("嘉玲");
		t5.setName("柏芝");
//		将线程设为守护线程
		t4.setDaemon(true);
		t5.setDaemon(true);
		for(int i=1;i<=5;i++) {
			System.out.println("现在运行的线程名字是："+Thread.currentThread().getName());
		}
		
//		
		
		
		
		
	}

}

class ThreadDemo extends Thread{
//	@override
	public void run() {
		System.out.println("新的线程开始！");
		System.out.println("现在运行的线程名字是："+getName());
	}
}

class ThreadPriority extends Thread{
//	@Override
	public void run() {
		for(int i=1;i<=100;i++) {
			System.out.println("现在是线程"+getName()+"计数到了"+i+"次！");
		}
	}
}

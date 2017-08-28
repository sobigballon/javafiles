package someotherTest;

public class MovieTicketDemo {
	public static void main(String[] args) {
//创建一个票资源
	movieticket mv=new movieticket();

//	创建线程
	Thread m1=new Thread(mv,"窗口1");
	Thread m2=new Thread(mv,"窗口2");
	Thread m3=new Thread(mv,"窗口3");
	m1.start();
	m2.start();
	m3.start();
	
	}
}

class movieticket implements Runnable{
	int ticket=100;
//	private Demo d = new Demo();

	@Override
	// TODO Auto-generated method stub
	public void run() {
		while(true) {
			synchronized(this) {
				if(ticket>0) {
					try {
						Thread.sleep(100); // 休息会
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						System.out.println(Thread.currentThread().getName()+"卖出第"+ticket+"张票");
						ticket--;
				}
			}
		}
	}
}
	

class Demo{}

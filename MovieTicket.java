package keyWordTest;
/**
 * 未将共享资源加锁的多线程，只是让线程进入资源后暂停一下
 * 实际过程中是有问题的
 * @author Administrator
 *
 */

public class MovieTicket {
	public static void main(String[] args) {
		Ticket mt=new Ticket();
//		Ticket mt1=new Ticket();
//		Ticket mt2=new Ticket();
		Thread m1=new Thread(mt,"1号窗口");
		Thread m2=new Thread(mt,"2号窗口");
		Thread m3=new Thread(mt,"3号窗口");
//		mt.start();
//		mt1.start();
//		mt2.start();
		m1.start();
		m2.start();
		m3.start();
	}
	

}

class Ticket extends Thread{
	private int tickets=100;
	public void run() {
		while(true) {
			if(tickets>0) {
				try {
					Thread.sleep(100);
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName()+
						"正在售出第"+tickets--+"张票");
			}
		}
		
	}
}
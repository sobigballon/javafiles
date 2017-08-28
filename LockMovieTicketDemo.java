package someotherTest;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*
 * 为了更清楚的让我们知道是如何加锁和释放锁的，JDK5以后就提供了一个接口：Lock锁。
 * Lock
 * 		public void lock():加锁
 * 		public void unlock():释放锁
 * 实现类对象
 * 		public ReentrantLock()
 */

public class LockMovieTicketDemo {
	public static void main(String[] args) {
		movieticket3 mt = new movieticket3();

		Thread t1 = new Thread(mt, "窗口1");
		Thread t2 = new Thread(mt, "窗口2");
		Thread t3 = new Thread(mt, "窗口3");

		t1.start();
		t2.start();
		t3.start();
	}
	

}

class movieticket3 implements Runnable{
	private int ticket=100;
//	造锁
	private Lock lock = new ReentrantLock();

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			try {
				lock.lock();
				if(ticket>0) {
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

					System.out.println(Thread.currentThread().getName()
							+ "正在出售第" + (ticket--) + "张票");
				}
		   }finally {
			   lock.unlock();
		   }
			
		}
	}
	
}

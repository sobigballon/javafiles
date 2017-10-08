package keyWordTest;
/**
 * JDK1.5之后引入了加锁的新特性，实现效果跟Sychronized一致，更易理解一些
 */

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SychronizedAndLock {
	public static void main(String[] args) {
		Ticket4 mt=new Ticket4();
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

class Ticket4 extends Thread{
	private int tickets=100;
	Lock lock=new ReentrantLock();
	public void run() {
		while(true) {
			try {
				lock.lock();
				if(tickets>0) {
					try {
						Thread.sleep(100);
					}catch(InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName()+
							"正在售出第"+tickets--+"张票");
				}
			}finally {
				lock.unlock();
			}
			
			
		}
		
	}
}

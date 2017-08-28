package someotherTest;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*
 * Ϊ�˸������������֪������μ������ͷ����ģ�JDK5�Ժ���ṩ��һ���ӿڣ�Lock����
 * Lock
 * 		public void lock():����
 * 		public void unlock():�ͷ���
 * ʵ�������
 * 		public ReentrantLock()
 */

public class LockMovieTicketDemo {
	public static void main(String[] args) {
		movieticket3 mt = new movieticket3();

		Thread t1 = new Thread(mt, "����1");
		Thread t2 = new Thread(mt, "����2");
		Thread t3 = new Thread(mt, "����3");

		t1.start();
		t2.start();
		t3.start();
	}
	

}

class movieticket3 implements Runnable{
	private int ticket=100;
//	����
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
							+ "���ڳ��۵�" + (ticket--) + "��Ʊ");
				}
		   }finally {
			   lock.unlock();
		   }
			
		}
	}
	
}

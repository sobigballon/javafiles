package keyWordTest;

public class SychronizedMethodMovieTicket {
	public static void main(String[] args) {
		Ticket2 mt=new Ticket2();
//		Ticket mt1=new Ticket();
//		Ticket mt2=new Ticket();
		Thread m1=new Thread(mt,"1�Ŵ���");
		Thread m2=new Thread(mt,"2�Ŵ���");
		Thread m3=new Thread(mt,"3�Ŵ���");
//		mt.start();
//		mt1.start();
//		mt2.start();
		m1.start();
		m2.start();
		m3.start();
	}

}

class Ticket3 extends Thread{
	private static int tickets=100;
	public void run() {
		while(true) {
			if(tickets%2==0) {
//				ͬ�������
				synchronized(this) {
					if(tickets>0) {
						try {
							Thread.sleep(100);
						}catch(InterruptedException e) {
							e.printStackTrace();
						}
						System.out.println(Thread.currentThread().getName()+
								"�����۳���"+tickets--+"��Ʊ");
					}
				}
			}else {
				selltickets();
			}
			
			
		}
		
	}
	
//	ͬ������
	public static synchronized void selltickets() {
		if(tickets>0) {
			try {
				Thread.sleep(100);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+
					"�����۳���"+tickets--+"��Ʊ");
		}
	}
}

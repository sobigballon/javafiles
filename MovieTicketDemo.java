package someotherTest;

public class MovieTicketDemo {
	public static void main(String[] args) {
//����һ��Ʊ��Դ
	movieticket mv=new movieticket();

//	�����߳�
	Thread m1=new Thread(mv,"����1");
	Thread m2=new Thread(mv,"����2");
	Thread m3=new Thread(mv,"����3");
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
						Thread.sleep(100); // ��Ϣ��
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						System.out.println(Thread.currentThread().getName()+"������"+ticket+"��Ʊ");
						ticket--;
				}
			}
		}
	}
}
	

class Demo{}

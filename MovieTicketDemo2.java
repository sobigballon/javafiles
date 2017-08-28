package someotherTest;

public class MovieTicketDemo2 {
	public static void main(String[] args) {
		// ����һ��Ʊ��Դ
		movieticket2 mt = new movieticket2();

		// ���������߳�
		Thread t1 = new Thread(mt, "����1");
		Thread t2 = new Thread(mt, "����2");
		Thread t3 = new Thread(mt, "����3");

		t1.start();
		t2.start();
		t3.start();
		System.out.println("Done!");
	}
	

}
class movieticket2 implements Runnable{
	private static int tickets = 100;
	private int x = 0;

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true) {
			if (x % 2 == 0) {
				synchronized (movieticket2.class) {
					if (tickets > 0) {
						try {
							Thread.sleep(100);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}

						System.out.println(Thread.currentThread().getName()
								+ "���ڳ��۵�" + (tickets--) + "��Ʊ");
					}
				}
			} else {
				sellTicket();
			}
			x++;
		}
	}
	
	private static synchronized void sellTicket() {
		if (tickets > 0) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			System.out.println(Thread.currentThread().getName() + "���ڳ��۵�"
					+ (tickets--) + "��Ʊ");
		}
	}
	
}
package someotherTest;

public class MyThreadDemo {
	public static void main(String[] args) {
//		�̵߳Ļ�����ϰ
		ThreadDemo m1=new ThreadDemo();
//		m1.start();
		m1.setName("���");
		System.out.println("�������е��߳������ǣ�"+Thread.currentThread().getName());
//		�����߳����ȼ�
		ThreadPriority t1=new ThreadPriority();
		ThreadPriority t2=new ThreadPriority();
		ThreadPriority t3=new ThreadPriority();
		t1.setName("��ϼ");
		t2.setName("֮��");
		t3.setName("����");
		t1.setPriority(7);
		t3.setPriority(3);
		t1.start();
//		��ϰjoin()�·�
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t2.start();
		t3.start();
		
//		��ϰ�ػ��߳�
		ThreadPriority t4=new ThreadPriority();
		ThreadPriority t5=new ThreadPriority();
		t4.setName("����");
		t5.setName("��֥");
//		���߳���Ϊ�ػ��߳�
		t4.setDaemon(true);
		t5.setDaemon(true);
		for(int i=1;i<=5;i++) {
			System.out.println("�������е��߳������ǣ�"+Thread.currentThread().getName());
		}
		
//		
		
		
		
		
	}

}

class ThreadDemo extends Thread{
//	@override
	public void run() {
		System.out.println("�µ��߳̿�ʼ��");
		System.out.println("�������е��߳������ǣ�"+getName());
	}
}

class ThreadPriority extends Thread{
//	@Override
	public void run() {
		for(int i=1;i<=100;i++) {
			System.out.println("�������߳�"+getName()+"��������"+i+"�Σ�");
		}
	}
}

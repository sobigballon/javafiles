package learning_JAVA;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class ThreadTest {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		myThread m1=new myThread();
		myThread m2=new myThread();
		m1.start();
		m2.start();
		
		myRunnable m3=new myRunnable();
		myRunnable m4=new myRunnable();
		Thread x=new Thread(m3,"�߳�3");
		Thread y=new Thread(m4,"�߳�4");
		x.start();
		y.start();
		
		myCallable m5=new myCallable();
		FutureTask<Integer> task=new FutureTask<Integer>(m5);
		
		Thread z=new Thread(task,"�з���ֵ���̣߳�");
		z.start();
		try {
			System.out.println("�̵߳ķ���ֵ��"+task.get());
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}

}

class myThread extends Thread{
	private int i=0;
	public void run(){
		// ���߳���̳�Thread��ʱ��ֱ��ʹ��this���ɻ�ȡ��ǰ�߳̾����
        // ��˿���ֱ�ӵ���getName()�������ص�ǰ�̵߳����ơ�
		System.out.println("��ǰ�߳�Ϊ��"+getName());
		for(;i<5;i++) {
			System.out.println(getName()+":"+i);
			try {
				//�ñ���߳�Ҳ��ִ�еĻ���
				Thread.sleep(10);
			}catch(Exception e) {
				
			}
		}
	}
}

class myRunnable implements Runnable{
	private int i=0;
	@Override
	public void run() {
		// TODO �Զ����ɵķ������
		System.out.println("��ǰ�߳�Ϊ��"+Thread.currentThread().getName());
		for(;i<5;i++) {
			System.out.println(Thread.currentThread().getName()+":"+i);
			try {
				//�ñ���߳�Ҳ��ִ�еĻ���
				// ��Ϊsleep�Ǿ�̬���������Բ���Ҫͨ��Thread.currentThread()������ȡ��ǰ�߳̾��
				Thread.sleep(10);
			}catch(Exception e) {
				
			}
		}
	}	
}


class myCallable implements Callable<Integer>{

	@Override
	public Integer call() throws Exception {
		// TODO �Զ����ɵķ������
		System.out.println("��ǰ�߳�Ϊ��"+Thread.currentThread().getName());
		int i=0;
		for(;i<5;i++) {
			System.out.println("ѭ������i��ֵ��"+i);
		}
		
		return i;
	}
	
}

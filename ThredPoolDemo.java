package someotherTest;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThredPoolDemo {
	public static void main(String[] args) {
		myRunnable mr=new myRunnable();
//		创建线程池
		ExecutorService pool=Executors.newFixedThreadPool(5);
		
		pool.submit(mr);
		pool.submit(mr);
		pool.submit(mr);
		pool.submit(mr);
		pool.submit(mr);
		
		pool.shutdown();
	}

}

class myRunnable implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1;i<100;i++) {
			System.out.println(Thread.currentThread().getName()+"运行到了"+i+"次了！");
		}
	}
	
}

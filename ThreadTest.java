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
		Thread x=new Thread(m3,"线程3");
		Thread y=new Thread(m4,"线程4");
		x.start();
		y.start();
		
		myCallable m5=new myCallable();
		FutureTask<Integer> task=new FutureTask<Integer>(m5);
		
		Thread z=new Thread(task,"有返回值的线程！");
		z.start();
		try {
			System.out.println("线程的返回值："+task.get());
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}

}

class myThread extends Thread{
	private int i=0;
	public void run(){
		// 当线程类继承Thread类时，直接使用this即可获取当前线程句柄。
        // 因此可以直接调用getName()方法返回当前线程的名称。
		System.out.println("当前线程为："+getName());
		for(;i<5;i++) {
			System.out.println(getName()+":"+i);
			try {
				//让别的线程也有执行的机会
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
		// TODO 自动生成的方法存根
		System.out.println("当前线程为："+Thread.currentThread().getName());
		for(;i<5;i++) {
			System.out.println(Thread.currentThread().getName()+":"+i);
			try {
				//让别的线程也有执行的机会
				// 因为sleep是静态方法，所以不需要通过Thread.currentThread()方法获取当前线程句柄
				Thread.sleep(10);
			}catch(Exception e) {
				
			}
		}
	}	
}


class myCallable implements Callable<Integer>{

	@Override
	public Integer call() throws Exception {
		// TODO 自动生成的方法存根
		System.out.println("当前线程为："+Thread.currentThread().getName());
		int i=0;
		for(;i<5;i++) {
			System.out.println("循环变量i的值："+i);
		}
		
		return i;
	}
	
}

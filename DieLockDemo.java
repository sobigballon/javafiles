package someotherTest;
/*
 * 死锁：是指两个或者两个以上的线程在执行的过程中，因争夺资源产生的一种互相等待现象
 */

public class DieLockDemo {
	public static void main(String[] args) {
		Dielock  d=new Dielock();
		
		Thread t1=new Thread(d);
		Thread t2=new Thread(d);
		t1.start();
		t2.start();
	}

}

class MyLock {
	public static final Object objA = new Object();
	public static final Object objB = new Object();
}

class Dielock implements Runnable{
	private boolean flag;

	public void DieLock(boolean flag) {
		this.flag = flag;
	}

	@Override
	public void run() {
		if (flag) {
			synchronized (MyLock.objA) {
				System.out.println("if objA"); 
				synchronized (MyLock.objB) {
					System.out.println("if objB");
				}
			}
		} else {
			synchronized (MyLock.objB) {
				System.out.println("else objB");
				synchronized (MyLock.objA) {
					System.out.println("else objA");
				}
			}
		}   
	}
}
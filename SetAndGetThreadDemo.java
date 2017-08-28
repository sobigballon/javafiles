package someotherTest;
//方法加锁

public class SetAndGetThreadDemo {
	public static void main(String[] args) {
		tstudent2 ts=new tstudent2();
		
		Set t1=new Set(ts);
		Get t2=new Get(ts);
		
		Thread th1=new Thread(t1);
		Thread th2=new Thread(t2);
		
		th1.start();
		th2.start();
		
	}

}

class Set implements Runnable{
	private  tstudent2 ts;
	private int x=0;
	

	public Set(tstudent2 ts) {
		// TODO Auto-generated constructor stub
		this.ts=ts;
	}


	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			if(x%2==0) {
				ts.set("大东",30);
			}else {
				ts.set("大北", 34);
			}
			x++;
		}
	}
	
}

class Get implements Runnable{
	private  tstudent2 ts;

	public Get(tstudent2 ts) {
		// TODO Auto-generated constructor stub
		this.ts=ts;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			ts.get();
		}
	}
	
}

class tstudent2{
	private int age;
	private String name;
	boolean flag=false;
	
	public synchronized void set(String name,int age) {
		if(this.flag) {
			try {
				this.wait();
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.name=name;
		this.age=age;
		this.flag=true;
		this.notify();
	}
	
	public synchronized void get() {
		if(!this.flag) {
			try {
				this.wait();
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println(this.name+"----"+this.age);
			
			this.flag=false;
			this.notify();
		}
	}
}
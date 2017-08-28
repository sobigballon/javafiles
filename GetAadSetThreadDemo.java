package someotherTest;
//代码块加锁

public class GetAadSetThreadDemo {
	public static void main(String[] args) {
		tstudent ts=new tstudent();
		SetThread s=new SetThread(ts);
		GetThread g=new GetThread(ts);
		
		Thread t=new Thread(s);
		Thread t2=new Thread(g);
		
		t.start();
		t2.start();
	}
	
}
class SetThread implements Runnable{
	private tstudent ts;

	public SetThread(tstudent ts){
		this.ts=ts;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			synchronized(ts) {
				if(!ts.flag) {
					try {
						ts.wait();
					}catch(InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println(ts.name+"----"+ts.age);
				ts.flag=false;
				ts.notify();
			}
		}
	}
	
}

class GetThread implements Runnable{
	private tstudent ts;
	private int x=0;
	
	public GetThread(tstudent ts) {
		this.ts=ts;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			synchronized(ts) {
				if(ts.flag) {
					try {
						ts.wait();
					}catch(InterruptedException e) {
						e.printStackTrace();
					}
				}
				if(x%2==0) {
					ts.name="亮子";
					ts.age=34;
				}
				else {
					ts.name="铁头";
					ts.age=35;
				}
				x++;
				ts.flag=true;
				ts.notify();
			}
		}
		
	}
	
}

class tstudent{
	String name;
	int age;
	boolean flag=true;
	
}
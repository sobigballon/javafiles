package keyWordTest;

public class WatiAndNotifyAndSetAndGet {
	public static void main(String[] args) {
	Student s=new Student();
	GetThread2 gt=new GetThread2(s);
	SetThread2 st=new SetThread2(s);
	gt.start();
	st.start();
	}
}


//将get看作是消费者
class GetThread2 extends Thread{
	private Student s;
	public GetThread2(Student s) {
		this.s=s;
	}
	public void run() {
		while(true) {
			synchronized(s) {
				if(!s.flag) {
					try {
						s.wait();
					}catch(InterruptedException e) {
						e.printStackTrace();
						}
				}
				System.out.println(s.getAge()+"----"+s.getName());
				
//				给出唤醒提示,注意：此处的唤醒是唤醒对方获取锁。
				s.flag=false;
				s.notify();
			}
		}
	}
}

//将set看作为生产者
class SetThread2 extends Thread{
	private Student s;
	private int x=0;
	
	public SetThread2(Student s) {
		this.s=s;
	}
	public void run() {

		while(true) {
			synchronized(s) {
				if(s.flag) {
					try {
						s.wait();
					}catch(InterruptedException e) {
						e.printStackTrace();
					}
				}
				if(x%2==0) {
					s.setAge(28);
					s.setName("林青霞");
				}else {
					s.setAge(30);
					s.setName("关之琳");
				}
				x++;
//				给出唤醒提示,注意：此处的唤醒是唤醒对方获取锁。
				s.flag=true;
				s.notify();
			}
		}
	}
}

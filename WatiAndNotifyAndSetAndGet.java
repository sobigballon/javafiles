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


//��get������������
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
				
//				����������ʾ,ע�⣺�˴��Ļ����ǻ��ѶԷ���ȡ����
				s.flag=false;
				s.notify();
			}
		}
	}
}

//��set����Ϊ������
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
					s.setName("����ϼ");
				}else {
					s.setAge(30);
					s.setName("��֮��");
				}
				x++;
//				����������ʾ,ע�⣺�˴��Ļ����ǻ��ѶԷ���ȡ����
				s.flag=true;
				s.notify();
			}
		}
	}
}

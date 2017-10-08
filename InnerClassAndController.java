package learning_JAVA;
/**
 * ������ƵĹؼ����������仯�Ķ�����û�б仯�Ķ����ֿ����籾���е�Events��Controller
 * ��Ҫ�����action��description���ɼ̳�Event�࣬ʵ�ֲ�ͬ���¼���
 * �����ڲ��࣬�ɽ������actionϸ������������
 * ���ڲ���ɷ���ķ����ⲿ����κγ�Ա����ִ�й��̸��������
 * �����뿴GreenHouseController
 * @author Administrator
 *
 */

//���ƿ�ܵľ���ʵ��
public class InnerClassAndController {
	private EventSet es=new EventSet();
	public void addEvent(Event c) {es.add(c);}
	public void run() {
		Event e;
		while((e=es.getNext())!=null) {
			if(e.ready()) {
				e.action();
				System.out.println(e.description());
				es.removeCurrent();
			}
		}
	}

}

//����һ��������װ�ض���
class EventSet{
	private Event[] events=new Event[100];
	private int index=0;
	private int next=0;
	public void add(Event e) {
		if(index>=events.length) {
			return; //һ���ڴ˴��׳��쳣��IndexoutException
		}
		events[index++]=e; //��δ��������Ӷ���
	}
	
	public Event getNext() {
		boolean looped=false;
		int start=next;
		do {
			next=(next+1)%events.length;
//			��֤���Ƿ�ѭ���������
			if(start==next) looped=true;
//			���ѭ������㣬���������ǿյ�
			if((next==(start+1)%events.length)&&looped)
				return null;
		}while(events[next]==null);
		return events[next]; //����next��
	}
	
//	�˴���������������Ϊnull���Ա�gc������ʱ���ա�
	public void removeCurrent() {
		events[next]=null;
	}
	
}

// �����ඨ��ʱ�䣬action()Ϊʱ�������description()Ϊ�¼���ص�������
abstract class Event{
	private long evtTime;
	public Event(long eventTime) {
		evtTime=eventTime;
	}
	public boolean ready() {
		return System.currentTimeMillis()>=evtTime;
	}
	
	abstract public void action();
	abstract public String description();
}


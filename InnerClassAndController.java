package learning_JAVA;
/**
 * 所有设计的关键，将发生变化的东西和没有变化的东西分开，如本例中的Events与Controller
 * 若要具体的action及description，可继承Event类，实现不同的事件。
 * 运用内部类，可将具体的action细节隐藏起来。
 * 且内部类可方便的反问外部类的任何成员，让执行过程更加舒服。
 * 详情请看GreenHouseController
 * @author Administrator
 *
 */

//控制框架的具体实现
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

//定义一个容器来装载对象
class EventSet{
	private Event[] events=new Event[100];
	private int index=0;
	private int next=0;
	public void add(Event e) {
		if(index>=events.length) {
			return; //一般在此处抛出异常，IndexoutException
		}
		events[index++]=e; //若未满，则添加对象。
	}
	
	public Event getNext() {
		boolean looped=false;
		int start=next;
		do {
			next=(next+1)%events.length;
//			验证其是否循环到了起点
			if(start==next) looped=true;
//			如果循环在起点，怎容器中是空的
			if((next==(start+1)%events.length)&&looped)
				return null;
		}while(events[next]==null);
		return events[next]; //返回next；
	}
	
//	此处将对象引用设置为null，以便gc程序发现时回收。
	public void removeCurrent() {
		events[next]=null;
	}
	
}

// 抽象类定义时间，action()为时间操作，description()为事件相关的描述。
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


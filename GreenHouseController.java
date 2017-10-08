package learning_JAVA;
/**
 * ������ģ�������еĸ������ϵͳ����Controller �̳ж����ģ�
 * ���ڿ���ϵͳ�ĵ������ã�
 * ���еĶ�������һ�����У��ڲ���������Ʋ�ͬ�Ĺ��ܵ��¼���
 * @author Administrator
 *
 */

public class GreenHouseController extends InnerClassAndController{
//	����
	private boolean light=false;
// ��ˮ
	private boolean water=false;
//	����
	private String thermostat="DAy";
	private class LightOn extends Event{
		public LightOn(long eventTime) {
			super(eventTime);
		}
	

		@Override
		public void action() {
			// TODO �Զ����ɵķ������
//			�򿪵��
			light=true;
			
		}
		@Override
		public String description() {
			// TODO �Զ����ɵķ������
			return "Light is on";
			}
		}
	
	private class LightOff extends Event{
		public LightOff(long eventTime) {
			super(eventTime);
		}
	

		@Override
		public void action() {
			// TODO �Զ����ɵķ������
//			�򿪵��
			light=false;
			
		}
		@Override
		public String description() {
			// TODO �Զ����ɵķ������
			return "Light is off";
			}
		}
	private class WaterOn extends Event{

		public WaterOn(long eventTime) {
			super(eventTime);
			// TODO �Զ����ɵĹ��캯�����
		}

		@Override
		public void action() {
			// TODO �Զ����ɵķ������
			water=true;
			
		}

		@Override
		public String description() {
			// TODO �Զ����ɵķ������
			return "GreenHouse water is on";
		}
		
	}
	
	private class WaterOff extends Event{

		public WaterOff(long eventTime) {
			super(eventTime);
			// TODO �Զ����ɵĹ��캯�����
		}

		@Override
		public void action() {
			// TODO �Զ����ɵķ������
			water=false;
			
		}

		@Override
		public String description() {
			// TODO �Զ����ɵķ������
			return "GreenHouse water is off";
		}
		
	}
	
	private class ThermostatDay extends Event{

		public ThermostatDay(long eventTime) {
			super(eventTime);
			// TODO �Զ����ɵĹ��캯�����
		}

		@Override
		public void action() {
			// TODO �Զ����ɵķ������
			thermostat="DAY";
			
		}

		@Override
		public String description() {
			// TODO �Զ����ɵķ������
			return "Thermostat on day setting";
		}
	}
	
	private class ThermostatNight extends Event{

		public ThermostatNight(long eventTime) {
			super(eventTime);
			// TODO �Զ����ɵĹ��캯�����
		}

		@Override
		public void action() {
			// TODO �Զ����ɵķ������
			thermostat="NIGHT";
			
		}

		@Override
		public String description() {
			// TODO �Զ����ɵķ������
			return "Thermostat on night setting";
		}
	}
	
//	����
	private int rings;
	private class Bell extends Event{

		public Bell(long eventTime) {
			super(eventTime);
			// TODO �Զ����ɵĹ��캯�����
		}

		@Override
		public void action() {
			// TODO �Զ����ɵķ������
			System.out.println("Belling");
			if(--rings>0) {
				addEvent(new Bell(System.currentTimeMillis()+2000));
			}
		}

		@Override
		public String description() {
			// TODO �Զ����ɵķ������
			return "Ring bell";
		}
	}
	private class Restart extends Event{

		public Restart(long eventTime) {
			super(eventTime);
			// TODO �Զ����ɵĹ��캯�����
		}

		@Override
		public void action() {
			// TODO �Զ����ɵķ������
			long tm=System.currentTimeMillis();
			//�˴����Դ�һ���ļ��ܽ�����Ϣ
			rings=5;
			addEvent(new ThermostatNight(tm));
			addEvent(new LightOn(tm+1000));
			addEvent(new LightOff(tm+2000));
			addEvent(new WaterOn(tm+3000));
			addEvent(new WaterOff(tm+8000));
			addEvent(new Bell(tm+9000));
			addEvent(new ThermostatDay(tm+10000));
//			������������������
			addEvent(new Restart(tm+20000));
			
		}

		@Override
		public String description() {
			// TODO �Զ����ɵķ������
			return "Restarting System";
		}
	}
	
	public static void main(String[] args) {
		GreenHouseController gc=
				new GreenHouseController();
		long tm=System.currentTimeMillis();
		gc.addEvent(gc.new Restart(tm));
		gc.run();
	}
	
}

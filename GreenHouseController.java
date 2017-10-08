package learning_JAVA;
/**
 * 本类是模拟温室中的各类控制系统，从Controller 继承而来的，
 * 关于控制系统的典型运用，
 * 所有的东西都在一个类中，内部类允许控制不同的功能的事件。
 * @author Administrator
 *
 */

public class GreenHouseController extends InnerClassAndController{
//	照明
	private boolean light=false;
// 供水
	private boolean water=false;
//	调温
	private String thermostat="DAy";
	private class LightOn extends Event{
		public LightOn(long eventTime) {
			super(eventTime);
		}
	

		@Override
		public void action() {
			// TODO 自动生成的方法存根
//			打开电灯
			light=true;
			
		}
		@Override
		public String description() {
			// TODO 自动生成的方法存根
			return "Light is on";
			}
		}
	
	private class LightOff extends Event{
		public LightOff(long eventTime) {
			super(eventTime);
		}
	

		@Override
		public void action() {
			// TODO 自动生成的方法存根
//			打开电灯
			light=false;
			
		}
		@Override
		public String description() {
			// TODO 自动生成的方法存根
			return "Light is off";
			}
		}
	private class WaterOn extends Event{

		public WaterOn(long eventTime) {
			super(eventTime);
			// TODO 自动生成的构造函数存根
		}

		@Override
		public void action() {
			// TODO 自动生成的方法存根
			water=true;
			
		}

		@Override
		public String description() {
			// TODO 自动生成的方法存根
			return "GreenHouse water is on";
		}
		
	}
	
	private class WaterOff extends Event{

		public WaterOff(long eventTime) {
			super(eventTime);
			// TODO 自动生成的构造函数存根
		}

		@Override
		public void action() {
			// TODO 自动生成的方法存根
			water=false;
			
		}

		@Override
		public String description() {
			// TODO 自动生成的方法存根
			return "GreenHouse water is off";
		}
		
	}
	
	private class ThermostatDay extends Event{

		public ThermostatDay(long eventTime) {
			super(eventTime);
			// TODO 自动生成的构造函数存根
		}

		@Override
		public void action() {
			// TODO 自动生成的方法存根
			thermostat="DAY";
			
		}

		@Override
		public String description() {
			// TODO 自动生成的方法存根
			return "Thermostat on day setting";
		}
	}
	
	private class ThermostatNight extends Event{

		public ThermostatNight(long eventTime) {
			super(eventTime);
			// TODO 自动生成的构造函数存根
		}

		@Override
		public void action() {
			// TODO 自动生成的方法存根
			thermostat="NIGHT";
			
		}

		@Override
		public String description() {
			// TODO 自动生成的方法存根
			return "Thermostat on night setting";
		}
	}
	
//	响铃
	private int rings;
	private class Bell extends Event{

		public Bell(long eventTime) {
			super(eventTime);
			// TODO 自动生成的构造函数存根
		}

		@Override
		public void action() {
			// TODO 自动生成的方法存根
			System.out.println("Belling");
			if(--rings>0) {
				addEvent(new Bell(System.currentTimeMillis()+2000));
			}
		}

		@Override
		public String description() {
			// TODO 自动生成的方法存根
			return "Ring bell";
		}
	}
	private class Restart extends Event{

		public Restart(long eventTime) {
			super(eventTime);
			// TODO 自动生成的构造函数存根
		}

		@Override
		public void action() {
			// TODO 自动生成的方法存根
			long tm=System.currentTimeMillis();
			//此处可以从一个文件总解析信息
			rings=5;
			addEvent(new ThermostatNight(tm));
			addEvent(new LightOn(tm+1000));
			addEvent(new LightOff(tm+2000));
			addEvent(new WaterOn(tm+3000));
			addEvent(new WaterOff(tm+8000));
			addEvent(new Bell(tm+9000));
			addEvent(new ThermostatDay(tm+10000));
//			甚至可设置重启对象
			addEvent(new Restart(tm+20000));
			
		}

		@Override
		public String description() {
			// TODO 自动生成的方法存根
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

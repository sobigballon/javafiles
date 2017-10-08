package keyWordTest;
/**
 * ��ȿ�¡�����Զ����У������ֶ�����
 * @author Administrator
 *
 */

public class DeepCloneTest {
	public static void main(String[] args) {
		OceanReading reading=
				new OceanReading(33.9,100.5);
		OceanReading r=(OceanReading)reading.clone();
	}
	
}

class DepthReading implements Cloneable{
	private double depth;
	public DepthReading(double depath) {
		this.depth=depath;
	}
	public Object clone() {
		Object o=null;
		try {
			o=super.clone();
		}catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return o;
	}
}

class TemperatureReading implements Cloneable{
	private long time;
	private double temperature;
	public TemperatureReading(double temperature) {
		this.temperature=temperature;
	}
	public Object clone() {
		Object o=null;
		try {
			o=super.clone();
		}catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return o;
	}
}

//OceanReading����������ϲ����ɵģ�����������н�����ȿ�¡
class OceanReading implements Cloneable{
	private DepthReading depth;
	private TemperatureReading temperature;
	public OceanReading(double tdata,double ddata) {
		temperature=new TemperatureReading(tdata);
		depth=new DepthReading(ddata);
	}
	public Object clone() {
//		��¡�������OceanReading���࣬�Ա�������������࣬ͬʱ������п�¡
		OceanReading o=null;
		try {
			o=(OceanReading)super.clone();
		}catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
		o.depth=(DepthReading)o.depth.clone();
		o.temperature=(TemperatureReading)o.temperature.clone();
		return o;
	}
	
}



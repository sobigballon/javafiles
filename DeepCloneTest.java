package keyWordTest;
/**
 * 深度克隆不能自动进行，必须手动进行
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

//OceanReading是由两个类合并而成的，必须进行自行进行深度克隆
class OceanReading implements Cloneable{
	private DepthReading depth;
	private TemperatureReading temperature;
	public OceanReading(double tdata,double ddata) {
		temperature=new TemperatureReading(tdata);
		depth=new DepthReading(ddata);
	}
	public Object clone() {
//		克隆必须造成OceanReading的类，以便访问其他两个类，同时对其进行克隆
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



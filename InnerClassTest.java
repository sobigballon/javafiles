package learning_JAVA;
/**
 * 在方法内部创建内部类，完全隐藏了类的具体实现，方法作为内部类的一个实现接口。
 * @author Administrator
 *
 */

public class InnerClassTest {
	public static void main(String[] args) {
//		采用类的默认构造器创建类的引用
		Parce14 p=new Parce14();
//		类的构造函数为私有，因此不可使用new方法，只能条用cast方法创建引用
		Destination d=p.cast("Newziland");
		System.out.println(d.readLabel());
	}

}

interface Destination{
	String readLabel();
}

class Parce14{
	public Destination cast(String s) {
//		方法中的内部类，不会产生命名冲突的问题
		class PDestination implements Destination{
			private String Label;
			private PDestination(String WhereTo) {
			Label=WhereTo;
			}

			@Override
			public String readLabel() {
				// TODO 自动生成的方法存根
				return Label;
			}
		
		} 
//		向上塑性为街口类型
	return new PDestination(s);
	}
}
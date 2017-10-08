package learning_JAVA;
/**
 * 在方法体中采用匿名内部内。
 * @author Administrator
 *
 */

public class NamelessInnerClassTest {
	public Contents cast() {
//		返回一个接口的衍生类的自动向上塑性的引用。因实现接口的衍生类是匿名的，因此并未出现implements关键字。
		return new Contents() {
			private int i=11;
			@Override
			public int value() {
				// TODO 自动生成的方法存根
				return i;
			}
			
		};
	}
	
	public static void main(String[] args) {
		NamelessInnerClassTest nlct=new NamelessInnerClassTest();
//		通过方法实例接口对象，并利用方法街口的方法取得相应的值
		System.out.println(nlct.cast().value());
	}

}

//定义功能街口
interface Contents{
	int value();
}
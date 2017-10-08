package learning_JAVA;
/**
 * 匿名内部类调用外部对象时，须将外部对象定义为final型的。如方法
 * public Destination cost(final String dest,final float price)
 * 
 * 匿名内部类可使用｛｝作用域内的方法体来充当构造器的作用，但没有普通类的灵活，且不能定义多个。
 * @author Administrator
 *
 */
public class ConsturctorOfInnerclass {
//	匿名内部类要使用外部的对象（变量等），须将内部类的外部对象定义为final类型
	public Destination cost(final String dest,final float price) {
		return new Destination() {
			private int cost;
//			该方法体本质上相当于匿名内部类的构造器，但没有普通类的构造器那么灵活。
			{
				cost=Math.round(price);
				if(cost>100) {
					System.out.println("Over budget!");
				}
			}
			private String label=dest;
			@Override
			public String readLabel() {
				// TODO 自动生成的方法存根
				return label;
			}
			
		};
	}
	
	public static void main(String[] args) {
		ConsturctorOfInnerclass coi=new ConsturctorOfInnerclass();
		System.out.println(coi.cost("Newziland", 101.395F).readLabel());
	}

}

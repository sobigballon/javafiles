package learning_JAVA;
/**
 * �ڷ����ڲ������ڲ��࣬��ȫ��������ľ���ʵ�֣�������Ϊ�ڲ����һ��ʵ�ֽӿڡ�
 * @author Administrator
 *
 */

public class InnerClassTest {
	public static void main(String[] args) {
//		�������Ĭ�Ϲ����������������
		Parce14 p=new Parce14();
//		��Ĺ��캯��Ϊ˽�У���˲���ʹ��new������ֻ������cast������������
		Destination d=p.cast("Newziland");
		System.out.println(d.readLabel());
	}

}

interface Destination{
	String readLabel();
}

class Parce14{
	public Destination cast(String s) {
//		�����е��ڲ��࣬�������������ͻ������
		class PDestination implements Destination{
			private String Label;
			private PDestination(String WhereTo) {
			Label=WhereTo;
			}

			@Override
			public String readLabel() {
				// TODO �Զ����ɵķ������
				return Label;
			}
		
		} 
//		��������Ϊ�ֿ�����
	return new PDestination(s);
	}
}
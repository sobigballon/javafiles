package learning_JAVA;
/**
 * �ڷ������в��������ڲ��ڡ�
 * @author Administrator
 *
 */

public class NamelessInnerClassTest {
	public Contents cast() {
//		����һ���ӿڵ���������Զ��������Ե����á���ʵ�ֽӿڵ��������������ģ���˲�δ����implements�ؼ��֡�
		return new Contents() {
			private int i=11;
			@Override
			public int value() {
				// TODO �Զ����ɵķ������
				return i;
			}
			
		};
	}
	
	public static void main(String[] args) {
		NamelessInnerClassTest nlct=new NamelessInnerClassTest();
//		ͨ������ʵ���ӿڶ��󣬲����÷����ֿڵķ���ȡ����Ӧ��ֵ
		System.out.println(nlct.cast().value());
	}

}

//���幦�ֿܽ�
interface Contents{
	int value();
}
package learning_JAVA;
/**
 * �����ڲ�������ⲿ����ʱ���뽫�ⲿ������Ϊfinal�͵ġ��緽��
 * public Destination cost(final String dest,final float price)
 * 
 * �����ڲ����ʹ�ã����������ڵķ��������䵱�����������ã���û����ͨ������Ҳ��ܶ�������
 * @author Administrator
 *
 */
public class ConsturctorOfInnerclass {
//	�����ڲ���Ҫʹ���ⲿ�Ķ��󣨱����ȣ����뽫�ڲ�����ⲿ������Ϊfinal����
	public Destination cost(final String dest,final float price) {
		return new Destination() {
			private int cost;
//			�÷����屾�����൱�������ڲ���Ĺ���������û����ͨ��Ĺ�������ô��
			{
				cost=Math.round(price);
				if(cost>100) {
					System.out.println("Over budget!");
				}
			}
			private String label=dest;
			@Override
			public String readLabel() {
				// TODO �Զ����ɵķ������
				return label;
			}
			
		};
	}
	
	public static void main(String[] args) {
		ConsturctorOfInnerclass coi=new ConsturctorOfInnerclass();
		System.out.println(coi.cost("Newziland", 101.395F).readLabel());
	}

}

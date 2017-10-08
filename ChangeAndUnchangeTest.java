package learning_JAVA;
/**
 * �ص��Ϳ�������
 * ��װ�仯�Ĳ��֣��ò���Ĳ������ص��仯�Ĳ���
 * 
 */

import java.util.Vector;

public class ChangeAndUnchangeTest {

}

//�ֿڷ�װ�˱仯����
interface Compare{
	boolean lessThan(Object lhs,Object rhs);
	boolean lessThanOrequal(Object lhs,Object rhs);
}

//�ڲ���ķ������ûص���ʽ�����ñ仯��
class SortVector extends Vector<Object>{
	private Compare compare;
	public SortVector(Compare comp){
		compare=comp;
	}
	public void quicksort(int left,int right) {
		if(right>left) {
			Object ob1=elementAt(right);
			int i=left-1;
			int j=right;
			while(true) {
				while(compare.lessThan
						(elementAt(++i), ob1));
				;//ʡ����һ����ʲô���������������£���++i��i�������
				while(j>0)
					if(compare.lessThanOrequal
							(elementAt(--j), ob1))
						break;//�˳�ѭ��
				if(i>=j)break;
				swap(i,j);
			}
			swap(i,right);//����ʼѡ��Ļ�׼ֵ���ȸ�λֵ������ȥ
			quicksort(left,i-1);//�������߷ֱ�ݹ�
			quicksort(i+1,right);
		}
		
	}
	
//	�л�����λ�õ�ֵ
	public void swap(int loc1,int loc2) {
		Object temp=elementAt(loc1);
		setElementAt(elementAt(loc2),loc1);
		setElementAt(temp,loc2);
	}
}

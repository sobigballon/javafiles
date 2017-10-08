package learning_JAVA;
/**
 * 回调和快速排序
 * 封装变化的部分，用不便的部分来回调变化的部分
 * 
 */

import java.util.Vector;

public class ChangeAndUnchangeTest {

}

//街口封装了变化部分
interface Compare{
	boolean lessThan(Object lhs,Object rhs);
	boolean lessThanOrequal(Object lhs,Object rhs);
}

//在不变的方法中用回调方式来调用变化。
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
				;//省略了一步，什么都不做，继续往下，因++i，i会持续加
				while(j>0)
					if(compare.lessThanOrequal
							(elementAt(--j), ob1))
						break;//退出循环
				if(i>=j)break;
				swap(i,j);
			}
			swap(i,right);//将开始选择的基准值，既高位值调换回去
			quicksort(left,i-1);//左右两边分别递归
			quicksort(i+1,right);
		}
		
	}
	
//	叫唤两个位置的值
	public void swap(int loc1,int loc2) {
		Object temp=elementAt(loc1);
		setElementAt(elementAt(loc2),loc1);
		setElementAt(temp,loc2);
	}
}

package projecttest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*
 * ����¼�������ݣ���0������Ҫ���ڿ���̨������������е����ֵ
 * 
 * ������
 * 		A:���弯�ϣ����ڴ洢�������
 * 		B:ѭ������¼�����ݣ���while(true){}
 * 		C:�жϼ���¼��������Ƿ���0
 * 			�ǣ�break
 * 			����ӵ�����
 * 		D:�Ѽ���ת������
 * 		E:�������������(����)
 * 		F:��ȡ�����е����һ��Ԫ�ؼ���
 * 		
 */


public class GetMaxNumberDemo {
	public static void main(String[] args) {
		ArrayList<Integer> arr=new ArrayList<Integer>();
		Scanner sc=new Scanner(System.in);
		System.out.println("������Ҫ�Ƚϵ���������������0");
		while(true) {
			int i=sc.nextInt();
			if (i!=0) {
				arr.add(i);
			}
			else if(i==0) {
				break;
			}
		}
		String s=arr.toString();
		// �Ѽ���ת������
		Integer[] i=new Integer[arr.size()];//��������
		Integer[] iarry=arr.toArray(i);
		
		// �������������(����)
		Arrays.sort(iarry);//ע�������sort����	
		
		System.out.println("�����Ϊ��"+iarry[iarry.length-1]+" "+"�������Ϊ��"+s);
		
	}

}

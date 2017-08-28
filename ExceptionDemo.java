package someotherTest;

import java.text.ParseException;

/*
* java��������δ����쳣��?
* A:try��catch��finally
* B:throws
* 
* try��catch��finally��ʽ
* try {
* 		���ܳ�������Ĵ���
* }catch(�쳣���� ����) {
* 		�������Ĵ���
* }finally {
* 		�ͷ���Դ�Ĵ���
* }
* 
* finally�Ȼ��ڽ������ԣ����ʱ��������ʹ�ü򵥵ĸ�ʽ��
* try {
* 		���ܳ�������Ĵ���
* }catch(�쳣���� ����) {
* 		�������Ĵ���
* }
* 
* �����ܵİѿ��ܳ�������Ĵ�����try������������жϲ�����Щ�����⣬���Զ����һЩ��
*/

public class ExceptionDemo {
	public static void main(String[] args) {
		System.out.println("Hi");
		int a=10;
		int b=0;
		try {
			 // ����������쳣���ͻ������ﴴ��һ���쳣�Ķ���
			// new ArithmeticException();
			// Ȼ�����Ÿ��쳣���󣬵�catch����ȥƥ�䡣
			System.out.println(a/b);
		}catch(ArithmeticException e) {
//			System.out.println("��������Ϊ�㣡");
			System.out.println(e.getMessage());
			System.out.println(e.toString());
//			e.printStackTrace();
		}
		System.out.println("World!");
		
		try {
			show();
		} catch (ArithmeticException | NullPointerException | ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			show(10,0);
		}catch(ArithmeticException e) {
			System.out.println(e.toString());
		}
		finally {
			System.out.println("�ͷ���Դ!");
		}
	}
	
	public static void show() throws ParseException, ArithmeticException,
	NullPointerException {
		if ("hello".equals("world")) {
			throw new ParseException(null, 0);
			} else {
				System.out.println("over");
				}
		}
	
	public static void show(int a, int b) {
		if (b == 0) {
			// System.out.println("��������");
			throw new ArithmeticException();
		} else {
			System.out.println(a / b);
		}
		System.out.println("haha");
	}

}

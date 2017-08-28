package someotherTest;

import java.text.ParseException;

/*
* java中我们如何处理异常呢?
* A:try…catch…finally
* B:throws
* 
* try…catch…finally格式
* try {
* 		可能出现问题的代码
* }catch(异常类名 变量) {
* 		针对问题的处理
* }finally {
* 		释放资源的代码
* }
* 
* finally等会在讲，所以，这个时候，我们先使用简单的格式：
* try {
* 		可能出现问题的代码
* }catch(异常类名 变量) {
* 		针对问题的处理
* }
* 
* 尽可能的把可能出现问题的代码用try包含，如果你判断不了哪些有问题，可以多包含一些。
*/

public class ExceptionDemo {
	public static void main(String[] args) {
		System.out.println("Hi");
		int a=10;
		int b=0;
		try {
			 // 从哪里产生异常，就会在哪里创建一个异常的对象。
			// new ArithmeticException();
			// 然后，拿着该异常对象，到catch里面去匹配。
			System.out.println(a/b);
		}catch(ArithmeticException e) {
//			System.out.println("除数不能为零！");
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
			System.out.println("释放资源!");
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
			// System.out.println("数据有误");
			throw new ArithmeticException();
		} else {
			System.out.println(a / b);
		}
		System.out.println("haha");
	}

}

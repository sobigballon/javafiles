package projecttest;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
/*
 * 类 Date 表示特定的瞬间，精确到毫秒。 
 * 
 * 构造方法：
 * 		public Date():默认就是当前时间
 *		public Date(long date):把给定的毫秒值赋值给日期对象
 *
 * 成员方法：
 * 		public long getTime()：获取毫秒值
 *		public void setTime(long time):把毫秒值作为参数传递
 */

/*
 * DateFormat:是针对日期进行格式化和解析的抽象类。
 * 所以，我们学习其子类并使用。
 * SimpleDateForamt：
 * 格式化（日期 -> 文本）
 * 		Date	--	String
 * 				public final String format(Date date)
 * 				模式对象你想要什么就写什么。
 * 解析（文本 -> 日期）
 * 		String 	-- 	Date
 * 				public Date parse(String source)
 * 				模式对象必须和给定的字符串匹配。
 */


public class Datetest {
	public static void main(String[] args) throws ParseException{
		Date d=new Date(0);
		d.setDate(360000);
		System.out.println(d);
		long time = System.currentTimeMillis(); // 获取当前时间的毫秒值
//		Date d2 = new Date(time);// 把毫秒值转换为日期表示
		Date d2 = new Date(time);
		System.out.println(d2);
		SimpleDateFormat sdf=new SimpleDateFormat("HH:mm:ss");
//		sdf.format(d2);
		System.out.println(d2);
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日");
//		sdf1.format(d2);
		System.out.println(d2);
		sdf2.format(d2);
		System.out.println(d2);
		
		String s = "2008-08-08 12:23:34";
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		// public Date parse(String source)
		java.util.Date dd = sdf3.parse(s);
		System.out.println(dd);
		
	}

}

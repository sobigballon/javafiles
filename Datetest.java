package projecttest;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
/*
 * �� Date ��ʾ�ض���˲�䣬��ȷ�����롣 
 * 
 * ���췽����
 * 		public Date():Ĭ�Ͼ��ǵ�ǰʱ��
 *		public Date(long date):�Ѹ����ĺ���ֵ��ֵ�����ڶ���
 *
 * ��Ա������
 * 		public long getTime()����ȡ����ֵ
 *		public void setTime(long time):�Ѻ���ֵ��Ϊ��������
 */

/*
 * DateFormat:��������ڽ��и�ʽ���ͽ����ĳ����ࡣ
 * ���ԣ�����ѧϰ�����ಢʹ�á�
 * SimpleDateForamt��
 * ��ʽ�������� -> �ı���
 * 		Date	--	String
 * 				public final String format(Date date)
 * 				ģʽ��������Ҫʲô��дʲô��
 * �������ı� -> ���ڣ�
 * 		String 	-- 	Date
 * 				public Date parse(String source)
 * 				ģʽ�������͸������ַ���ƥ�䡣
 */


public class Datetest {
	public static void main(String[] args) throws ParseException{
		Date d=new Date(0);
		d.setDate(360000);
		System.out.println(d);
		long time = System.currentTimeMillis(); // ��ȡ��ǰʱ��ĺ���ֵ
//		Date d2 = new Date(time);// �Ѻ���ֵת��Ϊ���ڱ�ʾ
		Date d2 = new Date(time);
		System.out.println(d2);
		SimpleDateFormat sdf=new SimpleDateFormat("HH:mm:ss");
//		sdf.format(d2);
		System.out.println(d2);
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy��MM��dd�� HH:mm:ss");
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy��MM��dd��");
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

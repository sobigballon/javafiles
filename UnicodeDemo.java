package someotherTest;
/*
 * 
 * ���룺
 * 		�����ܹ������ı���㿴����
 * ���룺
 * 		���㿴����������ܿ�����
 * 
 */

import java.io.UnsupportedEncodingException;

public class UnicodeDemo {
	public static void main(String[] args) throws UnsupportedEncodingException {
		String s="���";
//		����
		byte[] b=s.getBytes("GBK");
		for(byte i:b) {
			System.out.println(i);
		}
//		����
		String s1=new String(b,"GBK");
		System.out.println(s1);
		
	}

}

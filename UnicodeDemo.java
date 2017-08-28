package someotherTest;
/*
 * 
 * 编码：
 * 		把你能够看懂的变成你看不懂
 * 解码：
 * 		把你看不懂变成你能看懂的
 * 
 */

import java.io.UnsupportedEncodingException;

public class UnicodeDemo {
	public static void main(String[] args) throws UnsupportedEncodingException {
		String s="你好";
//		编码
		byte[] b=s.getBytes("GBK");
		for(byte i:b) {
			System.out.println(i);
		}
//		解码
		String s1=new String(b,"GBK");
		System.out.println(s1);
		
	}

}

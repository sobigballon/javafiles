package someotherTest;

import java.util.ArrayList;
import java.util.Collections;

/*
 * 模拟斗地主洗牌和发牌
 * 
 * 扑克牌：54
 * 小王
 * 大王
 * 黑桃A,黑桃2,黑桃3,黑桃4,黑桃...,黑桃10,黑桃J,黑桃Q,黑桃K
 * 红桃...
 * 梅花...
 * 方块...
 * 
 * 分析：
 * 		A:造一个牌盒(集合)
 * 		B:造每一张牌，然后存储到牌盒里面去
 * 		C:洗牌
 * 		D:发牌
 * 		E:看牌
 */

public class PokerGameDemo {
	public static void main(String[] args) {
//		定义一个集合来存放所有的牌
		ArrayList<String> poker=new ArrayList<String>();
		
		String[] colors= {"♠", "♥", "♣", "♦" };
		String[] numbers= {"A","2","3","4","5","6",
				           "7","8","9","10","J","Q","K"};

//		将花色与数字进行组合
		for(String c:colors) {
			for(String n:numbers) {
//		public String concat(String str)	 关注该方法	
				poker.add(c.concat(n));
			}
		}
		poker.add("小王");
		poker.add("大王");
		
//		遍历纸牌
		
		for(String p:poker) {
			System.out.println(p);
		}
		
//		洗牌
		Collections.shuffle(poker);
		
//		发牌，三个玩家
		
		ArrayList<String> a=new ArrayList<String>(); 
		ArrayList<String> b=new ArrayList<String>(); 
		ArrayList<String> c=new ArrayList<String>();
//		三张底牌
		ArrayList<String> dipai=new ArrayList<String>();
//		String java.util.ArrayList.get(int index),关注此方法
		for(int i=0;i<poker.size();i++) {
			if(i>=poker.size()-3) {
				dipai.add(poker.get(i));
			}
			else if(i%3==0) {
				a.add(poker.get(i));
			}
			else if(i%3==1) {
				b.add(poker.get(i));
			}
			else if(i%3==2) {
				c.add(poker.get(i));
			}
		}
		
		lookpoker("黄晓明",a);
		lookpoker("朱晓明",b);
		lookpoker("刘晓明",c);
		lookpoker("底牌",dipai);
		
		
	}
	
//	看牌方法
	public static void lookpoker(String name,ArrayList<String> arry) {
		System.out.println(name+"的牌共"+arry.size()+"张，是：");
		
		for(String s:arry) {
			System.out.println(s+" ");
		}
		System.out.println();
	}

}

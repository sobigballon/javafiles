package someotherTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

/*
 * A:创建一个HashMap集合,存储所有的牌
 * B:创建一个ArrayList集合，存储索引
 * C:装牌
 * D:洗牌
 * E:发牌
 * F:看牌
 */


public class PokerGameHashMapDemo {
	public static void main(String[] args) {
//		定义HashMap集合
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
//		定义ArryList存放索引
		ArrayList<Integer> arry=new ArrayList<Integer>();
		String[] colors= {"♠", "♥", "♣", "♦" };
		String[] numbers= {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
		
//		存牌
		int key=0;
		for(String c:colors) {
			for(String n:numbers) {
				String value=c.concat(n);
				hm.put(key, value);
				arry.add(key);
				key++;
			}
		}
		hm.put(key, "小王");
		arry.add(key);
		key++;
		hm.put(key, "大王");
		arry.add(key);
		
//		检查牌堆
		for(Integer i:arry) {
			System.out.println(hm.get(i));
		}
		System.out.println(hm.size());
		
//		洗牌
		Collections.shuffle(arry);
		
//		发牌
		TreeSet<Integer> a=new TreeSet<Integer>();
		TreeSet<Integer> b=new TreeSet<Integer>();
		TreeSet<Integer> c=new TreeSet<Integer>();
		TreeSet<Integer> d=new TreeSet<Integer>();
		
		for (int i=0;i<arry.size();i++) {
			if(i>=arry.size()-3) {
				d.add(arry.get(i));
			}
			else if(i%3==0) {
				a.add(arry.get(i));
			}
			else if(i%3==1) {
				b.add(arry.get(i));
			}
			else if(i%3==2) {
				c.add(arry.get(i));
			}
		}
		
//		看牌
		lookpoker("黄晓明",a,hm);
		lookpoker("洪晓明",a,hm);
		lookpoker("刘二蛋",c,hm);
		lookpoker("底牌",d,hm);
	}
	
	public static void lookpoker(String name,TreeSet<Integer> ts,HashMap<Integer,String> hm) {
		System.out.println(name+"的牌共"+ts.size()+"张：");
		for(Integer i:ts) {
			System.out.println(hm.get(i)+" ");
		}
		System.out.println( );
	}

}

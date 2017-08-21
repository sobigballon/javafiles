package projecttest;

public class anothertest {
	public  static void  main(String[] args) {
		outer o=new outer();
		o.showing();
		int x=10;
		int y=20;
		demo d=new demo();
		int z=d.sum(x, y);
		System.out.println(z);
		
	}
}
class demo{
	public int sum(int a,int b) {
		return a+b;
	}
}


class outer {
	public int num=10;
	public void showing(){
		inner i=new inner();
		i.show();
	}
	class inner{
		public int num=20;
		public void show() {
			int num=30;
			System.out.println(num);
			System.out.println(this.num);
			System.out.println(new outer().num);
		}
	}
}

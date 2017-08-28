package someotherTest;

public class nimingThreadDemo {
	public static void main(String[] args) {
		new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				for(int i=0;i<=20;i++) {
					System.out.println("哈哈哈！"+i);
				}
			}
			
		}) {
//			重写了匿名内部类的方法
			@Override
			public void run() {
				// TODO Auto-generated method stub
				for(int i=0;i<=30;i++) {
					System.out.println("嘿嘿嘿！"+i);
				}
			}
			
		}.start();
	}

}

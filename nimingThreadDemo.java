package someotherTest;

public class nimingThreadDemo {
	public static void main(String[] args) {
		new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				for(int i=0;i<=20;i++) {
					System.out.println("��������"+i);
				}
			}
			
		}) {
//			��д�������ڲ���ķ���
			@Override
			public void run() {
				// TODO Auto-generated method stub
				for(int i=0;i<=30;i++) {
					System.out.println("�ٺٺ٣�"+i);
				}
			}
			
		}.start();
	}

}

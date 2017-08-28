package someotherTest;
// µœ÷Callabel And Future

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MycallableDemo {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService pool=Executors.newFixedThreadPool(5);
		
		Future<Integer> f1=pool.submit(new mycallable(50));	
		Future<Integer> f2=pool.submit(new mycallable(30));
		Future<Integer> f3=pool.submit(new mycallable(40));
		Future<Integer> f4=pool.submit(new mycallable(20));
		Future<Integer> f5=pool.submit(new mycallable(10));
		
		int n1=f1.get();
		int n2=f2.get();
		int n3=f3.get();
		int n4=f4.get();
		int n5=f5.get();
		
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		System.out.println(n4);
		System.out.println(n5);
		
		pool.shutdown();
	}

}

class mycallable implements Callable<Integer>{
	private int number;
	
	public mycallable(int number) {
		this.number=number;
	}

	@Override
	public Integer call() throws Exception {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=1;i<=number;i++) {
			sum+=i;
		}
		return sum;
	}
	
}

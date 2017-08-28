package someotherTest;

import java.text.ParseException;
import java.util.Timer;
import java.util.TimerTask;

public class TimerDemo {
	public static void main(String[] args) throws ParseException {
	
		Timer t=new Timer();
		t.schedule(new TimerTask() {
			public void run() {
				System.out.println("biubiubiu!");
			}
		},3000, 1000);
	}
	

}

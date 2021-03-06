package threadexam;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ThreadLab2 {
	public static void main(String args[]) {
		Thread t1 = new Thread(new Thread3());
		Thread t2 = new Thread(new Thread4());
		t1.start();
		t2.start();
		for(int i = 0;i<10;i++) {
			try { 
				Thread.sleep(3 * 1000);	// 3초마다
				System.out.println("number of milliseconds since " + 
						"January 1, 1970, 00:00:00 GMT");
			} catch(InterruptedException e) {}	
		}
	}
}

class Thread3 implements Runnable {
	public void run() {
		Date today;
		SimpleDateFormat date = new SimpleDateFormat("오늘은 MM월 dd일입니다.");	 
		for(int i = 0;i<3;i++) {
			try { 
				today = new Date();
				Thread.sleep(10 * 1000);	// 3초마다
				System.out.println(date.format(today));
			} catch(InterruptedException e) {}	
		}
	}
}

class Thread4 implements Runnable {
	public void run() {
		Date today;
		SimpleDateFormat date = new SimpleDateFormat("hh시 mm분 ss초");
		for(int i = 0;i<5;i++) {
			try { 
				today = new Date();
				Thread.sleep(5 * 1000);	// 3초마다
				System.out.println(date.format(today));
			} catch(InterruptedException e) {}	
		}
	}
}


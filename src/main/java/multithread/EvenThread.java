package multithread;

import java.util.Arrays;
import java.util.List;

public class EvenThread implements Runnable{
	@Override
	public void run() {
		List<Integer> even = Arrays.asList(2,4,6,8);
		for(int ele : even) {			
			System.out.println(ele);
			try {Thread.sleep(1000);}catch (InterruptedException e) {e.printStackTrace();}
		}
	}

}

package multithread;

import java.util.Arrays;
import java.util.List;

public class OddThread implements Runnable{

	@Override
	public void run() {
		List<Integer> even = Arrays.asList(3,5,7,9);
		for(int ele : even) {
			System.out.println(ele);
			try {Thread.sleep(1000);}catch (InterruptedException e) {e.printStackTrace();}
		}
	}

}

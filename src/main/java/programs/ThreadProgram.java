package programs;

import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ThreadProgram {

	public static void main(String[] args) {
		Integer[] arr = {1,2,3,4,5,6,7,8,9};
		 Optional<Integer> temp = Stream.of(arr).max(Comparator.naturalOrder());
		Integer[] oddArr = Stream.of(arr).filter(a -> a%2 != 0).toArray(Integer[]::new);
		Integer[] evenArr = Stream.of(arr).filter(a -> a%2 == 0).toArray(Integer[]::new);
		Thread1 t1 = new Thread1(new Printer(oddArr));
		Thread2 t2 = new Thread2(new Printer(evenArr));
		
		t1.start();		
		t2.start();

	}

}

class Thread1 extends Thread{
	Printer pref;
	
	Thread1(Printer p){
		pref = p;
	}
	
	@Override
	public void run() {
		pref.printThing("<<Thread1 running");
		
	}
	
}



class Thread2 extends Thread{

	Printer pref;
	
	Thread2(Printer p){
		pref = p;
	}
	
	@Override
	public void run() {
		pref.printThing("<<Thread2 running");
		
	}
	
	
}

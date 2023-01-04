package programs;

public class Printer {
	Integer[] arr;
	Printer(Integer[] a){
		arr = a;
	}
	
	synchronized void printThing(String content) {		
		for(int i = 0; i <= arr.length-1;i++) {			
			try {
				wait(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(content+"--count: "+arr[i]);
			notify();
		}
	}

}

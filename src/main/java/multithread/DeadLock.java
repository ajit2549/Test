package multithread;

class Shared{
	
	synchronized void test1(Shared s1) {
		System.out.println(Thread.currentThread().getName());
		System.out.println("into test1 method..");
		try{Thread.sleep(1000);}catch(InterruptedException e){};
		s1.test2();
		try{Thread.sleep(1000);}catch(InterruptedException e){};
		System.out.println("about to finish test1..");
	}
	
	synchronized void test2() {
		System.out.println("into test2 method..");
		try{Thread.sleep(1000);}catch(InterruptedException e){};
	}
}

class Thread1 extends Thread{
	Shared s1;
	Shared s2;
	
	public Thread1(Shared s1,Shared s2) {
		this.s1 = s1;
		this.s2 = s2;
	}
	
	@Override
	public void run() {
		s1.test1(s2);
	}
}

class Thread2 extends Thread{
	Shared s1;
	Shared s2;
	
	public Thread2(Shared s1,Shared s2) {
		this.s1 = s1;
		this.s2 = s2;
	}
	
	@Override
	public void run() {
		s2.test1(s1);
	}
}
public class DeadLock {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shared s1 = new Shared();
		Shared s2 = new Shared();
		
		Thread1 t1 = new Thread1(s1,s2);
		t1.start();
		Thread2 t2 = new Thread2(s1,s2);
		t2.start();

	}

}

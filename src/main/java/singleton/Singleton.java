package singleton;

import java.io.Serializable;
import java.util.Collections;

public class Singleton implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	private Singleton() {};
	
	private static Singleton instance = null;
	
	public static Singleton getInstance() {
		if(instance == null) {
			return new Singleton();
		}
		return instance;		
	}
	
	public void showMessage() {
		System.out.println("singleton method");
	}

}

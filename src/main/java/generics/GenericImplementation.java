package generics;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class GenericImplementation implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3673569302129636622L;

	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
	        String bobInput = s.nextLine(); 
	        String aliceInput = s.nextLine();
	        int counter = 0;

	        if(bobInput.length() > aliceInput.length()){
	            for(int i = 0 ; i <= aliceInput.length() - 1 ; i++){
	                if(bobInput.charAt(i) == aliceInput.charAt(i)){
	                    counter++;
	                }
	            }
	        }else if( bobInput.length() <= aliceInput.length()){
	            for(int i = 0 ; i <= bobInput.length() - 1 ; i++){
	                if(bobInput.charAt(i) == aliceInput.charAt(i)){
	                    counter++;
	                }
	            }
	        }               
	    
	        System.out.println(counter);
	    }

	}



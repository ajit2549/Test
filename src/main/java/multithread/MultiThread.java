package multithread;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class MultiThread {

	public static void main(String[] args) {
	List<Integer> lst = new ArrayList<>();
	lst.add(10);
	lst.add(20);
	lst.add(30);
	lst.add(40);
	lst.add(50);
	reverseLinkedList(lst);
	
	}
	
	private static List<Integer> reverseLinkedList(List<Integer> lst){
		for(int i = 0; i <= lst.size()/2; i++) {
			int temp =  lst.get(i);
			lst.set(i, lst.get(lst.size()-i-1));
			lst.set(lst.size()-i-1,temp);
		}
		return lst;
	}

}

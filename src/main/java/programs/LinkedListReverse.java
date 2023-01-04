package programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;

public class LinkedListReverse {
	
	public static void main(String[] args) {
		subarraySum(new int[] {1,2,3,7,5}, 5, 12);
		LinkedList<Integer> lkList = new LinkedList<Integer>();
		lkList.add(10);
		lkList.add(20);
		lkList.add(30);
		lkList.add(40);
		lkList.add(50);
		LinkedNode newHead = constructCircular(lkList);
		System.out.println(isCircular(newHead));
		LinkedNode head = createLinkedList(lkList);
		System.out.println(head);
		head = reverse(head);
		System.out.println(head);

	}
	
	static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        ArrayList<Integer> list = new ArrayList<Integer>();
        boolean test = false;
        for(int i = 0; i < n; i++){
            list.add(i+1);
            int sum = 0;
            int j = i;
            while(sum < s ){
            	if(sum == s) {
            		list.add(j+1);
                    break;
            	}
            	if(j < n) {
	                sum += arr[j];
	                j++;
            	}
                
            }
            if(sum == s){
                list.add(j);
                test = true;
                break;
            }
            list = new ArrayList<>();
        }
        if(test) {
        	return list;
        }else {
        	return (ArrayList<Integer>) Arrays.asList(-1);
        }
    }
	@SuppressWarnings("unused")
	private static LinkedNode createLinkedList(LinkedList<Integer> lst) {
		LinkedNode head = null;
		LinkedNode tail = null;
		for(int i = 0; i<= lst.size()-1; i++) {			
			LinkedNode current = new LinkedNode(lst.get(i));
			if(head == null) {
				head = current;
			}else {
				tail.setNode(current);
			}
			tail = current;
		}
		return head;		
	}
	

	private static LinkedNode constructCircular(LinkedList<Integer> lst) {
		LinkedNode head = null;
		LinkedNode tail = null;
		for(int i = 0; i<lst.size(); i++) {
			LinkedNode current = new LinkedNode(lst.get(i));
			if(head == null) {
				head = current;
			}else {
				tail.setNode(current);
			}
			tail = current;
		}
		System.out.println(head);
		tail.node = head;
		
		return head;		
	}
	
	
	private static boolean isCircular(LinkedNode node) {
		HashSet<LinkedNode> h = new HashSet<LinkedNode>();
		while(node != null) {
			if(h.contains(node)) {
				return true;
			}
			
			h.add(node);
		}
		return false;
		
	}
	
	private static LinkedNode reverse(LinkedNode head) {
		if (head == null) {
	        return null;
	    }
	    if (head.getNode() == null) {
	        return head;
	    }
	    LinkedNode node = reverse(head.getNode());
	    head.getNode().setNode(head);
	    head.setNode(null);
	    return node;
		
	}

}

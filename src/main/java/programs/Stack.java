package programs;

public class Stack {
	Node top;
	class Node {
		String item;
		Node next;
		public Node(String item) {
			this.item = item;
			this.next = null;			
		}
	}
	
	 void push(String element) {
		Node oldTop = top;
		top = new Node(element);
		top.next = oldTop;
	}
	 
	 String pop() {
		 top = top.next;
		 return top.item;
	 }
	 
	 boolean isEmpty() {
		 if(top == null) {
			 return true;
		 }else {
			 return false;
		 }
	 }
	public static void main(String[] args) {
		Stack stc = new Stack();
		System.out.println(stc.isEmpty());
		stc.push("element1");
		stc.push("element2");
		System.out.println(stc.pop());
		System.out.println(stc);

	}

}

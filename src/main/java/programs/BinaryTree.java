package programs;

import java.io.Serializable;
import java.util.Comparator;

public class BinaryTree implements Serializable{
	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;
	Node root;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree tree = new BinaryTree();
		tree.createBinaryTree();

	}
	
	private BinaryTree createBinaryTree() {
		BinaryTree bt = new BinaryTree();
		bt.add(5);
		bt.add(4);
		bt.add(3);
		bt.add(8);
		bt.add(6);
		bt.add(7);
		bt.add(5);
		return bt;
		
	}

	private void add(int value) {
		// TODO Auto-generated method stub
		root = addRecursiveNode(root,value);
		
	}

	private Node addRecursiveNode(Node currentNode,int value) {
		// TODO Auto-generated method stub
		if(currentNode == null) {
			return new Node(value);
		}
		
		if(value < currentNode.value) {
			currentNode.left = addRecursiveNode(currentNode.left, value);
		}else if(value > currentNode.value) {
			currentNode.right = addRecursiveNode(currentNode.right, value);
		}else {
			return currentNode;
		}
		
		return currentNode;
	}

}

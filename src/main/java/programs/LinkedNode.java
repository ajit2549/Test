package programs;

public class LinkedNode {
	int value;
	LinkedNode node;
	public LinkedNode(int value) {
		this.value = value;
		this.node = null;
	}
	@Override
	public String toString() {
		return "LinkedNode [value=" + value + ", node=" + node + "]";
	}
	public LinkedNode getNode() {
		return node;
	}
	public void setNode(LinkedNode node) {
		this.node = node;
	}

}

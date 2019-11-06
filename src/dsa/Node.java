package dsa;

public class Node {
	
	private Node next; //pointer reference
	// we have a Node inside of itself

	private String data;
	
	
	public Node() {
		super();
	}

	public Node(Node next, String data) {
		super();
		this.next = next;
		this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	} 
	
	@Override
	public String toString() {
		if (next != null) {
			return data + " -> ";
		}
		return data;
	}

}

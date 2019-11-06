package dsa;

public class MyLinkedList implements MyList {

	private Node head; // rep. beginning & tail is often used to rep. end
	private int myLength = 0;
	private Node tail;

	public boolean removeAt(int index) {
		// remove an object at a specified index
		Node node = head;
		if (index > myLength) {
			return false;
		}
		if (index == 0) {
			head = node.getNext();
			myLength--;
		} else {
			for (int i = 1; i < index; i++) {

				node = node.getNext();
				node.setNext(node.getNext().getNext());
			}
		}

		// returns false if index out of range
		return true;
	}

	public boolean insertAt(int index, String item) {
		// inserts a new item at a specified index
		// returns false if the index is out of range
//		if (isFull()) {
//			doubleLength();
//		}
//		for (int i = index; i > 0; i--) {
//			arr[i] = arr[i - 1];
//		}
//		arr[index] = item;
//		myLength++;
		// returns false if the index is out of range
		return true;
	}

	// leaving validation out of these methods due to simplicity and time

	// created a helper method to get the node at a certain location
	// to help us prevent some code duplication
	private Node getNodeAt(int index) {
		Node node = head;
		for (int i = 0; i < index; i++) {
			if (node == null) {
				return null;
			}
			node = node.getNext();
		}
		return node;
	}

	@Override
	public void addAtBeginning(String data) {
		// add a new Node and set it to the head
		head = new Node(head, data);
		myLength++;

	}

	@Override
	public void removeFromBeginning() {
		head = head.getNext();
		myLength--;
	}

	@Override
	public void addAtEnd(String data) {
		// check to make sure the list is not empty
		// if empty add to the beginning (hint: we have some code for that!)

		Node node = new Node(null, data);
		tail = getNodeAt(myLength - 1);
		tail.setNext(node);
		myLength++;

		// otherwise - create logic to add to the end (tail)
		// the reference to the next node should be null
		// increase the length

	}

	@Override
	public void removeFromEnd() {
		if (myLength < 2)
			head.setNext(null);

		Node newTail = getNodeAt(myLength - 2);
		newTail.setNext(null);

		myLength--;
	}

	@Override
	public String get(int index) {
		return null;
	}

	@Override
	public int size() {
		return myLength;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("[ ");
		Node node = head;

		// follow the links between the nodes until it reaches the end
		while (node != null) {
			sb.append(node);
			node = node.getNext();
		}
		sb.append(" ]");
		return sb.toString(); // StringBuilder is not a toString(), so we need that to make it into a readable
								// string
	}

}

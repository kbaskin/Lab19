package dsa;

public class MainApp {

	public static void main(String[] args) {

		MyArrayList list = new MyArrayList();
		list.addAtBeginning("hello");
		list.addAtBeginning("hello2");
		list.addAtBeginning("hello3");
		list.addAtBeginning("hello4"); // will show at beg. LIFO

		System.out.println(list); // prints whole list

		list.removeAt(1);
		System.out.println(list); // FIXME

		list.insertAt(1, "yay!");
		System.out.println(list); // adds yay! at index of 1

		// System.out.println(list.get(10));
		list.addAtEnd("success");
		System.out.println(list); // adds success at the end

		list.removeFromBeginning();
		System.out.println(list); // removes hello4 from beg

		list.removeFromEnd();
		System.out.println(list); // removes success from end

		System.out.println("\nLinkedList starts here: ");
		MyLinkedList linkedList = new MyLinkedList();
		linkedList.addAtBeginning("help");
		linkedList.addAtBeginning("help1");
		linkedList.addAtBeginning("help2"); // will show at beg. LIFO

		System.out.println(linkedList);

		linkedList.removeFromEnd();
		System.out.println(linkedList); // removes help

		linkedList.removeFromBeginning();
		System.out.println(linkedList); // will not include help2

		linkedList.addAtEnd("yay!");
		System.out.println(linkedList); // adds yay! to end

		linkedList.removeAt(1);
		System.out.println(list);

	}

}

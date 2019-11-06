package dsa;

public interface MyList {
	// to make it into an interface, delete word class and type interface in it's
	// place

	// this will be the parent class for MyArrayList &

	void addAtBeginning(String data);

	void removeFromBeginning(); // no need to take in a param, we just want to execute this method

	void addAtEnd(String data);

	void removeFromEnd(); // no param needed - we don't care what value is, we want it gone

	String get(int index); // ref. index they want to retrieve

	int size(); // how many items are in the list (aka the length)


}

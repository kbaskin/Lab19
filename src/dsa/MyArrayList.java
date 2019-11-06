package dsa;

import java.util.Arrays;

public class MyArrayList implements MyList {

	private String[] arr = new String[4]; // need to declare a size
	private int myLength = 0; // goal here is to track how many items populating in the array list

	public boolean removeAt(int index) {
		// remove an object at a specified index

		for (int i = index; i > 0; i++) {
			return true;
		}
		// returns false if index out of range
		return false;
	}

	public boolean insertAt(int index, String item) {
		// inserts a new item at a specified index
		if (isFull()) {
			doubleLength();
		}
		for (int i = index; i > 0; i--) {
			arr[i] = arr[i - 1];
		}
		arr[index] = item;
		myLength++;
		// returns false if the index is out of range
		return true;
	}


	// we will use this method as a helper method inside this class to see if list
	// is full or if we need to increase size
	private boolean isFull() { // private will only be returned in this class
		return arr.length == myLength;
	}

	// we will use this helper method as well to dynamically increase the size of
	// the array
	private void doubleLength() {
		// make a copy of the array that is twice as long
		arr = Arrays.copyOf(arr, arr.length * 2);
	}

	@Override
	public void addAtBeginning(String data) {
		if (isFull()) {
			doubleLength();
		} // no need to an else here

		// loop backwards and shift all the items over to make room for the new data
		for (int i = myLength; i > 0; i--) {
			arr[i] = arr[i - 1]; // this is assigning the element that was before it to the new index
		}
		arr[0] = data;
		myLength++;
	}


	@Override
	public void removeFromBeginning() {
		if (myLength != 0) {
			// we are going to the length - 1 because we want to force the last index to be
			// cut off
			for (int i = 0; i < arr.length - 1; i++) {
				arr[i] = arr[i + 1];
			}
			myLength--;
		}
	}

	// reference for Lab19
//	public void addInMiddle(String data) {
//		for (int i = index where you want new data; i < myLength - 1; i++) {
//			
//		}
//	}

	@Override
	public void addAtEnd(String data) {
		if (isFull()) {
			doubleLength();
		}
		arr[myLength] = data;
		myLength++;
	}

	@Override
	public void removeFromEnd() {
		if (myLength != 0) {
			//clear the slot and decrement the length
			arr[myLength - 1] = null;
			myLength--; 
		}
	}

	@Override
	public String get(int index) {
		if (index >= myLength) { // more indepth then needed or where we will go now
			throw new ArrayIndexOutOfBoundsException("index out of bounds");
		}
		return arr[index];
	}

	@Override
	public int size() {
		return myLength;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("[");

		// loop backwards and shift all the items over to make room for the new data
		// this is increasing the size also
		for (int i = 0; i < myLength; i++) {
			sb.append(arr[i]);
			if (i != myLength - 1) { // checking to make sure it hasn't reached the last index
				sb.append(", ");
			}
		}
		sb.append(" ]");
		return sb.toString();
	}

}

package com.setInterfaces;

//implement the comparable interface
//we will be forced to override its one method.

//If we sort based on something which is not having value or is null, 
//then we get exception again. So comparable to be used on that variable 
//which will not be zero or null.

public class BookCustomClassWithComparableForTreeSet implements Comparable<BookCustomClassWithComparableForTreeSet> {

	int id;
	String name, author, publisher;
	int quantity;

	public BookCustomClassWithComparableForTreeSet(int id, String name, String author, String publisher, int quantity) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.quantity = quantity;
	}

	// implement this method on that attribute which can never have null value like
	// id etc.
	// See how compare to is implemented on id object:
	@Override
	public int compareTo(BookCustomClassWithComparableForTreeSet o) {
		if (id > o.id) {
			return 1;
		} else if (id < o.id) {
			return -1;
		} else {
			return 0;
		}
	}

}

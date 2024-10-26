package com.setInterfaces;

import java.util.HashSet;

public class HashSetWithCustomClass {

	// we get all values even though there are duplicates, because every object of
	// custom class is treated differently. Every object is stored in different heap
	// memory and object references are stored in different stack memory.

	public static void main(String[] args) {

		HashSet<BookCustomClass> hs1 = new HashSet<>();

		BookCustomClass b1 = new BookCustomClass(0, null, null, "tiger", 5000);
		BookCustomClass b2 = new BookCustomClass(0, null, null, "tiger", 5000);
		BookCustomClass b3 = new BookCustomClass(1, "hello", "nelson", "tiger", 55000);
		BookCustomClass b4 = new BookCustomClass(2, "jinder", "mandela", "lion", 15000);

		// in output the same order will not be there, in the way we added.
		hs1.add(b4);
		hs1.add(b2);
		hs1.add(b1);
		hs1.add(b3);

		for (BookCustomClass bookCustomClass : hs1) {
			System.out.println(bookCustomClass.id + " " + bookCustomClass.author + " " + bookCustomClass.name + " "
					+ bookCustomClass.publisher + " " + bookCustomClass.quantity);
		}

	}

}

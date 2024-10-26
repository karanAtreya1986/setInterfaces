package com.setInterfaces;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetWithCustomClass {

	public static void main(String[] args) {

		// only line change for custom class for link hash set.
		LinkedHashSet<BookCustomClass> hs1 = new LinkedHashSet<>();

		BookCustomClass b1 = new BookCustomClass(0, null, null, "tiger", 5000);
		BookCustomClass b2 = new BookCustomClass(0, null, null, "tiger", 5000);
		BookCustomClass b3 = new BookCustomClass(1, "hello", "nelson", "tiger", 55000);
		BookCustomClass b4 = new BookCustomClass(2, "jinder", "mandela", "lion", 15000);

		// in output the same order will be there, in the way we added below.
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

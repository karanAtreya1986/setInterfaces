package com.setInterfaces;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TreeSetWithCustomClass {

	public static void main(String[] args) {

		// only line change for custom class for tree set.
		TreeSet<BookCustomClass> hs1 = new TreeSet<>();

		BookCustomClass b1 = new BookCustomClass(0, null, null, "tiger", 5000);
		BookCustomClass b2 = new BookCustomClass(0, null, null, "tiger", 5000);
		BookCustomClass b3 = new BookCustomClass(1, "hello", "nelson", "tiger", 55000);
		BookCustomClass b4 = new BookCustomClass(2, "jinder", "mandela", "lion", 15000);

		// we get class cast exception.
		// tree set sorts output in ascending order.
		// how can we sort objects.
		// To solve this, we need to use comparable method which is abstract in nature:
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

package com.setInterfaces;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TreeSetWithCustomClassExampleTwo {

	public static void main(String[] args) {

		// only line change for custom class for tree set.
		TreeSet<BookCustomClassWithComparableForTreeSet> hs1 = new TreeSet<>();

		BookCustomClassWithComparableForTreeSet b1 = new BookCustomClassWithComparableForTreeSet(0, null, null, "tiger",
				5000);
		BookCustomClassWithComparableForTreeSet b2 = new BookCustomClassWithComparableForTreeSet(0, null, null, "tiger",
				5000);
		BookCustomClassWithComparableForTreeSet b3 = new BookCustomClassWithComparableForTreeSet(1, "hello", "nelson",
				"tiger", 55000);
		BookCustomClassWithComparableForTreeSet b4 = new BookCustomClassWithComparableForTreeSet(2, "jinder", "mandela",
				"lion", 15000);

		// we get class cast exception.
		// tree set sorts output in ascending order.
		// now it sorts by the id, as that is what is defined in comparable.
		// how can we sort objects.
		// To solve this, we need to use comparable method which is abstract in nature:
		hs1.add(b4);
		hs1.add(b2);
		hs1.add(b1);
		hs1.add(b3);

		for (BookCustomClassWithComparableForTreeSet bookCustomClass : hs1) {
			System.out.println(bookCustomClass.id + " " + bookCustomClass.author + " " + bookCustomClass.name + " "
					+ bookCustomClass.publisher + " " + bookCustomClass.quantity);
		}

	}

}

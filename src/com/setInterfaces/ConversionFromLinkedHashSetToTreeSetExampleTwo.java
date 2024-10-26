package com.setInterfaces;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class ConversionFromLinkedHashSetToTreeSetExampleTwo {

	public static void main(String[] args) {

		// link hash set to tree set

		LinkedHashSet<String> linkHashSet1 = new LinkedHashSet<>();
		linkHashSet1.add("tiger");
		linkHashSet1.add("tiger");
//		linkHashSet1.add(null);
//		linkHashSet1.add(null);
		linkHashSet1.add("gorilla");

		// another way to add collections.

		TreeSet<String> treeSet1 = new TreeSet<>(linkHashSet1);
		treeSet1.add("tiger");
		treeSet1.add("tiger");
//		treeSet1.add(null);
//		treeSet1.add(null);
		treeSet1.add("chimp");

		// unique elements only for set.
		// link hash set added to tree set.
		// since we are adding something into tree set which does not allow null values,
		// so all collections should not have null values.
		// if even one null present in any collection then we get null pointer
		// exception.
		// tree set will return output in ascending order.

		System.out.println("link hash set " + linkHashSet1);
		System.out.println("updated tree set " + treeSet1);

	}

}

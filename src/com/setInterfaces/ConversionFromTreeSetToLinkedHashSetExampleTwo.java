package com.setInterfaces;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class ConversionFromTreeSetToLinkedHashSetExampleTwo {

	public static void main(String[] args) {

		// tree set converted to link hash set.

		// use direct method.

		TreeSet<String> treeSet1 = new TreeSet<>();
		treeSet1.add("tiger");
		treeSet1.add("tiger");
//		treeSet1.add(null);
//		treeSet1.add(null);
		treeSet1.add("chimp");

		// using direct method.
		// we will get null pointer exception since tree set has null values.
		// even single null value in tree set throws null pointer exception.
		// uniqueness is maintained.
		// output of hash set in random order.
		// nulls allowed in hash set so only tree set cannot have null values in this
		// case.
		// hash set can have null values.
		// tree set added into link hash set.
		// first elements of tree set displayed, then link hash set elements displayed.

		LinkedHashSet<String> linkHashSet1 = new LinkedHashSet<>(treeSet1);
		linkHashSet1.add("tiger");
		linkHashSet1.add("tiger");
		linkHashSet1.add(null);
		linkHashSet1.add(null);
		linkHashSet1.add("gorilla");

		System.out.println("tree set " + treeSet1);
		System.out.println("updated link hash  set " + linkHashSet1);

	}

}

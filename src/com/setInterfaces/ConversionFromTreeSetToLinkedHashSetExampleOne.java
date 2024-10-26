package com.setInterfaces;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class ConversionFromTreeSetToLinkedHashSetExampleOne {

	public static void main(String[] args) {

		// tree set converted to link hash set.

		// use addall method.
		TreeSet<String> treeSet1 = new TreeSet<>();
		treeSet1.add("tiger");
		treeSet1.add("tiger");
//		treeSet1.add(null);
//		treeSet1.add(null);
		treeSet1.add("chimp");

		LinkedHashSet<String> linkHashSet1 = new LinkedHashSet<>();
		linkHashSet1.add("tiger");
		linkHashSet1.add("tiger");
		linkHashSet1.add(null);
		linkHashSet1.add(null);
		linkHashSet1.add("gorilla");

		// using addall method
		// we will get null pointer exception since tree set has null values.
		// even single null value in tree set throws null pointer exception.
		// uniqueness is maintained.
		// output of hash set in random order.
		// nulls allowed in link hash set so only tree set cannot have null values in
		// this
		// case.
		// link hash set can have null values.

		System.out.println("original link hash set is " + linkHashSet1);
		boolean b1 = linkHashSet1.addAll(treeSet1);
		System.out.println(b1);

		System.out.println("original tree set is " + treeSet1);
		System.out.println("updated link hash set is " + linkHashSet1);

	}

}

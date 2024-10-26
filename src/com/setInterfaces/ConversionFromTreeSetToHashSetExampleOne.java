package com.setInterfaces;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class ConversionFromTreeSetToHashSetExampleOne {

	public static void main(String[] args) {

		// tree set converted to hash set.

		// use addall method.
		TreeSet<String> treeSet1 = new TreeSet<>();
		treeSet1.add("tiger");
		treeSet1.add("tiger");
//		treeSet1.add(null);
//		treeSet1.add(null);
		treeSet1.add("chimp");

		HashSet<String> hashSet1 = new HashSet<>();
		hashSet1.add("tiger");
		hashSet1.add("tiger");
		hashSet1.add(null);
		hashSet1.add(null);
		hashSet1.add("gorilla");

		// using addall method
		// we will get null pointer exception since tree set has null values.
		// even single null value in tree set throws null pointer exception.
		// uniqueness is maintained.
		// output of hash set in random order.
		// nulls allowed in hash set so only tree set cannot have null values in this
		// case.
		// hash set can have null values.

		System.out.println("original hash set is " + hashSet1);
		boolean b1 = hashSet1.addAll(treeSet1);
		System.out.println(b1);

		System.out.println("original tree set is " + treeSet1);
		System.out.println("updated hash set is " + hashSet1);

	}

}

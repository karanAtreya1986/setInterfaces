package com.setInterfaces;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class ConversionFromHashSetToTreeSetExampleOne {

	public static void main(String[] args) {

		// hash set converted to tree set.

		HashSet<String> hashSet1 = new HashSet<>();
		hashSet1.add("tiger");
		hashSet1.add("tiger");
//		hashSet1.add(null);
//		hashSet1.add(null);
		hashSet1.add("gorilla");

		TreeSet<String> treeSet1 = new TreeSet<>();
		treeSet1.add("tiger");
		treeSet1.add("tiger");
//		treeSet1.add(null);
//		treeSet1.add(null);
		treeSet1.add("chimp");

		// using addall method
		// we will get null pointer exception since tree set has null values.
		// even single null value in tree set throws null pointer exception.
		// null values are not allowed in the other collection also. not even single
		// null is allowed in any collection when adding, else not added.
		// no null should be present when adding tree set with any other collection.
		// this applied to all collections plus tree set.
		// uniqueness is maintained.
		// tree set gives output in ascending order.

		System.out.println("original tree  set is " + treeSet1);
		boolean b1 = treeSet1.addAll(hashSet1);
		System.out.println(b1);

		System.out.println("original hash set is " + hashSet1);
		System.out.println("updated tree set is " + treeSet1);

	}

}

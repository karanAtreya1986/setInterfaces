package com.setInterfaces;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class ConversionFromHashSetToTreeSetExampleTwo {

	public static void main(String[] args) {

		// hash set converted to tree set.

		HashSet<String> hashSet1 = new HashSet<>();
		hashSet1.add("tiger");
		hashSet1.add("tiger");
//		hashSet1.add(null);
//		hashSet1.add(null);
		hashSet1.add("gorilla");

		// another way to add collections.
		// null pointer as no collection can have null values.
		// hash set added to tree set.
		// output will be in ascending order and no preference for any collection.

		TreeSet<String> treeSet1 = new TreeSet<>(hashSet1);
		treeSet1.add("tiger");
		treeSet1.add("tiger");
//		treeSet1.add(null);
//		treeSet1.add(null);
		treeSet1.add("chimp");

		System.out.println("hash set " + hashSet1);
		System.out.println("updated tree  set " + treeSet1);

	}

}

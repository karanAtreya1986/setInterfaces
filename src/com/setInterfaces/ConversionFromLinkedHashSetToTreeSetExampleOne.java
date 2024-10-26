package com.setInterfaces;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class ConversionFromLinkedHashSetToTreeSetExampleOne {

	public static void main(String[] args) {

		// link hash set to tree set

		LinkedHashSet<String> linkHashSet1 = new LinkedHashSet<>();
		linkHashSet1.add("tiger");
		linkHashSet1.add("tiger");
//		linkHashSet1.add(null);
//		linkHashSet1.add(null);
		linkHashSet1.add("gorilla");

		TreeSet<String> treeSet1 = new TreeSet<>();
		treeSet1.add("tiger");
		treeSet1.add("tiger");
//		treeSet1.add(null);
//		treeSet1.add(null);
		treeSet1.add("chimp");

		// using addall method
		// add link hash set into tree set
		// unique values only in set.
		// since we are adding something into tree set which does not allow null values,
		// so all collections should not have null values.
		// if even one null present in any collection then we get null pointer
		// exception.
		// tree set will return output in ascending order.

		System.out.println("original tree set is " + treeSet1);
		boolean b1 = treeSet1.addAll(linkHashSet1);
		System.out.println(b1);

		System.out.println("original link hash set is " + linkHashSet1);
		System.out.println("updated tree set is " + treeSet1);

	}

}

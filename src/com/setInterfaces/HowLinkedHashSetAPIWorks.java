package com.setInterfaces;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

//will display only unique values.
//insertion order and retrieval order is same.
//no duplicates in allowed, they will be removed if we add them.
//foreach and iterator for traversal.

public class HowLinkedHashSetAPIWorks {

	public static void main(String[] args) {

		// duplicates can be added in set
		// duplicate nulls are also allowed
		// when printing, it will show only unique values in random order
		LinkedHashSet<String> hSet = new LinkedHashSet<>();
		hSet.add("tiger");
		hSet.add("tiger");
		hSet.add(null);
		hSet.add(null);
		hSet.add("lion");

		// displays list of values
		System.out.println(hSet);

	}

}

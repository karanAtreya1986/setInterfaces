package com.setInterfaces;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class IterateOverLinkedHashSet {

	public static void main(String[] args) {

		LinkedHashSet<String> hSet = new LinkedHashSet<>();
		hSet.add("tiger");
		hSet.add("tiger");
		hSet.add(null);
		hSet.add(null);
		hSet.add("lion");

//		 use for each loop
//		for (String string : hSet) {
//			System.out.println(string);
//		}

		// use list iterator
		// there is no list iterator for hash set.
//		hSet.list

		// use enumeration
		// there is no enumeration for hash set.
//		hSet.elements;

		// iterators can also work for hash set.
		Iterator<String> it1 = hSet.iterator();
		while (it1.hasNext()) {
			String s1 = it1.next();
			System.out.println(s1);
		}
	}

}

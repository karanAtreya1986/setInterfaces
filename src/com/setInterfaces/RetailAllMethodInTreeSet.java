package com.setInterfaces;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;

public class RetailAllMethodInTreeSet {

	public static void main(String[] args) {

		TreeSet<String> hSet = new TreeSet<>();
		hSet.add("tiger");
		hSet.add("tiger");
//		hSet.add(null);
//		hSet.add(null);
		hSet.add("gorilla");

		Vector<String> arraylist = new Vector<>();
		arraylist.add("tiger");
		arraylist.add("tiger");
		arraylist.add(null);
		arraylist.add(null);
		arraylist.add("lion");

		// everything will be removed from tree set. if there are some elements common
		// to second collection they will be retained.
		// everything from second collection will be kept as is.
		// returns true or false depending on retention.
		// common to all collections as we have seen addition between different
		// collections.
		boolean b1 = hSet.retainAll(arraylist);
		System.out.println(b1);

		System.out.println("tree set is " + hSet);

		System.out.println("vector  is " + arraylist);
	}

}

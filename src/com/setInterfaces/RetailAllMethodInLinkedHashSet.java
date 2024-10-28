package com.setInterfaces;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.Stack;

public class RetailAllMethodInLinkedHashSet {

	public static void main(String[] args) {

		LinkedHashSet<String> hSet = new LinkedHashSet<>();
		hSet.add("tiger");
		hSet.add("tiger");
		hSet.add(null);
		hSet.add(null);
		hSet.add("gorilla");

		Stack<String> arraylist = new Stack<>();
		arraylist.add("tiger");
		arraylist.add("tiger");
		arraylist.add(null);
		arraylist.add(null);
		arraylist.add("lion");

		// everything will be removed from link hash set. if there are some elements common
		// to second collection they will be retained.
		// everything from second collection will be kept as is.
		// returns true or false depending on retention.
		// common to all collections as we have seen addition between different
		// collections.
		boolean b1 = hSet.retainAll(arraylist);
		System.out.println(b1);

		System.out.println("link hash set is " + hSet);

		System.out.println("stack  is " + arraylist);
	}

}

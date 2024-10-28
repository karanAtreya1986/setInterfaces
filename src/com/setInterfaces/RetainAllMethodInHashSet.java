package com.setInterfaces;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class RetainAllMethodInHashSet {

	public static void main(String[] args) {

		HashSet<String> hSet = new HashSet<>();
		hSet.add("tiger");
		hSet.add("tiger");
		hSet.add(null);
		hSet.add(null);
		hSet.add("gorilla");

		ArrayList<String> arraylist = new ArrayList<>();
		arraylist.add("tiger");
		arraylist.add("tiger");
		arraylist.add(null);
		arraylist.add(null);
		arraylist.add("lion");

		// everything will be removed from hash set. if there are some elements common
		// to second collection they will be retained.
		// everything from second collection will be kept as is.
		// returns true or false depending on retention.
		// common to all collections as we have seen addition between different
		// collections.
		boolean b1 = hSet.retainAll(arraylist);
		System.out.println(b1);

		System.out.println("hash set is " + hSet);

		System.out.println("array list  is " + arraylist);
	}

}

package com.setInterfaces;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class RemoveAllMethodInHashSet {

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

		// remove all needs another collection
		// returns true or false depending on addition result.
		// remove array list from the hash set.
		// common elements from both collections will be removed.
		// we have seen addition between list and sets and between sets, so this
		// removeall method can be applied to all collections.
		boolean b1 = hSet.removeAll(arraylist);
		System.out.println(b1);

		// hash set will have its own element
		System.out.println("hash set is " + hSet);
		// common elements from array list and hash set removed.
		// entire array list also removed.
		System.out.println("array list  is " + arraylist);
	}

}

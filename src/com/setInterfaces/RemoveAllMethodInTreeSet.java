package com.setInterfaces;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;

public class RemoveAllMethodInTreeSet {

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

		// remove all needs another collection
		// returns true or false depending on addition result.
		// remove array list from the hash set.
		// common elements from both collections will be removed.
		// we have seen addition between list and sets and between sets, so this
		// removeall method can be applied to all collections.
		boolean b1 = hSet.removeAll(arraylist);
		System.out.println(b1);

		// hash set will have its own element
		System.out.println("tree set is " + hSet);
		// common elements from array list and hash set removed.
		// entire array list also removed.
		System.out.println("vector list  is " + arraylist);
	}

}

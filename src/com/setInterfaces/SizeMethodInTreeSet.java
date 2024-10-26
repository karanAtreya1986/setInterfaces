package com.setInterfaces;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SizeMethodInTreeSet {

	public static void main(String[] args) {

		TreeSet<String> hSet = new TreeSet<>();
		hSet.add("tiger");
		hSet.add("tiger");
		hSet.add("gorilla");
		hSet.add("lion");

		// prints size of tree set.
		// output will be three - because three unique values and not five.
		int sizeTreeSet = hSet.size();
		System.out.println(sizeTreeSet);

	}

}

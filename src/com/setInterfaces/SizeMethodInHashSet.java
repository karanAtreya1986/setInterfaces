package com.setInterfaces;

import java.util.HashSet;
import java.util.Iterator;

public class SizeMethodInHashSet {

	public static void main(String[] args) {

		HashSet<String> hSet = new HashSet<>();
		hSet.add("tiger");
		hSet.add("tiger");
		hSet.add(null);
		hSet.add(null);
		hSet.add("lion");

		// prints size of hash set.
		// output will be three - because three unique values and not five.
		int sizeHashSet = hSet.size();
		System.out.println(sizeHashSet);

	}

}

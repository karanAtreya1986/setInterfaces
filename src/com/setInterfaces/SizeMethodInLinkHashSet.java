package com.setInterfaces;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class SizeMethodInLinkHashSet {

	public static void main(String[] args) {

		LinkedHashSet<String> hSet = new LinkedHashSet<>();
		hSet.add("tiger");
		hSet.add("tiger");
		hSet.add(null);
		hSet.add(null);
		hSet.add("lion");

		// prints size of link hash set.
		// output will be three - because three unique values and not five.
		int sizeLinkHashSet = hSet.size();
		System.out.println(sizeLinkHashSet);

	}

}

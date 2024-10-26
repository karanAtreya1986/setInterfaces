package com.setInterfaces;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class ConversionFromHashSetToLinkedHashSetExampleOne {

	public static void main(String[] args) {

		// hash set converted to linked hash set

		HashSet<String> hashSet1 = new HashSet<>();
		hashSet1.add("tiger");
		hashSet1.add("tiger");
		hashSet1.add(null);
		hashSet1.add(null);
		hashSet1.add("gorilla");

		LinkedHashSet<String> linkHashSet1 = new LinkedHashSet<>();
		linkHashSet1.add("tiger");
		linkHashSet1.add("tiger");
		linkHashSet1.add(null);
		linkHashSet1.add(null);
		linkHashSet1.add("chimp");

		// using addall method
		// add hash set into link hash set

		System.out.println("original link hash set is " + linkHashSet1);
		boolean b1 = linkHashSet1.addAll(hashSet1);
		System.out.println(b1);

		System.out.println("original hash set is " + hashSet1);
		System.out.println("updated link hash set is " + linkHashSet1);

	}

}

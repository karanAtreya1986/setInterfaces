package com.setInterfaces;

import java.util.ArrayList;
import java.util.HashSet;

public class AddingTwoHashSetsExampleOne {

	public static void main(String[] args) {

		// hash set added with another hash set
		HashSet<String> h1 = new HashSet<>();
		h1.add("tiger");
		h1.add("tiger");
		h1.add(null);
		h1.add(null);
		h1.add("goat");

		HashSet<String> h2 = new HashSet<>();
		h2.add("tiger");
		h2.add("tiger");
		h2.add(null);
		h2.add(null);
		h2.add("gorilla");

		// if addition success then true, else false.
		// h2 added to h1.
		// output will have unique values from both sets.
		boolean b1 = h1.addAll(h2);
		System.out.println(b1);

		System.out.println("hash set1 " + h1);
		System.out.println("hash set2 " + h2);

	}

}

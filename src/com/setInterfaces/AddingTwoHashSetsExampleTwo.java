package com.setInterfaces;

import java.util.ArrayList;
import java.util.HashSet;

public class AddingTwoHashSetsExampleTwo {

	public static void main(String[] args) {

		// hash set added with another hash set
		HashSet<String> h1 = new HashSet<>();
		h1.add("tiger");
		h1.add("tiger");
		h1.add(null);
		h1.add(null);
		h1.add("goat");

		// another way to add collections.
		// output will have unique values from both sets.
		HashSet<String> h2 = new HashSet<>(h1);
		h2.add("tiger");
		h2.add("tiger");
		h2.add(null);
		h2.add(null);
		h2.add("gorilla");

		System.out.println("hash set 1 " + h1);
		System.out.println("hash set 2 " + h2);

	}

}

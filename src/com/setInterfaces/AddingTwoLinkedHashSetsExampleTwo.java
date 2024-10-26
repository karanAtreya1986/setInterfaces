package com.setInterfaces;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class AddingTwoLinkedHashSetsExampleTwo {

	public static void main(String[] args) {

		// link hash set added with another link hash set
		LinkedHashSet<String> h1 = new LinkedHashSet<>();
		h1.add("tiger");
		h1.add("tiger");
		h1.add(null);
		h1.add(null);
		h1.add("goat");

		// another way to add collections.
		// output will have unique values from both sets.
		// h1 added to h2.
		// first h1 unique elements displayed in the order entered.
		// then h2 unique elements displayed in the order entered.
		LinkedHashSet<String> h2 = new LinkedHashSet<>(h1);
		h2.add("tiger");
		h2.add("tiger");
		h2.add(null);
		h2.add(null);
		h2.add("gorilla");

		System.out.println("link hash set 1 " + h1);
		System.out.println("link hash set 2 " + h2);

	}

}

package com.setInterfaces;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class AddingTwoTreeSetsExampleTwo {

	public static void main(String[] args) {

		// adding two tree sets together.
		TreeSet<String> h1 = new TreeSet<>();
		h1.add("tiger");
		h1.add("tiger");
		h1.add("zebra");
		h1.add("goat");

		// another way to add collections.
		// output will have unique values from both sets.
		// h1 added to h2.
		// only unique elements present.
		// when we print the output will be displayed in ascending order.
		TreeSet<String> h2 = new TreeSet<>(h1);
		h2.add("tiger");
		h2.add("tiger");
		h2.add("dino");
		h2.add("gorilla");

		System.out.println("TreeSet set 1 " + h1);
		System.out.println("TreeSet set 2 " + h2);

	}

}

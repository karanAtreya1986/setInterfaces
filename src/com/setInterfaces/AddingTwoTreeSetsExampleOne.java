package com.setInterfaces;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class AddingTwoTreeSetsExampleOne {

	public static void main(String[] args) {

		// adding two tree sets together.

		TreeSet<String> h1 = new TreeSet<>();
		h1.add("tiger");
		h1.add("tiger");
		h1.add("zebra");
		h1.add("goat");

		TreeSet<String> h2 = new TreeSet<>();
		h2.add("tiger");
		h2.add("tiger");
		h2.add("dino");
		h2.add("gorilla");

		// if addition success then true, else false.
		// h2 added to h1.
		// only unique values will be present in output.
		boolean b1 = h1.addAll(h2);
		System.out.println(b1);

		// will give the output in ascending order from two sets.
		System.out.println("tree set1 " + h1);
		// will return data in ascending order from h2.
		System.out.println("tree set2 " + h2);

	}

}

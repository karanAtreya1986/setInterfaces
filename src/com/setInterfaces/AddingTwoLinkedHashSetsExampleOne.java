package com.setInterfaces;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class AddingTwoLinkedHashSetsExampleOne {

	public static void main(String[] args) {

		// link hash set added with another link hash set
		LinkedHashSet<String> h1 = new LinkedHashSet<>();
		h1.add("tiger");
		h1.add("tiger");
		h1.add(null);
		h1.add(null);
		h1.add("goat");

		LinkedHashSet<String> h2 = new LinkedHashSet<>();
		h2.add("tiger");
		h2.add("tiger");
		h2.add(null);
		h2.add(null);
		h2.add("gorilla");

		// if addition success then true, else false.
		// h2 added to h1.
		// first h1 unique elements printed in the same order as entered, then h2 unique
		// elements will be printed in the same order as entered.
		boolean b1 = h1.addAll(h2);
		System.out.println(b1);

		System.out.println("link hash set1 " + h1);
		System.out.println("link hash set2 " + h2);

	}

}

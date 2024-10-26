package com.setInterfaces;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class ConversionFromListInterfaceToLinkedHashSet {

	public static void main(String[] args) {

		// works the same for all list interfaces.

		ArrayList<String> l1 = new ArrayList<>();
//		LinkedList<String> l1 = new LinkedList<>();
//		Vector<String> l1 = new Vector<>();
//		Stack<String> l1 = new Stack<>();
		l1.add("tiger");
		l1.add("tiger");
		l1.add(null);
		l1.add(null);
		l1.add("goat");

		LinkedHashSet<String> s1 = new LinkedHashSet<>();
		s1.add("tiger");
		s1.add("tiger");
		s1.add(null);
		s1.add(null);
		s1.add("gorilla");

		// if addition success then true, else false.
		// h2 added to h1.
		// first set data entered in order will be seen, only unique values.
		// then list data unique ones will be seen.
		boolean b1 = s1.addAll(l1);
		System.out.println(b1);

		System.out.println("ArrayList " + l1);
		System.out.println("linked HashSet" + s1);

	}

}

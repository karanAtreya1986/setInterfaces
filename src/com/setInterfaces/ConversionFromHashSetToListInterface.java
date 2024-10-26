package com.setInterfaces;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class ConversionFromHashSetToListInterface {

	// works the same for all list interfaces.

	public static void main(String[] args) {

		HashSet<String> s1 = new HashSet<>();
		s1.add("tiger");
		s1.add("tiger");
		s1.add(null);
		s1.add(null);
		s1.add("gorilla");

		ArrayList<String> l1 = new ArrayList<>();
//		LinkedList<String> l1 = new LinkedList<>();
//		Vector<String> l1 = new Vector<>();
//		Stack<String> l1 = new Stack<>();
		l1.add("tiger");
		l1.add("tiger");
		l1.add(null);
		l1.add(null);
		l1.add("goat");

		// if addition success then true, else false.
		// h2 added to h1.
		// only unique values from hash set added to list and then output printed.
		boolean b1 = l1.addAll(s1);
		System.out.println(b1);

		System.out.println("ArrayList " + l1);
		System.out.println("HashSet" + s1);

	}

}

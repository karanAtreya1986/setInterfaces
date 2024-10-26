package com.setInterfaces;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class ConversionFromListInterfaceToHashSet {

	public static void main(String[] args) {

		// works same way for all list interfaces.

//		ArrayList<String> l1 = new ArrayList<>();
//		LinkedList<String> l1 = new LinkedList<>();
//		Vector<String> l1 = new Vector<>();
		Stack<String> l1 = new Stack<>();
		l1.add("tiger");
		l1.add("tiger");
		l1.add(null);
		l1.add(null);
		l1.add("goat");

		HashSet<String> s1 = new HashSet<>();
		s1.add("tiger");
		s1.add("tiger");
		s1.add(null);
		s1.add(null);
		s1.add("gorilla");

		// if addition success then true, else false.
		// h2 added to h1.
		// only unique values will be added to the hash set and printed out.
		boolean b1 = s1.addAll(l1);
		System.out.println(b1);

		System.out.println("ArrayList " + l1);
		System.out.println("HashSet" + s1);

	}

}

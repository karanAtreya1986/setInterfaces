package com.setInterfaces;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class ConversionFromHashSetToListInterfaceExampleTwo {

	// works for all list interfaces except stack.
	// stack gives compile time error -Cannot infer type arguments for Stack<>

	public static void main(String[] args) {

		HashSet<String> s1 = new HashSet<>();
		s1.add("tiger");
		s1.add("tiger");
		s1.add(null);
		s1.add(null);
		s1.add("gorilla");

		// another way to add elements.
		// first set will send only unique elements to list.
		// all set elements printed first, then all list elements printed.
//		ArrayList<String> l1 = new ArrayList<>(s1);
		LinkedList<String> l1 = new LinkedList<>(s1);
//		Vector<String> l1 = new Vector<>(s1);
//		Stack<String> l1 = new Stack<>(s1);
		l1.add("tiger");
		l1.add("tiger");
		l1.add(null);
		l1.add(null);
		l1.add("goat");

		System.out.println("ArrayList " + l1);
		System.out.println("HashSet" + s1);

	}

}

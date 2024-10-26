package com.setInterfaces;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class ConversionFromListInterfaceToHashSetExampleTwo {

	// works the same way for all list interfaces.

	public static void main(String[] args) {

		ArrayList<String> l1 = new ArrayList<>();
//		LinkedList<String> l1 = new LinkedList<>();
//		Vector<String> l1 = new Vector<>();
//		Stack<String> l1 = new Stack<>();
		l1.add("tiger");
		l1.add("tiger");
		l1.add(null);
		l1.add(null);
		l1.add("goat");

		// another way to add elements.
		// set will have unique values and in output also, only unique values will be
		// present.
		HashSet<String> s1 = new HashSet<>(l1);
		s1.add("tiger");
		s1.add("tiger");
		s1.add(null);
		s1.add(null);
		s1.add("gorilla");

		System.out.println("ArrayList " + l1);
		System.out.println("HashSet" + s1);

	}

}

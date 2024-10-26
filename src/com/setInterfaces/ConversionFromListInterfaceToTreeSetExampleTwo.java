package com.setInterfaces;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;

public class ConversionFromListInterfaceToTreeSetExampleTwo {

	// works the same for all list interfaces.
	// since tree set is having null, so output is straight away null pointer
	// exception.

	public static void main(String[] args) {

////		ArrayList<String> l1 = new ArrayList<>();
////		LinkedList<String> l1 = new LinkedList<>();
//		Vector<String> l1 = new Vector<>();
////		Stack<String> l1 = new Stack<>();
//		l1.add("tiger");
//		l1.add("tiger");
//		l1.add(null);
//		l1.add(null);
//		l1.add("goat");
//
//		// another way to add elements.
//		// list added to set.
////		null pointer exception thrown.
//		TreeSet<String> s1 = new TreeSet<>(l1);
//		s1.add("tiger");
//		s1.add("tiger");
//		s1.add(null);
//		s1.add(null);
//		s1.add("gorilla");
//
//		System.out.println("ArrayList " + l1);
//		System.out.println("TreeSet " + s1);

		///////////////////////////////

		// set is not having null values, but list is having.
		// since list interface is having null, so output is straight away null pointer
		// exception.

//		ArrayList<String> l1 = new ArrayList<>();
////		LinkedList<String> l1 = new LinkedList<>();
////		Vector<String> l1 = new Vector<>();
////		Stack<String> l1 = new Stack<>();
//		l1.add("tiger");
//		l1.add("tiger");
//		l1.add(null);
//		l1.add(null);
//		l1.add("goat");
//
//		// another way to add elements.
//		// list added to set.
////		null pointer exception thrown.
//		TreeSet<String> s1 = new TreeSet<>(l1);
//		s1.add("tiger");
//		s1.add("tiger");
//		s1.add("dino");
//		s1.add("gorilla");
//
//		System.out.println("ArrayList " + l1);
//		System.out.println("TreeSet " + s1);

		/////////////////////////////////////

//		ArrayList<String> l1 = new ArrayList<>();
//		LinkedList<String> l1 = new LinkedList<>();
//		Vector<String> l1 = new Vector<>();
		Stack<String> l1 = new Stack<>();
		l1.add("tiger");
		l1.add("tiger");
		l1.add("zeenat");
		l1.add("goat");

		// another way to add elements.
		// list added to set.
		// only unique values will remain in set.
		// when printed, everything in ascending order.
		TreeSet<String> s1 = new TreeSet<>(l1);
		s1.add("tiger");
		s1.add("tiger");
		s1.add("dino");
		s1.add("gorilla");

		System.out.println("ArrayList " + l1);
		System.out.println("TreeSet " + s1);

	}

}

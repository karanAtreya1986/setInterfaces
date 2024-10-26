package com.setInterfaces;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;

public class ConversionFromTreeSetToListInterfaceExampleTwo {

	// works for all list interfaces except stack.
	// stack gives compile time error -Cannot infer type arguments for Stack<>

	// since set has null values, so we cannot add.
	// we get null pointer exception.

	public static void main(String[] args) {

//		TreeSet<String> s1 = new TreeSet<>();
//		s1.add("tiger");
//		s1.add("tiger");
//		s1.add(null);
//		s1.add(null);
//		s1.add("gorilla");
//
//		// another way to add elements.
//		// set added to list.
////		ArrayList<String> l1 = new ArrayList<>(s1);
////		LinkedList<String> l1 = new LinkedList<>(s1);
//		Vector<String> l1 = new Vector<>(s1);
////		Stack<String> l1 = new Stack<>(s1);
//		l1.add("tiger");
//		l1.add("tiger");
//		l1.add(null);
//		l1.add(null);
//		l1.add("goat");
//
//		System.out.println("ArrayList " + l1);
//		System.out.println("TreeSet" + s1);

		//////////////////////

		// in this case, set is not having null, but list is having null
		// we are adding set into list and as list can have null values, so no error in
		// output.
		// stack gives compile time error -Cannot infer type arguments for Stack<>

		TreeSet<String> s1 = new TreeSet<>();
		s1.add("tiger");
		s1.add("tiger");
		s1.add("chimp");
		s1.add("gorilla");

		// another way to add elements.
		// set added to list.
		// first unique elements from set added to list.
		// they will be added in ascending order and in output also we can see them in
		// ascending order.
		ArrayList<String> l1 = new ArrayList<>(s1);
//		LinkedList<String> l1 = new LinkedList<>(s1);
//		Vector<String> l1 = new Vector<>(s1);
//		Stack<String> l1 = new Stack<>(s1);
		l1.add("tiger");
		l1.add("tiger");
		l1.add(null);
		l1.add(null);
		l1.add("goat");

		System.out.println("ArrayList " + l1);
		System.out.println("TreeSet" + s1);

	}

}

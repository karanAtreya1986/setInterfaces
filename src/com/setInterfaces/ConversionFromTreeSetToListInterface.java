package com.setInterfaces;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;

public class ConversionFromTreeSetToListInterface {

	// works the same for all list interfaces.
	// since tree set has null values, output straight away null pointer exception.

	public static void main(String[] args) {

//		TreeSet<String> s1 = new TreeSet<>();
//		s1.add("tiger");
//		s1.add("tiger");
//		s1.add(null);
//		s1.add(null);
//		s1.add("gorilla");
//
////		ArrayList<String> l1 = new ArrayList<>();
////		LinkedList<String> l1 = new LinkedList<>();
////		Vector<String> l1 = new Vector<>();
//		Stack<String> l1 = new Stack<>();
//		l1.add("tiger");
//		l1.add("tiger");
//		l1.add(null);
//		l1.add(null);
//		l1.add("goat");
//
//		// if addition success then true, else false.
//		// set added to list
//
//		boolean b1 = l1.addAll(s1);
//		System.out.println(b1);
//
//		System.out.println("ArrayList " + l1);
//		System.out.println("TreeSet" + s1);

		///////////////////////

		// in this case, set is not having null, but list is having null
		// we are adding set into list and as list can have null values, so no error in
		// output.

		TreeSet<String> s1 = new TreeSet<>();
		s1.add("tiger");
		s1.add("tiger");
		s1.add("dino");
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
		// set added to list
		// first list elements added, then set elements added.
		// only unique elements from set are displayed in ascending order in output.
		boolean b1 = l1.addAll(s1);
		System.out.println(b1);

		System.out.println("ArrayList " + l1);
		System.out.println("TreeSet" + s1);

	}

}

package com.setInterfaces;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;

public class ConversionFromListInterfaceToTreeSet {

	public static void main(String[] args) {

		// works the same for all list interfaces.
		// since tree set is having null, so output is straight away null pointer
		// exception.

//		ArrayList<String> l1 = new ArrayList<>();
//		LinkedList<String> l1 = new LinkedList<>();
//		Vector<String> l1 = new Vector<>();
//		Stack<String> l1 = new Stack<>();
//		l1.add("tiger");
//		l1.add("tiger");
//		l1.add(null);
//		l1.add(null);
//		l1.add("goat");
//
//		TreeSet<String> s1 = new TreeSet<>();
//		s1.add("tiger");
//		s1.add("tiger");
//		s1.add(null);
//		s1.add(null);
//		s1.add("gorilla");
//
//		// if addition success then true, else false.
//		// list added to set.
//		// first set data entered in order will be seen, only unique values.
//		// then list data unique ones will be seen.
//		boolean b1 = s1.addAll(l1);
//		System.out.println(b1);
//
//		System.out.println("ArrayList " + l1);
//		System.out.println("TreeSet" + s1);

		System.out.println("------------------------------");

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
//		TreeSet<String> s1 = new TreeSet<>();
//		s1.add("tiger");
//		s1.add("tiger");
//		s1.add("dino");
//		s1.add("gorilla");
//
//		// if addition success then true, else false.
//		// list added to set.
//		// first set data entered in order will be seen, only unique values.
//		// then list data unique ones will be seen.
//		boolean b1 = s1.addAll(l1);
//		System.out.println(b1);
//
//		System.out.println("ArrayList " + l1);
//		System.out.println("TreeSet" + s1);

//		System.out.println("-------------------------------");

		ArrayList<String> l1 = new ArrayList<>();
//		LinkedList<String> l1 = new LinkedList<>();
//		Vector<String> l1 = new Vector<>();
//		Stack<String> l1 = new Stack<>();
		l1.add("tiger");
		l1.add("tiger");
		l1.add("zetna");
		l1.add("goat");

		TreeSet<String> s1 = new TreeSet<>();
		s1.add("tiger");
		s1.add("tiger");
		s1.add("dino");
		s1.add("gorilla");

		// if addition success then true, else false.
		// list added to set.
		// first only unique values allowed in set.
		// second all items from set printed in ascending order.
		boolean b1 = s1.addAll(l1);
		System.out.println(b1);

		System.out.println("ArrayList " + l1);
		System.out.println("TreeSet" + s1);

	}

}

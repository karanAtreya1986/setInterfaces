package com.setInterfaces;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;

public class PrintAllCollectionNamesToCheckReturnType {

	// all collection names when printed gives list of values.

	public static void main(String[] args) {
		ArrayList<String> a1 = new ArrayList<>();
		a1.add("tiger");
		a1.add("tiger");
		a1.add(null);
		a1.add(null);
		a1.add("lion");
		System.out.println("array list is " + a1);

		Stack<String> a11 = new Stack<>();
		a11.add("tiger");
		a11.add("tiger");
		a11.add(null);
		a11.add(null);
		a11.add("lion");
		System.out.println("Stack list is " + a11);

		LinkedList<String> a111 = new LinkedList<>();
		a111.add("tiger");
		a111.add("tiger");
		a111.add(null);
		a111.add(null);
		a111.add("lion");
		System.out.println("link list is " + a111);

		Vector<String> a1111 = new Vector<>();
		a1111.add("tiger");
		a1111.add("tiger");
		a1111.add(null);
		a1111.add(null);
		a1111.add("lion");
		System.out.println("vector list is " + a1111);
		
		HashSet<String> a11111 = new HashSet<>();
		a11111.add("tiger");
		a11111.add("tiger");
		a11111.add(null);
		a11111.add(null);
		a11111.add("lion");
		System.out.println("HashSet is " + a11111);
		
		LinkedHashSet<String> a111111 = new LinkedHashSet<>();
		a111111.add("tiger");
		a111111.add("tiger");
		a111111.add(null);
		a111111.add(null);
		a111111.add("lion");
		System.out.println("LinkedHashSet is " + a111111);
		
		TreeSet<String> a1111111 = new TreeSet<>();
		a1111111.add("tiger");
		a1111111.add("tiger");
		a1111111.add("goat");
		a1111111.add("lion");
		System.out.println("TreeSet is " + a1111111);
	}

}

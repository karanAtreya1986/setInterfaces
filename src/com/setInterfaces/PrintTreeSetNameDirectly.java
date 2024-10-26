package com.setInterfaces;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class PrintTreeSetNameDirectly {

	public static void main(String[] args) {

		TreeSet<String> hSet = new TreeSet<>();
		hSet.add("tiger");
		hSet.add("tiger");
		hSet.add("goat");
		hSet.add("lion");

		// prints list of values.
		System.out.println(hSet);
	}

}

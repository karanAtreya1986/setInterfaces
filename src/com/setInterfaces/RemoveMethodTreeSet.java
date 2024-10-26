package com.setInterfaces;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class RemoveMethodTreeSet {

	public static void main(String[] args) {

		TreeSet<String> hSet = new TreeSet<>();
		hSet.add("tiger");
		hSet.add("tiger");
		hSet.add("goat");
		hSet.add("lion");

		// pass in the value and we get true or false if removal is success or not.
//		boolean b1 = hSet.remove("lion");
//		System.out.println(b1);
//
//		System.out.println(hSet);

		// try removing element not preset.
		// we get false.
		boolean b1 = hSet.remove("qrwqewqeqwe13123123");
		System.out.println(b1);
	}

}

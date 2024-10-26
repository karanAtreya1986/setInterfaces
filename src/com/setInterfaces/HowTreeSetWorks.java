package com.setInterfaces;

import java.util.TreeSet;

public class HowTreeSetWorks {

	public static void main(String[] args) {

		// no duplicates.
		// returns output in ascending order.
		// no null values in treeset.
		// we immediately get null pointer exception.

//		TreeSet<String> hSet = new TreeSet<>();
//		hSet.add("tiger");
//		hSet.add("tiger");
//		hSet.add(null);
//		hSet.add(null);
//		hSet.add("lion");
//		
//		//returns list of values
//		System.out.println(hSet);

		// when no null values, then proper result.
		// what every order you give input, output will be in ascending order.
		TreeSet<String> hSet = new TreeSet<>();
		hSet.add("tiger");
		hSet.add("tiger");
		hSet.add("lion");

		// returns list of values
		System.out.println(hSet);
	}

}

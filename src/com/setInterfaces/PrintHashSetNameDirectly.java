package com.setInterfaces;

import java.util.HashSet;

public class PrintHashSetNameDirectly {

	public static void main(String[] args) {

		HashSet<String> hSet = new HashSet<>();
		hSet.add("tiger");
		hSet.add("tiger");
		hSet.add(null);
		hSet.add(null);
		hSet.add("lion");

		// prints list of values.
		System.out.println(hSet);
	}

}

package com.setInterfaces;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class PrintLinkedHashSetNameDirectly {

	public static void main(String[] args) {

		LinkedHashSet<String> hSet = new LinkedHashSet<>();
		hSet.add("tiger");
		hSet.add("tiger");
		hSet.add(null);
		hSet.add(null);
		hSet.add("lion");

		// prints list of values.
		System.out.println(hSet);
	}

}

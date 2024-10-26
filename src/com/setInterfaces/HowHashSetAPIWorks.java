package com.setInterfaces;

import java.util.HashSet;
import java.util.Iterator;

//Set-
//Unique values will only be present in output.
//Hash set-
//Elements retrieved in any random order. We will not know which element will come.
//Linked hash set – insertion order and retrieval order are maintained.
//Tree set-
//Ascending order. will be returned in ascending order. 
//One null value allowed for hash set and linked hash set.
//Tree set – no null values allowed.

public class HowHashSetAPIWorks {

	public static void main(String[] args) {

		// duplicates can be added in set
		// duplicate nulls are also allowed
		// when printing, it will show only unique values in random order
		HashSet<String> hSet = new HashSet<>();
		hSet.add("tiger");
		hSet.add("tiger");
		hSet.add(null);
		hSet.add(null);
		hSet.add("lion");

		// use iterator for traversing
		Iterator<String> it1 = hSet.iterator();
		while (it1.hasNext()) {
			String s1 = it1.next();
			System.out.println(s1);

		}

	}

}

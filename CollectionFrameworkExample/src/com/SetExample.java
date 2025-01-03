package com;

import java.util.*;

public class SetExample {

	public static void main(String[] args) {
		// 1st example
		HashSet hs1 = new HashSet(); // hashSet stores elements in unordered format
		System.out.println("size " + hs1.size());
		hs1.add(10);
		hs1.add(20);
		hs1.add("Ravi");
		hs1.add(true);
		System.out.println(hs1); // it displayd all elements as string format
		System.out.println("size " + hs1.size());
		hs1.clear();
		System.out.println("Is the collection empty? " + hs1.isEmpty());

		// 2nd example
		LinkedHashSet lhs1 = new LinkedHashSet(); // linked hashSet maintains format

		lhs1.add(10);
		lhs1.add("Ravi");
		lhs1.add(false);
		lhs1.add(18);
		System.out.println(lhs1); // it displays all elements as string format

		TreeSet ts1 = new TreeSet(); // sorts the element by default, so data types should be the same
		System.out.println("Size " + ts1.size());
		System.out.println("Empty " + ts1.isEmpty());
		ts1.add(3);
		ts1.add(1);
		ts1.add(6);
		ts1.add(9);
		ts1.add(4);
		ts1.add(0);
		ts1.add(7);
		System.out.println(ts1);
		System.out.println("Size " + ts1.size());
		System.out.println("Empty " + ts1.isEmpty());
		System.out.println("Search " + ts1.contains(10));
		System.out.println("Search " + ts1.contains(20));
		System.out.println("Remvove " + ts1.remove(3));
		System.out.println("Remvove " + ts1.remove(10));
		ts1.clear();
		System.out.println("Size " + ts1.size());
		System.out.println("Empty " + ts1.isEmpty());
	}

}

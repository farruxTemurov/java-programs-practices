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
		System.out.println("_____________");
		// 3rd Example

		Set<Integer> numbers = new HashSet<>();
		Random rand = new Random();
		while (numbers.size() < 10) {
			int randomNum = rand.nextInt(50) + 1;
			numbers.add(randomNum);
		}
		System.out.println("HashSet (after adding random integers): " + numbers);

		int duplicate = 25;
		boolean added = numbers.add(duplicate);
		if (!added) {
			System.out.println("Duplicate " + duplicate + " was NOT added to the set!");
		}

		for (int number : numbers) {
			System.out.println(number);
		}

		System.out.println("_____________");
		// 4th Example

		TreeSet<Double> numberSet = new TreeSet<>();

		numberSet.add(12.5);
		numberSet.add(7.3);
		numberSet.add(19.8);
		numberSet.add(3.4);
		numberSet.add(15.6);

		System.out.println("TreeSet (sorted): " + numberSet);

		// Printing the smallest and largest numbers
		System.out.println("Smallest number: " + numberSet.first());
		System.out.println("Largest number: " + numberSet.last());

		// Trying adding a duplicate number
		boolean duplicateN = numberSet.add(7.3);

		if (!duplicateN) {
			System.out.println("Duplicate 7.3 was NOT added to the set.");
		} else {
			System.out.println("Duplicate 7.3 was added (unexpected).");
		}

		System.out.println("TreeSet after adding duplicate: " + numberSet);

		System.out.println("_____________");
		// 5th Example
		Set<Integer> list1 = new HashSet<>();
		Set<Integer> list2 = new HashSet<>();

		list1.add(2);
		list1.add(34);
		list1.add(4);
		list1.add(82);

		list2.add(2);
		list2.add(15);
		list2.add(82);
		list2.add(98);

		System.out.println("List 1: " + list1);
		System.out.println("List 2: " + list2);

		// Find the intersection by retaining common element
		list1.retainAll(list2); // Modifies set1 to keep only elements also in set2

		System.out.println("Intersection: " + list1);
	}

}

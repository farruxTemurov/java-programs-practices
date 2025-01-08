package com;

import java.util.*;

public class ListExample {

	public static void main(String[] args) {
		// 1st example
		String names[] = { "Ravi", "Ramesh", "Ajay", "Vikash" };
		System.out.println(names);

		for (String name : names) {
			System.out.println(name);
		}

		// 2nd Example
		LinkedList al = new LinkedList();
		al.add("Ravi");
		al.add("Ramesh");
		al.add("Ajay");
		al.add("Vikash");
		System.out.println(al);
		al.remove(1); // remove element using index position
		al.remove("Ajay"); // remove using value
		System.out.println(al);
		al.add(1, "Steven"); // adds the element in 1 index position.
		System.out.println(al);
		System.out.println("Search " + al.contains("Steven"));
		System.out.println("Search " + al.contains("John"));
		System.out.println("First node element " + al.getFirst());
		System.out.println("Last node element " + al.getLast());

		// 3rd example
		Stack ss = new Stack();
		ss.push(100);
		ss.push(200);
		ss.push(300);
		ss.push(400);
		System.out.println(ss);
		System.out.println("Pop " + ss.pop()); // remove from stack ie 400 because it is the top most element(the last
												// element)
		System.out.println(ss); // displays the output as string format.
		System.out.println("Peek " + ss.peek()); // displays top most element ie 300
		System.out.println(ss); // displays the output as string format.
		System.out.println("Search " + ss.search(300)); // displays element position start from top
		System.out.println("Search " + ss.search(200));
		System.out.println("Search " + ss.search(800)); // if not present return -1
		System.out.println("_____________");

		// 4th Example

		ArrayList<Integer> numbers = new ArrayList<>();
		Random rand = new Random();

		for (int i = 0; i < 10; i++) {
			numbers.add(rand.nextInt(100) + 1);
		}

		// Print the initial list
		System.out.println("Original List: " + numbers);

		// Remove numbers greater than 50
		numbers.removeIf(num -> num > 50);

		// Print after removal
		System.out.println("After Removal (>50): " + numbers);

		// Sort the list in ascending order
		Collections.sort(numbers);

		// Print the sorted list
		System.out.println("Sorted List: " + numbers);

		// 5th example

		LinkedList<String> cities = new LinkedList<>();

		// Adding 5 city names
		cities.add("New York");
		cities.add("London");
		cities.add("Tokyo");
		cities.add("Paris");
		cities.add("Dubai");

		// Inserting a city at the second position (index 1)
		cities.add(1, "Khorazem");
		System.out.println("After Insertion at 2nd Position: " + cities);

		cities.removeLast();
		System.out.println("After Removing Last City: " + cities);

		// Print the list in reverse order
		System.out.print("List in Reverse Order: ");
		ListIterator<String> iterator = cities.listIterator(cities.size());
		while (iterator.hasPrevious()) {
			System.out.print(iterator.previous() + " ");
		}

		// 6th example
		System.out.println("_____________");
		ArrayList<String> student_names = new ArrayList<>();

		student_names.add("Tim");
		student_names.add("John");
		student_names.add("Ben");
		student_names.add("Ambrose");
		student_names.add("Aidan");

		ArrayList<String> employees = new ArrayList<>();

		employees.add("Akash");
		employees.add("Vinodh");
		employees.add("Ray");
		employees.add("Kennedy");
		employees.add("Ben");

		// Merge both lists into a new list
		ArrayList<String> mergedList = new ArrayList<>();
		mergedList.addAll(student_names);
		mergedList.addAll(employees);

		// Remove duplicates by converting to a Set and back to a List
		Set<String> set = new HashSet<>(mergedList); // Using HashSet to remove duplicates
		List<String> finalList = new ArrayList<>(set);

		// Sort the final list alphabetically
		Collections.sort(finalList);

		// Print the final sorted list
		System.out.println("Sorted List (with no duplicates): " + finalList);

		// 7th example
		System.out.println("_____________");
		ArrayList<String> programming_langs = new ArrayList<>();
		programming_langs.add("Java");
		programming_langs.add("Python");
		programming_langs.add("JavaScript");
		programming_langs.add("C++");
		programming_langs.add("Ruby");

		System.out.println("Original list " + programming_langs);

		Iterator<String> iterator2 = programming_langs.iterator();

		while (iterator2.hasNext()) {
			String programming_lang = iterator2.next();
			if (programming_lang.startsWith("J")) {
				iterator2.remove();
			}
		}

		System.out.println("Modified list " + programming_langs);

		// 8th example
		System.out.println("_____________");
		LinkedList<Integer> ints = new LinkedList<>();

		for (int i = 1; i <= 5; i++) {
			ints.add(i);
		}
		System.out.println("Original List: " + ints);

		// Step 2: Traverse the list forward and print each element
		ListIterator<Integer> listIterator = ints.listIterator();
		int position = 0;

		while (listIterator.hasNext()) {
			int current = listIterator.next();
			System.out.print(current + " ");
			position++;

			// Step 3: Insert 100 after the second element
			if (position == 2) {
				listIterator.add(100);
				System.out.println("\nInserted 100 after element 2");
			}
		}
		System.out.println("\nList after insertion: " + ints);

		// Step 4: Traverse the list backward and print each element
		System.out.print("Backward Traversal: ");
		while (listIterator.hasPrevious()) {
			int current = listIterator.previous();
			System.out.print(current + " ");
		}

	}

}

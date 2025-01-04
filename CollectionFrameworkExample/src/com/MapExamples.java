package com;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExamples {

	public static void main(String[] args) {
		// HashMap
//		Map mm = new HashMap();
//		mm.put(2, "Steven");
//		mm.put(3, "Meena");
//		mm.put(5, "Lex");
//		mm.put(7, "Leena");
//		System.out.println(mm);
//		System.out.println("Using key get value " + mm.get(2));

		// LinkedHashMap
//		Map mm = new LinkedHashMap();
//		mm.put(2, "Steven");
//		mm.put(1, "John");
//		mm.put(5, "Lex");
//		mm.put("a", "b");
//		mm.put(8, "Leena");
//		mm.put(2, "Raj"); // old value replaced by new value.
//		System.out.println(mm.containsKey(2));
//		System.out.println(mm.containsValue("John"));
//		System.out.println("does the value contain Lex " + mm.containsValue("Lex"));
//		System.out.println(mm);
//		System.out.println("using key get value " + mm.get(5));

		// TreeMap
		Map mm = new TreeMap(); // sorted using key, (in ascending order by-default). Data types must be the same
		mm.put(2, "Steven");
		mm.put(1, "John");
		mm.put(5, "Lex");
		mm.put(7, "Leena");
//		mm.put("name", "Tim");  // => returns error, as the data type is different
		System.out.println(mm.containsKey(2));
		System.out.println(mm.containsValue("John"));
		System.out.println(mm);
		System.out.println("using key get value " + mm.get(50));

	}

}

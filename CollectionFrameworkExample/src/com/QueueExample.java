package com;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		// PriorityQueue
		Queue q1 = new PriorityQueue(); // lower value comes first
		q1.add(4);
		q1.add(10);
		q1.add(6);
		q1.add(8);
		q1.add(3);
		System.out.println(q1); // it doesn't maintain the order. the first element with lower value comes first
		System.out.println("Remove " + q1.poll()); // it removes 3
		System.out.println(q1);
		System.out.println("----------------------");

		// LinkedList Queue

		Queue q2 = new LinkedList();

		q2.add(20);
		q2.add(4);
		q2.add(10);
		q2.add(2);
		q2.add("Tim");

		System.out.println(q2); // maintains order

		System.out.println("remove " + q2.poll()); // it deletes the first value in the map
		System.out.println(q2);
	}

}

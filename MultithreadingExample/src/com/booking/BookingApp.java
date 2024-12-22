package com.booking;

public class BookingApp implements Runnable {
	int available = 1;

	@Override
	public synchronized void run() {
		Thread t = Thread.currentThread();
		String name = t.getName();
		if (available == 1) {
			System.out.println(name + " got the ticket");
			available = available - 1;
		} else {
			System.out.println(name + " no ticket available");
		}

	}
}
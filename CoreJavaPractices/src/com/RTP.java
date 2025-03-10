package com;

class Cab {
	int baseFare;

	Cab() {
		baseFare = 50;
		System.out.println("Cab object constructed");
	}

	void bookCab(String from, String to) {
		System.out.println("Cab booked from " + from + " to " + to + " location. Please pay the " + baseFare);
	}
}

class MiniCab extends Cab {

	boolean isStreamingAvailable;

	MiniCab() {
		baseFare += 30;
		isStreamingAvailable = true;
		System.out.println("Mini Cab object constructed");
	}

	void bookCab(String from, String to) {
		System.out.println("Mini Cab booked from " + from + " to " + to + " location. Please pay the " + baseFare);
		System.out.println("On the way you can stream videos on the tablet");
	}

}

class SharedCab extends Cab {
	int numberOfPeople;

	SharedCab() {
		numberOfPeople = 4;
		baseFare -= 20;
		System.out.println("Shared Cab object construcred");
	}

	void bookCab(String from, String to) {
		System.out.println("Shared Cab booked from " + from + " to " + to + " location. Please pay " + baseFare);
		System.out.println("On the way you will share the cab with " + (numberOfPeople - 1) + " passangers");
	}
}

class CabBookingApp {
	static Cab book(int type) {
		Cab cab = null;

		if (type == 1) {
			cab = new MiniCab();
		} else if (type == 2) {
			cab = new SharedCab();
		} else {
			System.out.println("Invalid Selection");
		}
		return cab;
	}
}

public class RTP {

	public static void main(String[] args) {
//		Cab cab;
//		cab = new Cab();
//		cab = new MiniCab();
		Cab cab = CabBookingApp.book(2);
		cab.bookCab("Home", "Work");
	}

}

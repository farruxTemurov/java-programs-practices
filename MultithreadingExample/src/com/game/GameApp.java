package com.game;

public class GameApp {

	public static void main(String[] args) throws Exception {

		Car cc = new Car();
		Thread c1 = new Thread(cc);
		Thread c2 = new Thread(cc);
		Thread c3 = new Thread(cc);

		System.out.println("Game Started!");
		Thread.sleep(1000);
		System.out.println("3...");
		Thread.sleep(1000);
		System.out.println("2...");
		Thread.sleep(1000);
		System.out.println("1...");

		c1.setName("Innova Car");
		c2.setName("Santro Car");
		c3.setName("BMW Car");

		c1.start();
		c2.start();
		c3.start();

		c1.join(); // parent thread joins c1 thread and waits until it finishes

		System.out.println("Game Ended!");
	}

}

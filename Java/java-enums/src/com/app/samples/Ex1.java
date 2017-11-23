package com.app.samples;

//class Dir {

//	public static final Dir N = new Dir();
//}

interface Dir {
	void move();
}

enum Directions implements Dir {

	NORTH(10) {
		@Override
		public void displayDirection() {
			System.out.println("towards NORTH");
		}

		@Override
		public String toString() {
			return"UTHRA";
		}

		@Override
		public void move() {
			System.out.println("go towards delhi..");
		}
	},
	SOUTH(20) {
	@Override
		public void displayDirection() {
			System.out.println("towards SOUTH");
		}

		@Override
		public void move() {
			System.out.println("go towards chennai..");
		}
	},
	EAST(30) {
		@Override
		public void displayDirection() {
			System.out.println("towards EAST");
		}

		@Override
		public void move() {
			System.out.println("go towards kolkotta..");
		}
	},
	WEST(40) {
		@Override
		public void displayDirection() {
			System.out.println("towards WEST");
		}

		@Override
		public void move() {
			System.out.println("go towards mumbai..");
		}
	};

	private int value; // instance-var

	private Directions(int value) {
		this.value = value;
	}

	public int getValue() {
		return this.value;
	}

	public abstract void displayDirection();

}

public class Ex1 {

	public static void main(String[] args) {

		// System.out.println(Directions.NORTH.getClass().getName());

		Directions[] directions = Directions.values();
		for (Directions direction : directions) {
			// System.out.println(direction);
			// System.out.println(direction.ordinal());
			// System.out.println(direction.getValue());
			// direction.displayDirection();
		}
		//
		Directions direction = Directions.valueOf("NORTH");
		System.out.println(direction);

		// ------------------------------------------

	}

}

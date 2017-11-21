package com.samples2;

interface FI {
	void apply();
}

public class Ex5 {

	public static void main(String[] args) {

		FI fi = new FI() {
			@Override
			public void apply() {
				System.out.println("hello..");
			}
		};
		FI f2 = new FI() {
			@Override
			public void apply() {
				System.out.println("hello..");
			}
		};

		// ------------------------------
		//
		// FI lambda1=()->{}; //
		// FI lambda2=()->{};
		//
		// -----------------------------

	}

}

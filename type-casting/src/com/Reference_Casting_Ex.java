package com;

class V {
}

class C extends V {
}

class B extends V {
}

public class Reference_Casting_Ex {

	public static void main(String[] args) {

		// C c=new C();
		// B b = new B();
		//
		// V v = new C();
		// v = new B(); // implicit

		V v = new B();
		if (v instanceof C) {
			C c = (C) v;
			System.out.println("happy casting..");
		}else {
			System.out.println("u cant..");
		}

	}

}

package com;

import com.god.God;
import com.live.Animal;
import com.live.Human;
import com.live.LivingThing;
import com.live.Male;
import com.live.Robot;

public class App {

	public static void main(String[] args) {

		God god = new God();

		//LivingThing livingThing=new LivingThing();
		Human human = new Male();
		Animal animal = new Animal();
		Robot robot = new Robot();

		god.manageLT(human);
		System.out.println();
		god.manageLT(animal);
		System.out.println();
		god.manageLT(robot);

	}

}

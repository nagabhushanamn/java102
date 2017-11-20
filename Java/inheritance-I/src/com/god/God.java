package com.god;

import com.live.Animal;
import com.live.Human;
import com.live.LivingThing;

public class God {

	// public void manageHuman(Human human) {
	// human.eat();
	// human.sleep();
	// human.study();
	// human.work();
	// }
	//
	// public void manageAnimal(Animal animal) {
	// animal.eat();
	// animal.sleep();
	// animal.work();
	// }

	public void manageLT(LivingThing live) {
		live.eat();
		live.sleep();
		if (live instanceof Human) {
			Human human = (Human) live;
			human.study();
		}
		live.work();
	}

}

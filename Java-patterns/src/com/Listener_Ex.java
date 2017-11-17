package com;

// by Nag

import java.util.ArrayList;
import java.util.List;

class DoorEvent {
	private int num;
	private int floor;

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getFloor() {
		return floor;
	}

	public void setFloor(int floor) {
		this.floor = floor;
	}

}

interface DoorListner {
	void on(DoorEvent event);

	void off(DoorEvent event);
}

class Door {
	private List<DoorListner> doorListners = new ArrayList<>();

	public void addDoorListener(DoorListner doorListner) {
		doorListners.add(doorListner);
	}

	public void removeDoorListener(DoorListner doorListner) {
		doorListners.remove(doorListner);
	}

	public void open() {
		System.out.println("door opened..");
		DoorEvent event = new DoorEvent();
		event.setNum(1);
		event.setFloor(0);
		for (DoorListner listner : doorListners)
			listner.on(event);
	}

	public void close() {
		System.out.println("door closed..");
		DoorEvent event = new DoorEvent();
		event.setNum(1);
		event.setFloor(0);
		for (DoorListner listner : doorListners)
			listner.off(event);
	}
}


class Light implements DoorListner{

	@Override
	public void on(DoorEvent event) {
		System.out.println("Light on - "+event.getNum() +" - "+event.getFloor());	
	}

	@Override
	public void off(DoorEvent event) {
		System.out.println("Light off - "+event.getNum() +" - "+event.getFloor());
	}
	
}

public class Listener_Ex {

	public static void main(String[] args) throws InterruptedException {
		Door door = new Door();
		Light light=new Light();
		door.addDoorListener(light);
		
		door.open();
		Thread.sleep(5000);
		door.close();
	}

}

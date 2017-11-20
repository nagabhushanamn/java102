package com.app.util;

public class LinkedList {

	private Node head;

	public void add(String data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			return;
		}
		Node lastNode = head;
		while (lastNode.getNext() != null) {
			lastNode = lastNode.getNext();
		}
		lastNode.setNext(newNode);
	}

	
	
	private class Node {

		private String data;
		private Node next;

		public Node(String data) {
			super();
			this.data = data;
		}

		public Node(String data, Node next) {
			super();
			this.data = data;
			this.next = next;
		}

		public String getData() {
			return data;
		}

		public void setData(String data) {
			this.data = data;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}

	}

}

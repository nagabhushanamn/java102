package com.app.util;

import java.util.Iterator;

public class LinkedList<E> implements Iterable<E> {

	private Node head;

	public void add(E data) {
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

	public void add(int idx, E data) {
		// Todo
	}

	public E get(int idx) {
		// Todo
		return null;
	}

	public void delete(int idx) {
		// Todo
	}
	public void delete(E data) {
		// Todo
	}

	public void reverse() {
		// Todo
	}

	private class Node {

		private E data;
		private Node next;

		public Node(E data) {
			super();
			this.data = data;
		}

		public Node(E data, Node next) {
			super();
			this.data = data;
			this.next = next;
		}

		public E getData() {
			return data;
		}

		public void setData(E data) {
			this.data = data;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}

	}

	@Override
	public Iterator<E> iterator() {
		return new Iterator<E>() {
			Node current = head;

			@Override
			public boolean hasNext() {
				return current != null ? true : false;
			}

			@Override
			public E next() {
				E data = current.getData();
				current = current.getNext();
				return data;
			}
		};
	}

}

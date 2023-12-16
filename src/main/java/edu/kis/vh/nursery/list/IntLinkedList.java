package edu.kis.vh.nursery.list;

public class IntLinkedList {

	Node last;

	public void push(int newElement) {
		if (last == null) {
			last = new Node(newElement);
		} else {
			last.next = new Node(newElement);
			last.next.prev = last;
			last = last.next;
		}
	}

	public boolean isEmpty() {
		return last == null;
	}

	public boolean isFull() {
		return false;
	}

	public int top() {
		if (isEmpty()) {
			return -1;
		}
		return last.value;
	}

	public int pop() {
		if (isEmpty()) {
			return -1;
		}
		int result = last.value;
		last = last.prev;
		return result;
	}

}

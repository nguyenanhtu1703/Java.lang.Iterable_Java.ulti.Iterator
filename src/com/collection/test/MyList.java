package com.collection.test;

import java.util.Iterator;

import java.lang.Iterable;

class MyList<T> implements Iterable<T> {
	Node<T> head, tail;
	public void add(T data) {
		Node<T> node = new Node<T>(data, null);
		if (head == null)
			tail = head = node;
		else {
			tail.setNext(node);
			tail = node;
		}
	}
	@Override
	public Iterator<T> iterator() {
		return new MyIterator<>(this);
	}
	public Node<T> getAHead() {
		return head;
	}
	public Node<T> getTail(){
		return tail;
	}
}

class MyIterator<T> implements Iterator<T> {
	Node<T> current;
	MyIterator(MyList<T> obj){
		current = obj.getAHead();
	}
	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return (current != null);
	}
	@Override
	public T next() {
		// TODO Auto-generated method stub
		T data = current.getData();
		current = current.getNext();
		return data;
	}
	public void remove() {
		throw new UnsupportedOperationException();
	}
}

class Node<T> {
	T data;
	Node<T> next;
	public Node(T data, Node<T> next) {
		this.data = data;
		this.next = next;
	}
	public void setData(T data) {
		this.data = data;
	}
	public void setNext(Node<T> next) {
		this.next = next;
	}
	public T getData() {
		return data;
	}
	public Node<T> getNext(){
		return next;
	}
}

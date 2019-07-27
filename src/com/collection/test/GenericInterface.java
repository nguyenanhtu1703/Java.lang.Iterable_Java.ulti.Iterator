package com.collection.test;

import java.util.Iterator;
import java.lang.Iterable;

public interface GenericInterface<E> {
}

class D<G>{
	public void show(G g) {
		System.out.println(g);
	}
}

class B<E> implements GenericInterface<E> {
}

class C<E> implements Iterator<E> {
	public int aField = 5;
	public C() {
		aField = 10;
	}
	@Override
	public boolean hasNext() {
		System.out.println(aField);
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public E next() {
		// TODO Auto-generated method stub
		return null;
	}
}


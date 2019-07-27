package com.collection.test;

public interface TestInterface<E> {
	final static int a = 100;
	static void yes() {
		System.out.println("focus");
	}
	default void yesyes() {
		System.out.println("focus 2");
	}
}



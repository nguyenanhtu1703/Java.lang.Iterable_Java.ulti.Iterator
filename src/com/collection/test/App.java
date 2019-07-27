package com.collection.test;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class App {
	public static <E> void main(String[] args) {
		MyList<Integer> myList = new MyList();
		myList.add(5);
		myList.add(6);
		myList.add(7);
		myList.add(8);
		myList.add(9);
		myList.add(4);
		
		Iterator it = myList.iterator();
		System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.next());
		
		for(Integer t : myList) {
			System.out.println(t);
		}
		
		Iterator i = new C();
	}
}
package org.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public  class Test {
	public static void main(String[] args) {
		List l = new ArrayList();
		l.add(10);
		l.add("naveen");
		l.add(2546.0213);
		l.add(20024552354l);
		Iterator iterator = l.iterator();
		while (iterator.hasNext()) {
			Object object =  iterator.next();
			System.out.println(object);
			
		}
		
		List<Integer> li = new ArrayList<Integer>();
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(40);
		li.add(50);
		Iterator<Integer> iterator2 = li.iterator();
		while (iterator2.hasNext()) {
			Integer integer = iterator2.next();
			
			System.out.println(integer);
		}
	}
	
}

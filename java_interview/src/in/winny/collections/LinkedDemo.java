package in.winny.collections;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedDemo {
	public static void main(String[] args) {
		LinkedList<Integer> ll = new LinkedList<>();
		
		ll.add(23);
		ll.add(45);
		ll.add(67);
		ll.add(24);
		Collections.sort(ll);
		System.out.println(ll); // 10, 20, 30, 40
		ll.add(1, 15);
		System.out.println(ll); // 10, 15, 20, 30, 40
		System.out.println(ll.getLast());
	}
}

package in.winny.collections;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayListDemo {
	
	int id;
	 String name;
	 public ArrayListDemo(int id, String name) {
	  this.id = id;
	  this.name = name;
	 }
	@Override
	public String toString() {
		return "ArrayListDemo [id=" + id + ", name=" + name + "]";
	}
	public static void main(String[] args) {
		ArrayList<ArrayListDemo> al= new ArrayList<>();
		al.add(new ArrayListDemo(1,  "Chandhu"));
		al.add(new ArrayListDemo(2,  "Shiri"));
		al.add(new ArrayListDemo(3,  "Anvika"));
		//al.add(new ArrayListDemo(3,  "Anvika")); //it will allow duplicate elements
		al.add(new ArrayListDemo(4,  "Rithvik"));
		System.out.println(al);
		ListIterator<ArrayListDemo> li = al.listIterator();
		  while (li.hasNext()) {
		}
		  
		/*
		 * ArrayList<Integer > al = new ArrayList<>(); al.add(10); al.add(20);
		 * al.add(30); al.add(40); System.out.println(al);
		 */
	}
}
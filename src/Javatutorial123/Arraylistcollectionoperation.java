package Javatutorial123;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Arraylistcollectionoperation {

	public static void main(String[] args) {
		// It allow the duplicate and maintain the insertion order.
		List <String>arraylist= new ArrayList<String>();
		arraylist.add("hello");
		arraylist.add("how");
		arraylist.add("Hi");
		arraylist.add("bye");
		arraylist.add("bye");
		arraylist.add(null);
		System.out.println(arraylist);

		// dynamic polymorphism concept of creating the obj.
		//parentclassname reference = new childclassname
		List <String>arraylist2= new ArrayList<String>();

		// To copy all the data of one list to another list.
		arraylist2.addAll(arraylist);
		System.out.println(arraylist2);

		// To get the index position of particular element.
		System.out.println(arraylist.indexOf("Hi"));

		// To get the element of particular index.
		System.out.println(arraylist.get(2));

		// To check all the elements are equal between two array list.
		System.out.println(arraylist.equals("arraylist2"));

		// To get the index of element "bye" which comes last.
		System.out.println(arraylist.lastIndexOf("bye"));

		// To check the array list  is empty. it returns True or false.
		System.out.println(arraylist.isEmpty());

		// To remove the element of particular index.
		//System.out.println(arraylist.remove(4));

		// To update the element of particular index.
		System.out.println(arraylist.set(2, "vino"));
		System.out.println(arraylist);

		// To know the size of array list.
		System.out.println(arraylist.size());

		// To get the each element of array list.
		for (String string : arraylist2) {
			System.out.println(" from for each:"+ (string));
		}

		// To get the each element of array list.
		for (int i = 0; i < arraylist2.size(); i++) {
			System.out.println("from for loop:"+ arraylist.get(i));
		}

		/*
		 * Important interview question:
		 * ListIterator is used to iterate the array list. using ListIterator we can
		 * traverse on both direction (next , Previous)
		 */
		ListIterator<String> iterator= arraylist.listIterator();

		while(iterator.hasNext()) {
			System.out.println("listiterator: "+ iterator.next());
		}
		System.out.println("*********************");
		while(iterator.hasPrevious())
		{
			System.out.println("listiterator: "+ iterator.previous());
		}
		
		// Iterator can only traverse forward no on reverse.
		Iterator iterator1= arraylist.iterator();

		while(iterator1.hasNext()) {
			System.out.println("Iterator :" + iterator1.next());
		}


	}

}

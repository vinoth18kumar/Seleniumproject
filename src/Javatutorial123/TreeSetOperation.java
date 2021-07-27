package Javatutorial123;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetOperation {

	/**
	 * TreeSet is the implementation class of SortedSet Interface.
	 * Does not allow duplicates.
	 * Sorts the elements
	 * It has 6 methods like first,last,headSet,tailSet,subSet and comparator.
	 * Difference between Hashset and Treeset, hash doesnt maintain order
	 * but Treeset maintains ascending or alphabetical order.
	 * DS-> Balanced Tree
	 * Heterogeneous data not allowed. If added Exception, ClassCast will occur
	 * For default natural sorting order,the objects should be homogeneous and comparable else class cast exception
	 * To say any class is comporable or not, the class should implement comparable interface.
	 */
	/*
	 * Constructors present are 4
	 * 1. TreeSet ts= new TreeSet();// default sort order
	 * 2. TreeSet ts= new TreeSet(Comparator c);// customized sorting order defined by comparator object
	 * 3. TreeSet ts= new TreeSet(Collection c);// equivalent tree set of any collection will be created
	 * 4. TreeSet ts= new TreeSet(SortedSet s);// creates tree set for given sorted set
	 */

	public static void main(String[] args) {
		// Creating object
		TreeSet ts= new TreeSet();
		ts.add(1);
		ts.add(2);
		ts.add(5);
		ts.add(3);
		ts.add(255);
		ts.add(15);
		ts.add(501);
		ts.add(51);
		// ts.add(null); it is not allowed. it throws null pointer exception
		// o/p: [1, 2, 3, 5, 15, 51, 255, 501]
		System.out.println(ts);

		// it return the 1st element in the list.
		System.out.println(ts.first());

		//it return  the last element in the list
		System.out.println(ts.last());

		// it return the next higher value of 2. o/p: 3
		System.out.println(ts.higher(2));

		// it return the next lesser value of 5. o/p: 3
		System.out.println(ts.lower(5));

		// it sort the set values in descending.
		// o/p: [501, 255, 51, 15, 5, 3, 2, 1]
		System.out.println(ts.descendingSet());

		// Important interview question: it return the set of elements before 2. Note: it wont include 2.
		System.out.println(ts.headSet(2));

		// Important interview question: it return the set of elements after 3. Note: it will include 3.
		System.out.println(ts.tailSet(3));

		// Important interview question: it return the set between 2 and 51. 
		// it will not include the starting and ending element.
		System.out.println(ts.subSet(2, 51));

		//Important interview question: comparator returns null if the sorting is default natural order: null
		// the class like integer, string etc used in generic.. should implement comparable interface else will throw class cast exception.
		System.out.println(ts.comparator());

		//it return the 1st element and delete the 1st element.
		System.out.println(ts.pollFirst());

		// it return the last element and delete the last element.
		System.out.println(ts.pollLast());
		System.out.println(ts);

		// To iterate the element in set
		Iterator iterator = ts.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		// To iterate the element in descending order
		Iterator deciterator = ts.descendingIterator();
		while (deciterator.hasNext()) {
			System.out.println("decending order: " + deciterator.next());

		}


	}

}

package Javatutorial123;

import java.util.Iterator;
import java.util.LinkedList;

public class Linkedlistoperation {

	public static void main(String[] args) {
		/**
		 * LinkedList is implemented using Doubly linked list. This is best suited for insertion and deletion operations.
		 * Unlike ArrayList, this is not the best for retrieving the data.
		 * All the collections implements Serializable and cloneable Interfaces.
		 *  LinkedList also implements those Interfaces but not RandomAccess Interface.
		 */		

		//Create a simple Linked list
		LinkedList<Integer> linked= new LinkedList();

		linked.add(1);
		linked.add(2);
		linked.add(3);
		linked.add(4);
		linked.add(5);
		linked.add(4);
		linked.add(5);
		linked.add(4);
		linked.add(5);
		linked.add(6);

		System.out.println("Printing the list: " +linked);
		System.out.println("linkedlist size: " +linked.size());

		//Add an element to the first position
		linked.addFirst(0);

		//Add an element at last
		linked.addLast(7);
		System.out.println(linked);

		/*
		 * LinkedList performs the worst if the operation is retrieval of data.
		 * Hence if our requirement is to fetch data, we should use ArrayList.
		 * But LinkedList is the best choice if we have requirements of adding and 
		 * removing data very often. In this case we should avoid ArrayList
		 */

		//Get the first value
		System.out.println("First Value :" +linked.getFirst());

		//Get the first value using index position
		System.out.println("First Value using index :"+linked.get(0));

		/*
		 * Now get the third value of the list.
		 * Since LinkedList has the data structure of doubly linked list,
		 * the value of the third index is known only to the link present in
		 * the Second index. Internally, the program will traverse to index number 2 and then only
		 * it can get the value of 3. So Linked list is not suited for search operations.
		 */
		System.out.println("Third value of the list : "+ linked.get(3));

		//removeFirst and removeLast
		System.out.println(linked.remove(0));
		System.out.println("Remove first :"+linked.removeFirst());
		System.out.println("Remove last :"+linked.removeLast());
		
		//poll method  and pollfirst() deletes the first element in the list, pollLast deletes the last
		System.out.println(linked.poll());
		System.out.println(linked);
		System.out.println(linked.pollFirst());
		System.out.println(linked);
		System.out.println(linked.pollLast());
		System.out.println(linked);

		// To check the linked list is empty. it return in boolean.
		System.out.println(linked.isEmpty());

		//update the values using set(). below eg update at index 2 with the value 10.
		System.out.println(linked.set(2, 10));
		System.out.println(linked);

		//To check the list contains 10 and return in boolean
		System.out.println(linked.contains(10));


		//removeFirstOccurenc
		linked.removeFirstOccurrence(4);
		//removeLastOccurrence
		linked.removeLastOccurrence(5);
		System.out.println(linked);

		for (int i = 0; i < linked.size(); i++) {
			System.out.println("from for loop:"+ linked.get(i));
		}		
		for (Integer list : linked) {
			System.out.println(" from for each:"+ (list));
		}
		/*
		 * Iterate using Iterator
		 */
		Iterator iterator= linked.iterator();
		while(iterator.hasNext()) {
			System.out.println("Iterator :" + iterator.next());
		}

	}

}

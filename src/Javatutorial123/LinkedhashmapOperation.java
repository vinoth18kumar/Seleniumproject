package Javatutorial123;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class LinkedhashmapOperation {

	public static void main(String[] args) {
		/*
		 * insertion order is maintained in linkedhashmap.
		 * duplicate key are not allowed but duplicate values are allowed.
		 * only one Null value is allowed becuase we are not going to compare the keys, we just retrive in insertion order. if we use for second time the value will be override.
		 * A Value of map can only be fetched using it's Key.
		 */
		LinkedHashMap<String, String> linked = new LinkedHashMap<String, String>();
		
		linked.put("student", "Vinoth");
		linked.put("dept", "CSE");
		linked.put("Sex", "Male");
		linked.put(null, "Kings");
		// Important interview question: only one Null value is allowed.if we use for second time the value will be override.
		linked.put(null, "Engineering");
		
		
		
		System.out.println(linked);
		// insertion order is not maintained in hashmap
		HashMap<String, String> hashmap= new HashMap<String, String>();
		
		hashmap.put("student", "Vinoth");
		hashmap.put("dept", "CSE");
		hashmap.put("Sex", "Male");
		
		System.out.println(hashmap);
		
	}

}

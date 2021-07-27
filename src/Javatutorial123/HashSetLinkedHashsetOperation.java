package Javatutorial123;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class HashSetLinkedHashsetOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hs= new HashSet();
		hs.add("A");
		hs.add("B");
		hs.add("C");
		hs.add("hello");
		hs.add("A");
		hs.add("E");		
		System.out.println("printing the array: " + hs);
		System.out.println(hs.contains("hello"));
		System.out.println(hs.isEmpty());
		System.out.println(hs.size());
		System.out.println(hs.remove("E"));
		for (String str : hs) {
			System.out.println("printing by foreach: "+ str);
					
		}
		
		Iterator<String> iterator= hs.iterator();
		while (iterator.hasNext()) {
			String string = (String) iterator.next();
			System.out.println(string);
		}
		Set linkedhashset = new LinkedHashSet();
		linkedhashset.add("1");
		linkedhashset.add("7");
		linkedhashset.add("12");
		linkedhashset.add("5");
		linkedhashset.add("7");
		System.out.println(linkedhashset);
		System.out.println(linkedhashset.contains("12"));
		System.out.println(linkedhashset.isEmpty());
		System.out.println(linkedhashset.size());
		//linkedhashset.clear();
		System.out.println(linkedhashset);
		for (Object obj : linkedhashset) {
			System.out.println("printing via foreach: " +obj);
		}
	
		
	}

}

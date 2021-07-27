package Javatutorial123;

import java.util.HashMap;
import java.util.Map;

public class HashmapOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> employeemap= new HashMap<Integer,String>();
		employeemap.put(10, "vinoth");
		employeemap.put(11, "Amudha");
		employeemap.put(12, "Viji");
		employeemap.put(13, "Kumar");
		employeemap.put(14, "Yakshith");
		
		// To check the key 11 is present in Hashmap. it returns in boolean.
		System.out.println(employeemap.containsKey(11));
		
		//To check the value is present in Hashmap. it returns in boolean.
		System.out.println(employeemap.containsValue("Viji"));
		
		// To get the value of key  12
		System.out.println(employeemap.get(12));
		
		// To get all the entry of the set.
		System.out.println(employeemap.entrySet());
		
		// To get the all the set of keys.
		System.out.println(employeemap.keySet());
		
		// to get all the set of values 
		System.out.println(employeemap.values());
		
		// To make a copy of existing map.
		Map<Integer, String> duplicatemap=new HashMap<Integer, String>();
		duplicatemap.putAll(employeemap);
		
		// To replace the value of existing key.
		duplicatemap.replace(13, "skumar");
		System.out.println(duplicatemap);
		
		//To clear the data of map.
		duplicatemap.clear();
		System.out.println(duplicatemap);		
		
		
	}

}

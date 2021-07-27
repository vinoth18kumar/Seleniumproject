package Javatutorial123;

import java.util.TreeMap;

public class TreeMapOperation {

	public static void main(String[] args) {
		/*
		 * Treemap(c) is a implementation class for Map(I). Duplicate key are not
		 * allowed but duplicate values are allowed. Null key is not allowed. the
		 * element is retrived in natural sorting order.
		 */
		TreeMap<String, String> area=new TreeMap<String, String>();
		area.put("Ambattur", "Chennai");
		area.put("Tnagar", "Chennai");
		area.put("Padi", "Chennai");
		area.put("Redhills", "Chennai");
		area.put("Central", "Chennai");
		// important interview question: if we use the same/duplicate key the value will be overrider 
		area.put("Chennai", "ambattur");
		area.put("Chennai", "Avadi");
		/*
		 * null key is not allowed. it throws the Null pointer exception. 
		 * we compare the keys for natural sorting order if we use null we can't compare.
		 * area.put(null, ambattur);
		 */				
		System.out.println(area);
		
	}

}

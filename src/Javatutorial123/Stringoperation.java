package Javatutorial123;

public class Stringoperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="vinothkumar";
		int number=7;
				
		//returns character value for the particuar index
		System.out.println(name.charAt(1));
		
		//returns srting length
		System.out.println(name.length());
		
		//to check the two strings are equal.
		System.out.println(name.equals("vinoth"));
		
		//to check the two  strings are equal ignoring the case sensitive 
		System.out.println(name.equalsIgnoreCase("VINOTHKUMAR"));
		
		//return true or false
		System.out.println(name.isEmpty());
		
		//return true or false
		System.out.println(name.contains("a"));
		
		//it will return the name with beginning index 1
		System.out.println(name.substring(1));
		
		//it will retrun the name with beginning index 1 and till 
		//end index 3 but it wont return index 3
		System.out.println(name.substring(1,3));
		
		//append the string to the given string
		System.out.println(name.concat("kumar"));
		//
		System.out.println(name.replace("k", "A"));
		System.out.println(name.replace("Vinoth", "Vino"));
		//it return the index of char o
		System.out.println(name.indexOf("o"));
		System.out.println(name.indexOf("o",2));
		System.out.println(name.indexOf("vino", 1));
		
		//remove the space
		System.out.println(name.trim());
		
		//convert the given data type to string
		System.out.println(String.valueOf(number));
		
		//convert to upper case
		String girl= "priya";
		System.out.println(girl.toUpperCase());
		
		//conver to lower case
		String boy= "VINO";
		System.out.println(boy.toLowerCase());
		
		//return the join string with delimiter
		System.out.println(String.join("-", "Priya","Vinoth"));
		System.out.println(String.join("/", "13","04","1994"));
		
		//split
		String splitthis="Am,I,loving,you,priya";
		String [] splitedwords=splitthis.split(",");
		for(String string:splitedwords)
		{
			System.out.println(string);
			
		}
		
				
	}

}

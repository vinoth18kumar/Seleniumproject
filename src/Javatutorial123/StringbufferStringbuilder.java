package Javatutorial123;

public class StringbufferStringbuilder {

	public static void main(String[] args) {
		// Stringbuffer and stringbudget both are mutable and both has same menthods, the difference is 
		// string buffer will not allow multithread.
		// stringbudget will allow multithread.
		// it can be declared only with the new keyword
		//append
		StringBuffer name1= new StringBuffer("Vinothkumar");
		System.out.println("my name is "+ name1.append(name1));
		//replace
		StringBuffer replace1= new StringBuffer("Vinothkumar");
		System.out.println("my name is "+ replace1.replace(0, 5, "Priya"));
		//delete
		StringBuffer delete1= new StringBuffer("Vinothkumar");
		System.out.println("my name is "+ delete1.delete(1,4));
		//insert
		StringBuffer insert1= new StringBuffer("Vinothkumar");
		System.out.println("my name is "+ insert1.insert(4, "vino"));
		//capacity
		System.out.println("my name is "+ insert1.capacity());
		//Like string we have chartAT, Substring, lenght methods as well.
			
	}
	
}

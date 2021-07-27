package Javatutorial123;

public class Constructorfunction {
	
	/* Basically constructor is used to a code with in the block, it is used to initialize value.
	 * the constructor name should be same as class name, it should not have explicit return type
	 * 3 types of constructor are follows   
	 * No Argument constructor
	 * Default constructor is invisible.
	 * parameter constructor 
	 */
	Integer age;
	String name;
	String city;
	public Constructorfunction()
	{
		age= 10;
		name="vinoth";
		city="ambattur";

		System.out.println("My age is: "+ age);
	}
	public Constructorfunction(String n, String c)
	{
		name=n;
		city=c;
	}

	public Constructorfunction(Integer a,String n, String c )
	{
		age=a;
		name=n;
		city=c;
	}
	
	public void getdetails()
	{
		System.out.println("I am "+ name+ "coming from "+ city);
	}
	public void getfulldetails()
	{
		System.out.println("I am "+ name+ "coming from "+ city);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
					
		Constructorfunction constructor2= new Constructorfunction("vinoth","ambattur");
		constructor2.getdetails();
		
		Constructorfunction constructor3= new Constructorfunction(29,"vinoth","ambattur");
		constructor3.getfulldetails();
		Constructorfunction constructor= new Constructorfunction();		
	}
}

	
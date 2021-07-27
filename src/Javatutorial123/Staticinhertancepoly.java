package Javatutorial123;

public class Staticinhertancepoly extends Constructorfunction {

	static int a;
	static String name;
	//static key is used in variable, methods, class (in nested class), block.
	//static 
	static {
	a=10;
	name="vinoth";
	}
	public static void getbalnce()
	{
		System.out.println("static method");
		
	}
	public void getamount()
	{
		System.out.println("Non static method");
		
	}
	public int getdata()
	{
		return a;
	}
	public String getdata(String nam)
	{
		return name;
	}
	
	public void getdetails()
	{
		System.out.println("I am "+ name + " coming from "+ a);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Staticinhertancepoly obj= new Staticinhertancepoly();
		// calling static method without object
		getbalnce();
		obj.getamount();
		//calling static variable without object
		System.out.println("calling static variable " + name);
		// below is the example of method overloading,it is executed in compile time
		obj.getdata();
		obj.getdata("ashok");
		//creating object, overriding,it is executed in runtime
		Constructorfunction inher= new Staticinhertancepoly();
		inher.getdetails();
		//calling parent class method using 
		inher.getfulldetails();
							
	}

}

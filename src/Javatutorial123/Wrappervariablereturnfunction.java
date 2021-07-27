package Javatutorial123;

public class Wrappervariablereturnfunction {
	
	Integer amount=1000;
	Long accountnumber=987654321l;
	String name="vinoth";
			
	public void getbalance()
	{
		System.out.println("The account numner is: " + accountnumber );
	}
	
	public Integer getamount()
	{
		System.out.println("the amount is: "+ amount );
		return amount;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Wrappervariablereturnfunction wvrf= new Wrappervariablereturnfunction();
		wvrf.getbalance();
		Integer amt= wvrf.getamount();
		System.out.println("the amount from void main is" + amt);
				
	}
}
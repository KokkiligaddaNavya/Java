package MethodOverloading;

public class Aadhar {
	public static void main(String[] args) {
		
		//user1
		Details D1 = new Details();
		D1.setDetails(null);
		D1.getDetails();
		
		//user2 
		Details D2 = new Details();
		D2.setDetails("HYY7898Q0","A1234590");
		D2.getDetails();
			
		//user 3
		Details D3 = new Details();
		D3.setDetails("ktx78yuo0","567gihgiu","T6789009");
		D3.getDetails();
		
		
	}

}

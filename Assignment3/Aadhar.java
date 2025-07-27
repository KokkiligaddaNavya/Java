package MethodOverloading;

public class Aadhar {
	public static void main(String[] args) {
		
		//user1
		Details D1 = new Details();
		System.out.println("User 1 details");
		D1.setDetails("KTXPK4505D");
		D1.getDetails();
		
		//user2 
		Details D2 = new Details();
		System.out.println("User 2 details");
		D2.setDetails("HYY7898Q0","A1234590");
		D2.getDetails();
			
		//user 3
		Details D3 = new Details();
		System.out.println("User 3 details");
		D3.setDetails("ktx78yuo0","567gihgiu","T6789009");
		D3.getDetails();
		
	}

}

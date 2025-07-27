package MethodOverloading;

//import java.util.Scanner;

public class Details {
	
	String Pan, VoterID, Passport;
	
	public void setDetails(String Pan)
	{
		/*System.out.println("Enter the PAN");
		Scanner input = new Scanner(System.in);
		String Pan = input.next();
		input.close();	
		*/
		this.Pan = Pan;
		System.out.println("Entered Pan:" +Pan);
	}
	
	public void setDetails(String Pan,String VoterID)
	{
		this.Pan = Pan;
		this.VoterID = VoterID;	
		System.out.println("Entered Pan:" +Pan);
		System.out.println("Entered VoterID:" +VoterID);
	}
	
	public void setDetails(String Pan,String VoterID, String Passport)
	{
		this.Pan = Pan;
		this.VoterID = VoterID;	
		this.Passport = Passport;
		System.out.println("Entered Pan:" +Pan);
		System.out.println("Entered VoterID:" +VoterID);
		System.out.println("Entered Passport ID:"+Passport);	
	}
	
	
	public void getDetails()
	{
		
		if(Pan == null && VoterID ==null && Passport == null)
		{
			System.out.println("Please enter valid details");
		}
		else 
		{
			System.out.println("Your AADHAR number is: ");
			for(int x=0;x<3;x++)
			{
				double num = Math.random()*10000;
				System.out.printf("%04d ",(int)num);
			}
		}
		System.out.println("\n");
	}

}

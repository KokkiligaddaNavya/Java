package Methods;

import java.util.Scanner;

public class CalciStatic {
	
	//No return type no arguments
	
	public static void natSum1()
	{
		System.out.println("Enter any natural number");
		Scanner input = new Scanner(System.in);
		int n =input.nextInt();
		System.out.println("Sum of "+n+" natural numbers is " +(n*(n+1)/2));
		input.close();	
	}
	
	//Return type and no arguments
	public static int natSum2()
	{
		System.out.println("Enter any natural number");
		Scanner input = new Scanner(System.in);
		int n =input.nextInt();
		input.close();	
		return (n*(n+1)/2);
	}
	
	//No return type and arguments
	public static void natSum3(int n) 
	{
		System.out.println("Sum of "+n+" natural numbers is " +(n*(n+1)/2));
	}
	
	//Return type and arguments
	public static int natSum4(int n)
	{
		return n*(n+1)/2;
	}

}

package Assignment6;

import java.util.Scanner;

import exceptions.InsufficientBalanceException;
import exceptions.InvalidDepositAmountException;

public class bankDetails {
	
	static int Balance = 2000;
	static int depositAmount, Withdraw;
	
	public static void Pin()
	{
		System.out.println("Enter your Pin");
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		int pin = input.nextInt();
		if(pin==6600)
		{
			System.out.println("please select");
			System.out.println("1. Deposit");
			System.out.println("2. Widthdraw");
			System.out.println("3. Balance");
			try (Scanner input1 = new Scanner(System.in)) {
				int selection = input1.nextInt();
				switch (selection) {
				case 1: {
					
					bankDetails.Deposit();
					break;
				}
				case 2: {
				
					bankDetails.Withdrawl();
					break;
				}
				case 3:{
					System.out.println("Your current Balance is "+Balance);
					break;
				}
				default:{
					try {
						throw new IllegalArgumentException();
					}
					catch(IllegalArgumentException e) {
						System.out.println("invalid selection "+selection);
					}
				}
					
				}
			}
		
	
		}
		else
		{
			System.out.println("Pin you entered is invalid");
		}
		
	}


	@SuppressWarnings("resource")
	public static void Deposit() {
		Scanner input2 = new Scanner(System.in);
		System.out.println("Enter the amount to be deposited");
		depositAmount = input2.nextInt();
		
		if(depositAmount >0)
		{
			Balance +=depositAmount;
			System.out.println("Your Amount is deposited");
			System.out.println("Your current Balance is "+Balance);
		}
		else
		{
			try {
				throw new InvalidDepositAmountException();
			}
			catch(InvalidDepositAmountException e)
			{
				System.out.println(e.getMessage());
			}
		}
		input2.close();
	}
	
	public static void Withdrawl() {
		Scanner input3 = new Scanner(System.in);
		System.out.println("Enter the amount to be withdraw");
		Withdraw = input3.nextInt();
		if(Balance>Withdraw)
		{
			Balance -= Withdraw;
			System.out.println("Withdraw successfull");
			System.out.println("Your current balance is "+Balance);
		}
		else {
			try {
				throw new InsufficientBalanceException();
			}
			catch(InsufficientBalanceException e)
			{
				System.out.println(e.getMessage());
			}
		}
		input3.close();
	}
}

package application;

import java.util.Scanner;

import model.entities.Account;
import model.exception.WithoutBalanceException;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Enter account data: ");
			
			System.out.print("Number: ");
			int number = sc.nextInt();
			System.out.print("Holder: ");
			sc.nextLine();
			String holder = sc.nextLine();
			System.out.print("Initial balance: ");
			Double balance = sc.nextDouble();
			System.out.print("Withdraw limit: ");
			Double withdrawLimit = sc.nextDouble();
			
			Account account = new Account(number, holder, balance, withdrawLimit);
			
			System.out.print("Enter amount for withdraw: ");
			Double amount = sc.nextDouble();
			
			account.withdraw(amount);
			
			System.out.println("New balance: " + account.getBalance());
		}
		catch (WithoutBalanceException e) {
			System.out.println(e.getMessage());
		}
	}

}

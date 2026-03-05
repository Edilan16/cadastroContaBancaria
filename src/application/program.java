package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account conta;
		
		
		System.out.println("Enter acount number: ");
		int number = sc.nextInt();
		
		sc.nextLine();
		System.out.println("Enter account holder : ");
		String holder = sc.nextLine();
		
		
		System.out.println("Enter there na initial deposit (Y/n ? ");
		char resposta = sc.next().charAt(0);
		
		
		
		
		
		if (resposta  == 'y') {
			System.out.println(" What amount do you wish to deposit ? ");
			double initialDeposit = sc.nextDouble();
			conta = new Account( number, holder, initialDeposit);
		}
		else {
			 conta =new Account(number,holder);
		}
	
			
		System.out.println();
		System.out.println("Account data: ");
		System.out.println(conta);
		
		System.out.println();
		System.out.println("Enter a deposit value:" );
		double amount = sc.nextDouble();
		conta.deposit(amount);
		System.out.println("Updated account value: ");
		System.out.println(conta);
		System.out.println();
		
		System.out.println();
		System.out.println("Enter a withdraw value: ");
		amount = sc.nextDouble();
		conta.withdraw(amount);
		
		
		
		sc.close();
	}

}

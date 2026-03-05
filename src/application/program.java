package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double balance = 0;
		
		System.out.println("Enter acount number: ");
		int number = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter account holder : ");
		String holder = sc.nextLine();
		
		
		System.out.println("Enter there na initial deposit (Y/n ? ");
		char resposta = sc.next().charAt(0);
		
		Account conta = new Account( number, holder);
		
		
		
		if (resposta  == 'y') {
			System.out.println(" What amount do you wish to deposit ? ");
			balance = sc.nextDouble();
			 conta.setBalance(balance);
		}
	
		System.out.println();
		System.out.println("Account Data: ");
		System.out.println("Account "+conta.getNumber()+" Holder: "+conta.getHolder()+" Balance: "+ String.format("%.2f", conta.getBalance()));
		
		System.out.println();
		System.out.println("Enter a deposit value:" );
		double amount = sc.nextDouble();
		conta.deposit(amount);	
		
		System.out.println();
		System.out.println("Account Data: ");
		System.out.println("Account "+conta.getNumber()+" Holder: "+conta.getHolder()+" Balance: "+ String.format("%.2f", conta.getBalance()));
		
		System.out.println();
		System.out.println("Enter a withdraw value: ");
		amount = sc.nextDouble();
		conta.withdraw(amount);
		
		System.out.println();
		System.out.println("Account Data: ");
		System.out.println("Account "+conta.getNumber()+" Holder: "+conta.getHolder()+" Balance: "+ String.format("%.2f", conta.getBalance()));
		
		
		sc.close();
	}

}

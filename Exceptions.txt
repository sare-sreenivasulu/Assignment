1.import java.util.Scanner;

public class Arithmetic {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Numerator");
		int num = scanner.nextInt();
		System.out.println("Enter the denominator");
		int den = scanner.nextInt();
		try {
			int c=num/den;
			System.out.println("The output of divison is "+c);
		}
		catch(ArithmeticException e){
			System.out.println("Kindly don't provide the denominator value zero");
			
		}

	}

}


2.public class UnsupportedOperationExcepion extends Throwable {

	public String toString() {
		return "UnsupportedOperationExcepion";
	}
	

}


import java.util.Scanner;

public class Exception2 {

	public static void main(String[] args) throws UnsupportedOperationExcepion {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Numerator");
		int num = scanner.nextInt();
		System.out.println("Enter the denominator");
		int den = scanner.nextInt();
		if(den==0) {
			throw new UnsupportedOperationExcepion(); 
		}
		int c=num/den;
		System.out.println(c);

	}

}


3.public class IllegalBankTransactionException extends Throwable {
	public String toString() {
		return "IllegalBankTransactionException";
	}



}
public class InsufficientBalanceException extends Throwable {
	public String toString() {
		return "InsufficientBalanceException";
	}

}


import java.util.Scanner;

public class SavingsAccount {

	public static void main(String[] args) throws IllegalBankTransactionException,InsufficientBalanceException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your deposit");
		double deposit = scanner.nextDouble();
		double balance = deposit;
		balance+=deposit;
		System.out.println("Enter your withdraw Amount");
		double withdraw = scanner.nextDouble();
		withdraw( withdraw,balance);
		

	}

	private static void withdraw(double withdraw, double balance) throws IllegalBankTransactionException,InsufficientBalanceException {
		if(withdraw <= balance && withdraw >0) {
			System.out.println("Hi Take your amount "+ balance );
			
		}
		else if(withdraw <0) {
			throw new IllegalBankTransactionException();
			
		}
		else if(withdraw > balance || withdraw ==0) {
			throw new InsufficientBalanceException ();
			
		}
		
	}

	

}

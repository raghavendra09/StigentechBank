package SavingsAccount;

import Customer.Customer;
import StandardBankAccount.StandardAccount;

public class Savings implements StandardAccount {
	private Customer C1;
	int amount=0;

	
	public void accountCreation(Customer C) {
		C1=C;
		
	}

	@Override
	public void customerDetails() {
		System.out.println(C1.getAccountNumber());
		System.out.println(C1.getFirstName());
		System.out.println(C1.getLastName());
		System.out.println(C1.getAge());
		System.out.println(C1.getGender());
		System.out.println(C1.getAddress());
		System.out.println(C1.getContactNumber());
	}

	@Override
	public void deposit() {
		System.out.println(C1.getDeposit());
		amount=amount+(C1.getDeposit());
	}

	@Override
	public void withdraw() {
		System.out.println(C1.getWithdraw());
		amount=amount-(C1.getWithdraw());
	}

	@Override
	public void balanceEnquiry() {
		System.out.println("Your Account Balance is: "+amount);
	}

}

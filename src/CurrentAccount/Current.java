package CurrentAccount;

import Customer.Customer;
import StandardBankAccount.StandardAccount;

public class Current implements StandardAccount {
	private Customer C2;
	int amount=0;

	@Override
	public void accountCreation(Customer C) {
		C2=C;
	}

	@Override
	public void customerDetails() {
		System.out.println(C2.getAccountNumber());
		System.out.println(C2.getFirstName());
		System.out.println(C2.getLastName());
		System.out.println(C2.getAge());
		System.out.println(C2.getGender());
		System.out.println(C2.getAddress());
		System.out.println(C2.getContactNumber());
		
	}

	@Override
	public void deposit() {
		System.out.println(C2.getDeposit());
		amount=amount+(C2.getDeposit());
	}

	@Override
	public void withdraw() {
		System.out.println(C2.getWithdraw());
		amount=amount-(C2.getWithdraw());
	}

	@Override
	public void balanceEnquiry() {
		System.out.println("Your Account Balance is: "+amount);
	}

	}

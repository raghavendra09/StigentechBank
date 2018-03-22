package DematAccount;

import Customer.Customer;
import DematMethods.DematMethods;

public class Demat implements DematMethods {
	private Customer C3;
	@Override
	public void accountCreation(Customer C) {
		C3=C;
	}

	@Override
	public void customerDetails() {
		System.out.println(C3.getAccountNumber());
		System.out.println(C3.getFirstName());
		System.out.println(C3.getLastName());
		System.out.println(C3.getAge());
		System.out.println(C3.getGender());
		System.out.println(C3.getAddress());
		System.out.println(C3.getContactNumber());
	}

	@Override
	public void purchaseOfShare() {
		System.out.println("You have purchased the share of Dell");
	}

	@Override
	public void sellingOfShare() {
		System.out.println("You have sold the share of Wipro");

	}

	
}
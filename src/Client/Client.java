package Client;


import Customer.Customer;
import DematAccount.Demat;
import DematMethods.DematMethods;
import SavingsAccount.Savings;
import CurrentAccount.Current;
import StandardBankAccount.StandardAccount;

public class Client {

	public static void main(String[] args) {
		StandardAccount s=new Savings();
		Customer c=new Customer(1,"Anudeep","Challa",24,"Male","Hyd",9700489109L,50000,1000);
		s.accountCreation(c);
		s.customerDetails();
		s.deposit();
		s.withdraw();
		s.balanceEnquiry();
		
		StandardAccount cu=new Current();
		Customer c1=new Customer(2,"Kranthi","Gurram",24,"Male","Hyd",9700123459L,50000,3000);
		cu.accountCreation(c1);
		cu.customerDetails();
		cu.deposit();
		cu.withdraw();
		cu.balanceEnquiry();
		

		DematMethods dm=new Demat();
		Customer c2=new Customer(3,"Raghavendra","Tirunagari",24,"Male","Hyd",9702223459L,0,0);
		dm.accountCreation(c2);
		dm.customerDetails();
		dm.purchaseOfShare();
		dm.sellingOfShare();
		
	}

}

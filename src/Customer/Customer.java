package Customer;

public class Customer {
	private int accountNumber, age, deposit, withdraw;
	private long contactNumber;
	private String firstName, lastName, address, gender;
	public Customer(int accno, String fname, String lname, int age, String gender,String addr,long cnumber,int depst,int withdrw)
	{
		setAccountNumber(accno);
		setFirstName(fname);
		setLastName(lname);
		setAge(age);
		setGender(gender);
		setAddress(addr);
		setContactNumber(cnumber);
		setDeposit(depst);
		setWithdraw(withdrw);
		
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getDeposit() {
		return deposit;
	}
	public void setDeposit(int deposit) {
		this.deposit = deposit;
	}
	public int getWithdraw() {
		return withdraw;
	}
	public void setWithdraw(int withdraw) {
		this.withdraw = withdraw;
	}
	public long getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
}

package StandardBankAccount;

import StigentechBank.StigentechBank;

public interface StandardAccount extends StigentechBank {
	public void deposit();
	public void withdraw();
	public void balanceEnquiry();
}


public class BankAccount {

	private String accountNumber;
	private double balance;
	private String name;
	private String email;
	private String phoneNumber;

	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	private String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public void depositFunds (double depositAmount) {
		balance += depositAmount;
	}
	
	public void withdraw (double withdrawAmount) {
		if (balance - withdrawAmount < 0) {
			System.out.println("Only "+this.balance+" is available. Withdrawal can not be processed");
		} else {
			this.balance -= withdrawAmount;
			System.out.println("Withdrawal of  "+withdrawAmount+" is processed. Remaining balance is "+this.balance);
		}
		
	}
	
	
}

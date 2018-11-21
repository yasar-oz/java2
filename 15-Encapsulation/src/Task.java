
public class Task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount customer1 = new BankAccount();
		customer1.setAccountNumber("55555");
		customer1.setBalance(2.5);
		customer1.setName("Mike");
		customer1.withdraw(100.0);
		customer1.depositFunds(150.0);
		customer1.withdraw(50.0);
		
		
		System.out.println(customer1.getName());
		System.out.println(customer1.getAccountNumber());
		System.out.println(customer1.getBalance());
	
	}

}



/*

1. If there exists one with no parameters, run the constructor
2. Find Class
3. Find Constructor 
4. If there isn't any, run default constructor


*/
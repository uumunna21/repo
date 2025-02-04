package Session9_;

public class StaticDemo {

	public static void main(String[] args) {
		
		BankAccount b1=new BankAccount();
		System.out.println(BankAccount.getnumOfAccounts());
		
		BankAccount b2=new BankAccount(b1);
		System.out.println(BankAccount.getnumOfAccounts());
		
		BankAccount b3=new BankAccount("Amina", "10/3/24", 1000);
		System.out.println(BankAccount.getnumOfAccounts());
	
	

		
		
		
	}

}

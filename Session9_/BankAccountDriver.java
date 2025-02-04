package Session9_;

public class BankAccountDriver {

	public static void main(String[] args) {
	
		BankAccount b1=new BankAccount();
		
		//instead of printing out like this
//		System.out.println("Name"+b1.getName());
//		System.out.println("Date"+b1.getDate());
//		System.out.println("Balance"+b1.getBalance());
		
		//We can call the toString
		
		System.out.println(b1.toString());
		System.out.println(b1);// this will usually print address but in this case it will print fine if you have toString method in the class 
								//if we comment out the toString method it will print out address
		
		
		
		BankAccount b2=new BankAccount(b1); //this how we use the copy constructor
		System.out.println(b2);
		
		BankAccount b3=new BankAccount("Amina", "10/3/24", 1000);
		System.out.println(b3);
		
		b3.Deposit(100);
		System.out.println(b3.getBalance());
		System.out.println(b3); //this will also work because of the toShtring()
		
		b3.Withdraw(200);
		System.out.println(b3.Withdraw(200));
		System.out.println(b3);
		
		System.out.println(b3.Withdraw(1000));
		System.out.println(b3);
		
	}

}

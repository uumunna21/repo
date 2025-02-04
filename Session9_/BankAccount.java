package Session9_;

public class BankAccount {
/**
 * Create a class Bank Account with the following members:
 * name,date, balance
 * NoArg Constructor, Copy Constructor, Parameterized Constructor
 * Accessors, Mutators
 * Method Deposit that does not return anything and it takes an argument amount and increases the balance
 * A Method named withdraw that does not return anything
 * and it takes an argument amount and deducts from the balance
 * the amount if possible.
 * A method named validNameLength that checks the length of the 
 * account name and if it is more than 10, it will return false and overrides the name to the 
 * first 10 characters of the original name. Otherwise it does nothing and return true. 
 */
	
	private String name;
	private String date;
	private double balance;
	private static int numOfAccounts;
	
	
	//No arg constructor
	public BankAccount()
	{
		name="No name";
		date="00/00/00";
		balance=0.00;
		numOfAccounts++;
		
	}
	
	//Copy Constructor
	public BankAccount(BankAccount a )
	{
		name=a.name;
		date=a.date;
		balance=a.balance;
		validNameLength();
		numOfAccounts++;
	}
	
	public static void setnumOfAccounts(int n)
	{
		
		numOfAccounts=n;
		
		
	}
	
	public static int getnumOfAccounts()
	{
		return numOfAccounts;
	}
	
	
	
	//Parameterized Constructor
	public BankAccount(String name, String date, double balance)
	{
		this.name=name;
		this.date=date;
		this.balance=balance;
		this.validNameLength();
		numOfAccounts++;
	}
	
	
	
	public void setName(String name)
	{
		this.name=name; //name=this.name is wrong
	}
	
	public String getName()
	{
		return name;
	}
	
	
	public void setDate(String date)
	{
		this.date=date; 
	}
	
	public String getDate()
	{
		return date;
	}
	
	
	public void setBalance(double balance)
	{
		this.balance=balance; 
	}
	
	public double getBalance()
	{
		return balance;
	}
	
	
	
	public void Deposit (double amount)
	{
		if(amount<=3000)
			balance+=amount;
		
	}
	
	public boolean Withdraw(double amount)
	{
		if(amount<=balance)
		{	
			balance-=amount;
			return true;
		}
		
			return false;
		
		
	}
	
	
	public boolean validNameLength()
	{
		if(name.length() > 10)
		{
			name=name.substring(0,10);
			return false;
		}
		
		return true;
		
	}
	
	/**Create a method name toString that deesn't take any pram 
	 * and returns a string variable that contains the infor of the Bank Account
	 */
	
	
	public String toString()// toString should not get any input and any parameters
	{
		return this.name+ " "+this.date + " "+ this.balance;
	}
	
	
	
	
	
	
	
	
}

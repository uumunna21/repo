package Session9;

public class BankAccount 
{
	String name;
	String date;
	double cb;
	
	public BankAccount()
	{
		name = "noName";
		date = "00/00/00";
		cb = 0;
	}
	public BankAccount(BankAccount s)
	{
		name = s.name;
		date = s.date;
		cb = s.cb;
	}
	public BankAccount(String n, String d, double c)
	{
		name = n;
		date = d;
		cb = c;
	}
	public BankAccount(String string) {
		// TODO Auto-generated constructor stub
	}
	public String getName()
	{
		return name;
	}
	public String getDate()
	{
		return date;
	}
	public double getCb()
	{
		return cb;
	}
	public void setName(String n)
	{
		name = n;
	}
	public void setDate(String d)
	{
		date = d;
	}
	public void setCb(double c)
	{
		cb = c;
	}
	public void deposit(double u)
	{
		cb += u;
	}
	public boolean withdraw(double u)
	{
		if (u <= cb)
		{
			cb -= u;
			return true;
		}
		else
			return false;
	}
	public boolean checkName()
	{
		if(name.length() <= 10)
		{
			return true;
		}
		else if(name > 10)
		{
			name = name.substring(0,10);
			return false;
			
		}
		else if (name.isEmpty())
		{
			name = "NoName";
			return false;
		}
	}
	public string toString()
	{
		return name + " " + balance + " " + date;
	}
}

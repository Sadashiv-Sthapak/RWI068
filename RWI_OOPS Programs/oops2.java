//Encapsulation
class BankAccount
{
	private String accountNumber;
	private double balance;
	
	public BankAccount(String accountNumber, double initialBalance)
	{
		this.accountNumber=accountNumber;
		this.balance=initialBalance;
	}
	
	public void deposit(double amount)
	{
		if(amount>0)
		{
			balance+=amount;
			System.out.println(amount+"deposit successfully.");
		}
	}
	
	public void withdrawn(double amount)
	{
		if(amount>0 && amount<=balance)
		{
			balance-=amount;
		}
		else
		{
			System.out.println("insufficient balance");	
		}
	}
	
	public double getBalance()
	{
		return balance;
	}
}

public class oops2
{
	public static void main (String args[])
	{
		BankAccount account=new BankAccount("123456789",1000);
		
		account.deposit(700);
		account.withdrawn(400);
		
		System.out.println("Current Balance"+account.getBalance());
	}
}
package java_package;

public class BankSystem {

	BankSystem(String username,String password)
	{
		System.out.println(username + " "+password);
	}
	
	int acct=3000;
	void deposit(int dep)
	{
		 acct= acct+dep;
		System.out.println("The amount after ddeposit" +acct);
	}
	
	void withdraw(int wt)
	{

		acct=acct-wt;
		System.out.println("The amount after withdraw"+acct);
	}
	
	int display()
	{
		return acct;
		
	}
	
	public static void main(String[] args) {
		// Create a object
		
		BankSystem obj= new BankSystem("ayhur12","122535");
		obj.deposit(1000);
		obj.withdraw(500);
		System.out.println(obj.display());

	}

	
}

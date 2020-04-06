import java.util.*;
public class Account {

	String user;
	String pass;
	String strength = "Weak";
	int checkings = 500;
	int savings = 500;
	
	
	//for testing 
	public Account()
	{
		createAcc();
	}
	
	public void chkPass(String P) {
		boolean hasUP= false;
		boolean hasLO= false;
		boolean hasNUM = false;
	
		if(P.matches(".*[A-Z].*")){
				hasUP = true;
		}
		if(P.matches(".*[a-z].*")){
			hasLO = true;
		}
		if(P.matches(".*[0-9].*")){
			hasNUM = true;
		}
		if(hasUP && hasLO && hasNUM && P.length() >= 8)
		{
			strength = "Strong";
		}
		else
		{
			strength = "Weak";
			System.out.println("Password is too weak");
		}
		
	}
			
	public void displayPass()
	{
		System.out.println(pass);
		System.out.println(strength);
	}
	
	public void displayUser()
	{
		System.out.println(user);
	}
	
	public void displayCheckings()
	{
		System.out.println("Your current checkings balance is: " + checkings);
	}
	public void displaySavings()
	{
		System.out.println("Your current savings balance is: " + savings);
	}
	
	public void createAcc() {

		Scanner s = new Scanner(System.in);
		System.out.print("Username: ");
		user = s.nextLine();
		System.out.print("Password: ");
		while(strength =="Weak") {
			pass = s.nextLine();
			chkPass(pass);

		}
	//	s.close();
	}
	


	public void makeDeposit() {
		int o = 0;
		Scanner l = new Scanner(System.in);
		System.out.println("Select Account:");
		System.out.println("1. Checkings");
		System.out.println("2. Savings");
		o = l.nextInt();
		if(o == 1)
		{
			System.out.print("How much do you want to deposit: ");
			checkings = l.nextInt();
		}
		else if (o == 2)
		{
			System.out.print("How much do you want to deposit: ");
			savings = l.nextInt();
		}
		//l.close();
		System.out.println("Thank You!");
		
		
	}
	public void makeWithdrawal() {
		int w;
		int o = 0;
		Scanner p = new Scanner(System.in);
		System.out.println("Select Account:");
		System.out.println("1. Checkings");
		System.out.println("2. Savings");
		o = p.nextInt();
		if(o == 1)
		{
			System.out.print("How much do you want to withdraw: ");
			w = p.nextInt();
			if(w > checkings) {
				System.out.println("you are withdrawing too much");
			}
			else
			{
				checkings = checkings - w;
			}
		}
		else if (o == 2)
		{
			System.out.print("How much do you want to withdraw: ");
			w = p.nextInt();
			if(w > savings) {
				System.out.println("you are withdrawing too much");
			}
			else
			{
				checkings = checkings - w;
			}
		}
	//	p.close();
		System.out.println("Thank You!");
	}
	public void makeTransfer() {
		int a = 0;
		int o = 0;
		Scanner t = new Scanner(System.in);
		System.out.println("Select Transfer:");
		System.out.println("1. Checkings -> Savings");
		System.out.println("2. Savings -> Checkings");
		o = t.nextInt();
		if(o == 1)
		{
			System.out.print("How much do you want to transfer: ");
			a = t.nextInt();
			if(checkings < a) {
				System.out.println("Amount is too large.");
			}
			else {
				checkings = checkings - a;
				savings = savings + a;
			}
		}
		else if (o == 2)
		{
			System.out.print("How much do you want to transfer: ");
			a = t.nextInt();
			if(savings < a) {
				System.out.println("Amount is too large.");
			}
			else
			{
			savings = savings - a;
			checkings = checkings + a;
			}

		}
		System.out.println("Thank You!");
	}

}


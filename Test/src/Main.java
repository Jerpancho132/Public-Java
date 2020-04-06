import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a = new Account();
		Scanner k = new Scanner(System.in);
		
		int opt = 0;
		while(true)
		{
			System.out.println("Select option");
			System.out.println("1. Display checkings");
			System.out.println("2. Display savings");
			System.out.println("3. Make a deposit");
			System.out.println("4. Make a withdrawal");
			System.out.println("5. Transfer funds");
			System.out.println("6. Done");
			
			opt = k.nextInt();
			
			if(opt == 1)
			{
				a.displayCheckings();
			}
			else if(opt == 2) {
				a.displaySavings();
			}
			else if(opt == 3) {
				a.makeDeposit();
			}
			else if(opt == 4) {
				a.makeWithdrawal();
			}
			else if(opt == 5) {
				a.makeTransfer();
			}
			else if(opt == 6)
			{
				break;
			
			}
	
		}	
		k.close();
		
	}

}

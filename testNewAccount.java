/*U10316035
 *Lin Tz Hau
 */
 
 //test program
 
public class testNewAccount{
  //main method
	public static void main(String[] args){
		//create a default account object
		Account defaultAccount = new Account(); 
		//create an account object of 11.8
		Account testAccount = new Account(1122,1000,"George"); 
		//set Interest Rate of 11.8
		testAccount.setAnnualInterestRate(1.5);
		//deposit $30
		testAccount.deposit(30);
		//deposit $40
		testAccount.deposit(40);
		//deposit $50
		testAccount.deposit(50);
		//withdraw $5
		testAccount.withdraw(5);
		//withdraw $4
		testAccount.withdraw(4);
		//withdraw $2
		testAccount.withdraw(2);
		/*print account summary that shows account holder name,interest rate,balance,
		 *and all transactions
		 */
		System.out.println("Account summary----------------");
		System.out.print("Name : " + testAccount.getName() + "\n" +
							"Interest Rate : " + testAccount.getAnnualInterestRate() + "%\n" +
								"Balance : $" + testAccount.getBalance() + "\n" + 
									"Transactions : \n" );
		for(int i = 0; i <= testAccount.transactions.size()-1 ;i++){						
			System.out.println(((Transaction)testAccount.transactions.get(i)).getDescription());
		}
	}
}

//the Transaction class
public class Transaction{
	//date of this transaction
	private java.util.Date date;
	//type of this transaction
	private char type;
	//amount of this transaction
	private double amount;
	//new balance after this transaction
	private double balance;
	//description of this transaction
	private String description;
	//constructor to construct a Transaction with specified date,type,balance,and description
	public Transaction(char type,double amount,double balance, String description){
		this.type = type;
		this.amount = amount;
		this.balance = balance;
		this.description = description;
	}
	/**set methods of data fields*/
	public void setType(char newType){
		type = newType;
	}
	public void setAmount(double newAmount){
		amount = newAmount;
	}
	public void setBalance(double newBalance){
		balance = newBalance;
	}
	public void setDescription(String newDescription){
		description = newDescription;
	}
	/**get methods of data fields*/
	public char getType(){
		return type;
	}
	public double getAmount(){
		return amount;
	}
	public double getBalance(){
		return balance;
	}
	public String getDescription(){
		return description;
	}
}

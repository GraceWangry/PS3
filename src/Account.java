
import java.util.Date;

public class Account {
	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated;
	
	
	public Account(){
	}
	
	public Account(int id,double balance){
		
		this.id = id;
		
		this.balance = balance;
	}
	
	public Account(int id, double balance, double annualInterestRate) {
		
		this.id = id;
		
		this.balance = balance;
		
		this.annualInterestRate = annualInterestRate;
	}

	
	public int getid(){
		
		return id;
	}
	public double getBalance(){
		
		return balance;
	}
	public double getannualInterestRate(){
		
		return annualInterestRate;
	}
	
	public void setId(int id){
		
		this.id = id;
	}
	
	public void setBalance(double balance){
		
		this.balance = balance;
	}
	
	public void setInterestRate(double annualInterestRate){
		
		this.annualInterestRate = annualInterestRate;
	}
	
	public Date getDateCreated(){
		
		return dateCreated;
	}
	
	public double getMonthlyInterestRate(){
		
		return (annualInterestRate/12);
	}
	
	public void withdraw(double amount)throws InsufficientFundsException
	{
		if(balance - amount < 0)
			throw new InsufficientFundsException(balance - amount);
		
		else
			
			balance -= amount;
			
		}
	
	public void deposit(double amount){
		balance += amount;
	}
} 

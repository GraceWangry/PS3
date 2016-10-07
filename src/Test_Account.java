import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class Test_Account {
	static Account testAccount;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		testAccount= new Account(1111,2222);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		testAccount= null;
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		testAccount.setInterestRate(2.3);
		
		try{
			testAccount.withdraw(2400);
		} catch(InsufficientFundsException e){
			System.out.println("You cann't withdraw.Your balance is "+e.getAmount());
		}
		
		testAccount.deposit(4444);
		System.out.println("Your balance is:"+testAccount.getBalance()+
				" The monthly interest is"+testAccount.getMonthlyInterestRate()+
				" The account was created in:"+
				testAccount.getDateCreated());
	}

}
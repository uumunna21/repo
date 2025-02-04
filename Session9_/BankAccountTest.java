package Session9_;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BankAccountTest {
	private BankAccount b1,b2,b3;
	@BeforeEach
	void setUp() throws Exception {
		 b1=new BankAccount();
	     b2= new BankAccount(b1);
	     b3= new BankAccount("Amina","10/03/2024",1000);
	}

	//setup>test>teardown
	@AfterEach
	void tearDown() throws Exception {
		b1=b2=b3=null;
	}

	
	@Test
	void testValidNameLength()
	{
			
			assertEquals(true, b3.validNameLength());
			assertEquals(true, b1.validNameLength());
			assertTrue(b3.validNameLength()); //checkin the boolen method's truthfulneses
			
	}
	
	
	@Test
	void testDeposit()  {
	//	assertEquals(0,b1.getBalance());
		b2.Deposit(5000);
		assertEquals(0,b2.getBalance());
		b3.Deposit(100);
		assertTrue(b3.getBalance()==1100);
		b3.Deposit(4000);
		assertEquals(1100, b3.getBalance());
		
	}
	
	@Test
	void testWithdraw() 
	{
		
		b3.Withdraw(500);
		assertTrue(b3.getBalance()==500);
		b3.Withdraw(600);
		assertTrue(b3.getBalance()==500);
		assertFalse(b3.Withdraw(600));
		
	}
	
	@Test
	void testGetName() {
		assertEquals("No name",b1.getName());  //first parameter is what expected and theh 2nd one is comparing
		assertEquals(b1.getName(),b2.getName());
		assertEquals("Amina",b3.getName());
	}
	

//	@Test
//	void testDeposit()  {
//		assertEquals(0,b1.getBalance());
//		b1.Deposit(100);
//		assertEquals(100,b1.getBalance());

		
	//}
}

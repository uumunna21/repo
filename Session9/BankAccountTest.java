package Session9;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BankAccountTest {
	private BankAccount davidsbank, test;

	@BeforeEach
	void setUp() throws Exception {
		davidsbank = new BankAccount("david", "10/02/24/", 100);
		test = new BankAccount(davidsbank);

	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testGetName() {
		assertEquals("david", davidsbank.getName());
		assertEquals(davidsbank.getName(), test.getName());

	}
	@Test
	void testSetName() {
		
	}
	

}

package package1;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CryptoManagerTestStudent {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testIsStringInBounds() {
		assertTrue(CryptoManager.isStringInBounds("BOY"));
		assertTrue(CryptoManager.isStringInBounds("\"BOY IS TALL\""));
		assertFalse(CryptoManager.isStringInBounds("boy"));
		assertFalse(CryptoManager.isStringInBounds("{BOY"));
		assertFalse(CryptoManager.isStringInBounds("\"THIS TEST THAT SHOULD FAIL BECAUSE { IS OUTSIDE THE RANGE\""));
	}

	@Test
	void testCaesarEncryption() {
		assertEquals("The selected string is not in bounds, Try again.", CryptoManager.caesarEncryption("bye", 3));
		assertEquals("GHI", CryptoManager.caesarEncryption("DEF", 3));
		assertEquals("FGH", CryptoManager.caesarEncryption("ABC", 5));
		assertEquals("1.558", CryptoManager.caesarEncryption("HELLO", 105));
		assertEquals("KPHQTO", CryptoManager.caesarEncryption("INFORM", 2));
		assertEquals("XLMW$MW$E$XIWX", CryptoManager.caesarEncryption("THIS IS A TEST", 4));
	}

	@Test
	void testBellasoEncryption() {
		fail("Not yet implemented");
	}

	@Test
	void testCaesarDecryption() {
		fail("Not yet implemented");
	}

	@Test
	void testBellasoDecryption() {
		fail("Not yet implemented");
	}

	@Test
	void testMain() {
		fail("Not yet implemented");
	}

}

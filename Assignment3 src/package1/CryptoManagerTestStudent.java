/*
 * Class: CMSC203 
 * Instructor: Khandan Monshi 
 * Description: (Give a brief description for each Class)
 * Due: 10/21/2024 
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming  assignment independently. 
*  I have not copied the code from a student or any source. 
*  I have not given my code to any student.
*  Print your Name here: Ugonna Umunna Nnaemeka 
*/

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
		assertEquals("KPHQTO", CryptoManager.caesarEncryption("INFORM", 2));
		assertEquals("XLMW$MW$E$XIWX", CryptoManager.caesarEncryption("THIS IS A TEST", 4));
	}

	@Test
	void testBellasoEncryption() {
		assertEquals("UB_H", CryptoManager.bellasoEncryption("RAKE", "CAT"));
		assertEquals("TWQ]J", CryptoManager.bellasoEncryption("BRAKE", "REP"));
		assertEquals("HFPVM", CryptoManager.bellasoEncryption("FAITH", "BEG"));
	}

	@Test
	void testCaesarDecryption() {
		assertEquals("DEF", CryptoManager.caesarDecryption("GHI", 3));
		assertEquals("HELLO NICE TO MEET YOU", CryptoManager.caesarDecryption("NKRRU&TOIK&ZU&SKKZ&_U[", 6));
		assertEquals("I NEED TO CODE", CryptoManager.caesarDecryption("N%SJJI%YT%HTIJ", 5));
	}

	@Test
	void testBellasoDecryption() {
		assertEquals("COME DOWN", CryptoManager.bellasoDecryption("DQPF\"GPYQ", "ABC"));
		assertEquals("HAPPY BIRTHDAY", CryptoManager.bellasoDecryption("KCQS[!EKSWJED[", "CBA"));
		assertEquals("FAITH", CryptoManager.bellasoDecryption("HFPVM", "BEG"));

	}

	@Test
	void testMain() {
		
	}

}

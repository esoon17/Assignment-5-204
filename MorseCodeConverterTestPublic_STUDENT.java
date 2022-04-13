/*
 * Name: Esther Soon
 * Class: CMSC 204-38176
 * Instructor: Farnaz Eivazi
 * Date: 4/12/2022
*/
 /**@author Esther Soon*/

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import java.io.File;
import java.io.FileNotFoundException;
import org.junit.Test;

public class MorseCodeConverterTestPublic_STUDENT {

	@Test
	public void testConvertToEnglishString() {	
		String converter1 = MorseCodeConverter.convertToEnglish("-... -.-- . / -... -.-- . / .-- --- .-. .-.. -..");
		assertEquals("bye bye world",converter1);
	}
	
	/**
	 * Testing for correct implementation of tree and traversal
	 */
	@Test
	public void testPrintTree() {	
		assertEquals("h s v i f u e l r a p w j  b d x n c k y t z g q m o", MorseCodeConverter.printTree());
	}
	
	/**
	 * Testing for correct conversion of all characters using key phrase to hit all letters
	 */
	@Test
	public void testConvertMorseStringToEnglishString() {	
		String converter1 = MorseCodeConverter.convertToEnglish("- .... . / ..-. .. ...- . / -... --- -..- .. -. --. / .-- .. --.. .- .-. -.. ... / .--- ..- -- .--. / --.- ..- .. -.-. -.- .-.. -.--");
		assertEquals("the five boxing wizards jump quickly", converter1);
	}
	
	@Test
	public void testConvertMorseFileToEnglishString() {	
		/*Make sure TestPhrase.txt is in the src directory for this 
		  test to pass
		*/
		File file = new File("src/TestPhrase.txt"); 
		try {
			assertEquals("i didnt fall down i did attack the floor though", MorseCodeConverter.convertToEnglish(file));
		} catch (FileNotFoundException e) {
			assertTrue("An unwanted exception was caught", false);
		}
	}
}

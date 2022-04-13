/*
 * Name: Esther Soon
 * Class: CMSC 204-38176
 * Instructor: Farnaz Eivazi
 * Date: 4/12/2022
*/
 /**@author Esther Soon*/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class MorseCodeConverter {
	
	private static MorseCodeTree tree = new MorseCodeTree();
	
	public MorseCodeConverter() {
	}
	
	/**
	 * Returns a string with all the data in the tree in LNR order with an space in between them
	 * @return the data in the tree in LNR order separated by a space.
	 */
	public static String printTree() {
		ArrayList<String> arrayTree = tree.toArrayList();
		String printOut = "";
		for (int i = 0; i<arrayTree.size(); i++) {
			printOut += arrayTree.get(i) + " ";
		}
		return printOut.trim();
	}
	/**
	 * Converts Morse code into English. Each letter is delimited by a space (‘ ‘). Each word is delimited by a ‘/’.
	 * @param code - the morse code
	 * @return the English translation
	 */
	public static String convertToEnglish(String code) {
		String[] word = code.split(" / ");
		String decrypted = "";
		String[] letter;

		for (String eachWord : word) {
			letter = eachWord.split(" ");	
			for (String eachLetter: letter) {
				decrypted += tree.fetch(eachLetter);
			}
			decrypted += " ";
		}
		return decrypted.trim();
	}
	/**
	 * Converts a file of Morse code into English Each letter is delimited by a space (‘ ‘). Each word is delimited by a ‘/’.
	 * @param codeFile - name of the File that contains Morse Code
	 * @return the English translation of the file
	 * @throws FileNotFoundException
	 */
	public static String convertToEnglish(File codeFile) throws FileNotFoundException{
		Scanner s = new Scanner(codeFile);
		String converted = convertToEnglish(s.nextLine());
		s.close();
		return converted;
	}
	
	
	
}

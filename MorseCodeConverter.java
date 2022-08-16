package abc;

/**MorseCodeConverter class
 * 
 * @author Jonas da Silva
 *
 */

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class MorseCodeConverter {
	
	private static MorseCodeTree tree = new MorseCodeTree();
	
	public MorseCodeConverter() {}
	
	/**
	 * returns string with all data in LNR order
	 * @return reference to root
	 */
	public static String printTree() {
		String str = "";
		ArrayList<String> treeArray = tree.toArrayList();
		for(int i = 0; i < treeArray.size(); i++) {
			str += treeArray.get(i);
			str += " ";
		}
		return str;
	}
	

	/**
	 * converts from morse code to english
	 * @param code to be converted
	 * @return reference to root
	 */
	 public static String convertToEnglish​(String code) {
		String str = "";
		String[] wordArray = code.split(" / ");
		
		for(int i = 0; i < wordArray.length; i++) {
			String[] letterArray = wordArray[i].split(" ");
			for(int j = 0; j < letterArray.length; j++) {
				str += tree.fetch(letterArray[j]);
			}
			str += " ";
	}
		return str.trim();
}
	
	 /**
		 * converts morse code from file to english
		 * @param file to be converted
		 * @return reference to root
		 */
	public static String convertToEnglish​(File codeFile) throws FileNotFoundException{
		String code = "";
		String str = "";
		Scanner sc = new Scanner(codeFile);
		while(sc.hasNextLine()) {
			code += sc.nextLine();
			code += " ";
		}
		code.trim();
		sc.close();
		String[] wordArray = code.split(" / ");
		
		for(int i = 0; i < wordArray.length; i++) {
			String[] letterArray = wordArray[i].split(" ");
			for(int j = 0; j < letterArray.length; j++) {
				str += tree.fetch(letterArray[j]);
			}
			str += " ";
	}
		return str.trim();
	}
	
}

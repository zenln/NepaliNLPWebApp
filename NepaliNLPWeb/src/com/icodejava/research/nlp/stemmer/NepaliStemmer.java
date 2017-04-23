package com.icodejava.research.nlp.stemmer;

import com.icodejava.research.nlp.domain.CompoundWordEnding;
import com.icodejava.research.nlp.domain.Grammar;

/**
 * 
 * @author Kushal Paudyal www.sanjaal.com | www.inepal.org | www.icodejava.com
 * 
 *         Stemmer Class for Nepali Word
 * 
 *         Stemming is a process of finding the root word from a compound word.
 *         e.g. "स्थानलगायत" is stemmed to "स्थान"
 *
 */
public class NepaliStemmer {
	
	public static void main(String [] args) {
		getNepaliRootWord("समयभन्दा");
	}

	/**
	 * This method finds a root word for a given compound Nepali Word. 
	 * For example: "स्थानलगायत" is stemmed to "स्थान"
	 * 
	 * @param compoundWord
	 * @return root word
	 */
	public static String getNepaliRootWord(String compoundWord) {
		for (CompoundWordEnding dir : CompoundWordEnding.values()) {
			String cwe = dir.getNepaliWordEnding();

			if (compoundWord.endsWith(cwe) && isNotTheSameWord(compoundWord, cwe) && isAllowedLength(compoundWord, cwe)) {
				compoundWord = compoundWord.replaceAll(cwe, "");
			}

		}

		compoundWord = compoundWord.trim();

		return compoundWord;
	}

	private static boolean isNotTheSameWord(String compoundWord, String cwe) {
		return compoundWord.length() > cwe.length();
	}

	private static boolean isAllowedLength(String compoundWord, String cwe) {
		
		boolean allowed = true;
		
		String cweMatraReplaced = replaceMatras(cwe);
		
		if(cweMatraReplaced.length() == 1) {
			String matraReplacedWord = replaceMatras(compoundWord.replaceAll(cwe, "")); //TODO: Document this
			allowed = matraReplacedWord.length() > 2; //to prvent words like थुम्का being split as थुम् + का
			
		}
		
		return allowed;
	}

	/**
	 * This method takes a Nepali Word, repalces all the matras and returns the
	 * transformed word. e.g. ट्रान्सफर --> टरनसफर
	 * 
	 * @param word
	 * @return
	 */
	public static String replaceMatras(String word) {

		for (Character c : Grammar.SET_OF_MATRAS.toCharArray()) {
			word = word.replace(c + "", "");
		}

		return word;
	}

}
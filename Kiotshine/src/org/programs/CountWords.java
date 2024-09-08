package org.programs;

public class CountWords {
	public static void main(String[] args) {
		String sentence = "Welcome to Aspire Systems";
	
	int WordCount = 0;
	for(int i=0; i<sentence.length()-1; i++) {
		if(sentence.charAt(i) == ' ' && Character.isLetter(sentence.charAt(i+1)) 
				&& (i > 0)) {  
            WordCount++;
	}
	}
	WordCount++;
	System.out.println("Number of the words in the String:"+WordCount);
	}
}
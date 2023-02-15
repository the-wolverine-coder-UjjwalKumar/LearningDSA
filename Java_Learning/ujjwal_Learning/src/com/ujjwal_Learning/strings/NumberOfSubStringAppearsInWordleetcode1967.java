package com.ujjwal_Learning.strings;

public class NumberOfSubStringAppearsInWordleetcode1967 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] patterns = {"a","abc","bc","d"};
		String word = "abc";
		
		System.out.println(numOfStrings(patterns, word));
	}
	
	public static int numOfStrings(String[] patterns, String word) {
        int counter = 0;
        for(String ss : patterns) {
        	if(word.contains(ss)) counter++;
        }
        
        return counter;
    }
	

}

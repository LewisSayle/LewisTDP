package com.qa.javaAssessment;

public class Assessment {

	// Given a string, return a string where
	// for every char in the original string,
	// there are three chars.

	// multChar("The") ==> "TTThhheee"
	// multChar("AAbb") ==> "AAAAAAbbbbbb"
	// multChar("Hi-There") ==> "HHHiii---TTThhheeerrreee"

	public String multChar(String input) {
		String word = "";
		for (int i = 0; i< input.length(); i++) {
			word += input.substring(i, i+1);
			word += input.substring(i, i+1);
			word += input.substring(i, i+1);
		}
		return word;
		
	}
	
	// Return the string (backwards) that is between the first and last appearance
	// of "bert"
	// in the given string, or return the empty string "" if there is not 2
	// occurances of "bert" - Ignore Case

	// getBert("bertclivebert") ==> "evilc"
	// getBert("xxbertfridgebertyy") ==> "egdirf"
	// getBert("xxBertfridgebERtyy") ==> "egdirf"
	// getBert("xxbertyy") ==> ""
	// getBert("xxbeRTyy") ==> ""

	public String getBert(String input) {
		
		if ((input.toLowerCase()).contains("bert"))
		{
		String word = "";
		
		while (!(input.substring(0,4).toLowerCase()).contains("bert"))
		    {input = input.substring(1,input.length());}
		    
		if ((input.substring(3,input.length()).toLowerCase()).contains("bert"))
		{
		for (int i = input.length()-1;i>=0;i--)
			{word += input.substring(i, i+1);}
			
		while (!(word.substring(0,4).toLowerCase()).contains("treb"))
		{word = word.substring(1,word.length());}
	
		return word.substring(4,word.length()-4);}
		else{return "";}}
	else {return "";}}
		
	

	// Given three ints, a b c, one of them is small, one is medium and one is
	// large. Return true if the three values are evenly spaced, so the
	// difference between small and medium is the same as the difference between
	// medium and large. Do not assume the ints will come to you in a reasonable
	// order.

	// evenlySpaced(2, 4, 6) ==> true
	// evenlySpaced(4, 6, 2) ==> true
	// evenlySpaced(4, 6, 3) ==> false
	// evenlySpaced(4, 60, 9) ==> false

	public boolean evenlySpaced(int a, int b, int c) {
		int d = 0;
		int e = 0;
		int f = 0;
		f = Math.max(a, Math.max(b,c));
		d = Math.min(a, Math.min(b,c));
		e = Math.min(Math.max(a,b), Math.min(Math.max(b,c),Math.max(a,c)));
		if((d-(2*e)+f)==0)
		{return true;}
		else {return false;}
	}

	// Given a string and an int n, return a string that removes n letters from the 'middle' of the string.
	// The string length will be at least n, and be odd when the length of the input is odd.

	// nMid("Hello", 3) ==> "Ho"
	// nMid("Chocolate", 3) ==> "Choate"
	// nMid("Chocolate", 1) ==> "Choclate"

	public String nMid(String input, int a) {
		String word1 = "";
		String word2 = "";
		word1 = input.substring(0,(input.length()-a)/2);
		word2 = input.substring((input.length()-a)/2+a,input.length());
		return (word1+word2);
	}


	// Given a string, return the length of the largest "block" in the string.
	// A block is a run of adjacent chars that are the same.
	//
	// superBlock("hoopplla") ==> 2
	// superBlock("abbCCCddDDDeeEEE") ==> 3
	// superBlock("") ==> 0

	public int superBlock(String input) {
		String word = "";
		for (int i = 1; i< input.length(); i++) {
			if(input.substring(i,i+1).equals(input.substring(i-1,i)))
					{word = word + "a";}
			else {word = word + "b";}
		}
		word = word + "b";
		int temp = 0;
		int count = 0;
		
		for(int i = 0;i< word.length();i++) {
			if(word.substring(i,i+1).equals("a"))
			{temp++;}
			else {count = Math.max(count,temp);
			temp = 0;}
		}
		if(input.contentEquals(""))
		{return 0;}
		else {return(count+1);}
	}
	
	//given a string - return the number of times "am" appears in the String ignoring case -
	// BUT ONLY WHEN the word "am" appears without being followed or proceeded by other letters
	//
	//amISearch("Am I in Amsterdam") ==> 1
	//amISearch("I am in Amsterdam am I?") ==> 2
	//amISearch("I have been in Amsterdam") ==> 0

	public int amISearch(String input) {
		int count = 0;
			
		if((input.substring(0,3).toLowerCase()).equals("am "))
		  {count=count+1;}
		else {;}
			
		for (int i = 1; i< input.length()-3; i++) {
			if((input.substring(i,i+4).toLowerCase()).equals(" am "))
			{count=count+1;}
			else {;}
		}
				
			if((input.substring(input.length()-3,input.length()).toLowerCase()).equals(" am"))
			{count=count+1;}
			else {;}
			
		return count;
	}
	
	//given a number 
	// if this number is divisible by 3 return "fizz"
	// if this number is divisible by 5 return "buzz"
	// if this number is divisible by both 3  and 5return "fizzbuzz"
	//
	//fizzBuzz(3) ==> "fizz"
	//fizzBuzz(10) ==> "buzz"
	//fizzBuzz(15) ==> "fizzbuzz"
	
	public String fizzBuzz(int number) {
		if (number%15==0)
			{return "fizzbuzz";}
		else if (number%5==0)
		{return "buzz";}
		else if (number%3==0)
		{return "fizz";}
		else {return null;}
		
	}
	
	//Given a string split the string into the individual numbers present
	//then add each digit of each number to get a final value for each number
	// String example = "55 72 86"
	//
	// "55" will = the integer 10
	// "72" will = the integer 9
	// "86" will = the integer 14
	//
	// You then need to return the highest vale
	//
	//largest("55 72 86") ==> 14
	//largest("15 72 80 164") ==> 11
	//largest("555 72 86 45 10") ==> 15
	
	public static int largest(String input) {
		int temp = 0;
		int total = 0;
		
		for (int i = 0; i< input.length(); i++) {
		if(input.substring(i,i+1).equals(" "))
		{total = Math.max(temp,total);
		temp = 0;}
		else {temp = temp + Integer.valueOf(input.substring(i,i+1));}}
		total = Math.max(temp, total);
		return total;
	}
	
}
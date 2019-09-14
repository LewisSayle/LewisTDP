package com.qa.javaTest;

public class Lewistest {

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

	public static void main(String[] args) {
		System.out.println(largest("72 86"));
}
}
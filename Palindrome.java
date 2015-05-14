package com.swap.demo.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Palindrome {
	public static void main(String args[]){
		System.out.println("Palindrome number check");
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Please enter number:");
		try {
			int num = Integer.parseInt(bufferedReader.readLine());
			int ori = num;
			int rev = 0,rem;
			while(num > 0){
				rem = num % 10;
				rev = rev * 10 + rem;
				num = num / 10;
			}
			if(ori == rev)
				System.out.println("Number is Palindrome number");
			else
				System.out.println("Not a palindrome number");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

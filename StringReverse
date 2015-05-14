package com.swap.demo.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringReverse {
	public static void main(String args[]){
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please enter string to reverse");
		try {
			String string = bufferedReader.readLine();
			if(string != null && string.length() > 0){
				char[] allChars = string.toCharArray();
				StringBuilder revString = new StringBuilder();
				for (int i = allChars.length -1; i >= 0; i--) {
					revString.append(allChars[i]);
				}
				System.out.println("Reversed String is: "+revString.toString());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}	

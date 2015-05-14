package com.swap.demo.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Armstrong {
	public static void main(String args[]){
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			System.out.println("Enter start number");
			int oriStart = Integer.parseInt(bufferedReader.readLine());
			System.out.println("Enter end number");
			int oriEnd = Integer.parseInt(bufferedReader.readLine());
			int ori;
			for (int i = oriStart; i <= oriEnd; i++) {
				ori = i;
				int ori1 = ori;
				int rem,arm = 0;
				while(ori > 0){
					rem = i % 10;
					arm = arm + (rem * rem * rem);
					ori = ori / 10;
					if(ori1 == arm)
						System.out.println("Armstrong number: "+arm);
				}
				
			}
			
			
			
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

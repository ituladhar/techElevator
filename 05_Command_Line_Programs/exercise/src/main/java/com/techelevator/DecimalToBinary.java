package com.techelevator;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		//Print the message and get decimal Values from the user
		System.out.print("Enter in a series of decimal values (separated by spaces): ");
		String inputString = in.nextLine();
		System.out.println();

		// split string into array
		String [] values = inputString.split(" ");
		String [] outputBinary = new String[values.length];

		for(int i = 0; i < values.length; i++){
			 int resultBinary = (int) (Integer.parseInt(values[i]));
			System.out.println(values[i] + " in binary is " + Integer.toBinaryString(resultBinary));
		}

	}

}

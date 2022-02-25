package com.techelevator;

import java.util.Scanner;

public class LinearConvert {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double lengthInMeter;
		double lengthInFoot;

		//Print the msg to the user
		System.out.print("Please enter the length: ");
		String userInputData = in.nextLine();
		float lengthFromUserInput = Float.parseFloat(userInputData);
		System.out.println();

		//get Unit to measure the length
		System.out.print("Is the measurement in (m)eter, or (f)eet?");
		String userInputLengthUnit = in.nextLine();

		//Switch Case to cal. the length converter
		switch (userInputLengthUnit){
			case "f": //m = f * 0.3048
				lengthInMeter = lengthFromUserInput * 0.3048;
				System.out.println(lengthFromUserInput + " foot " + lengthInMeter + " meter(s)."); //58f is 17m.
				break;
			case "m": // f = m * 3.2808399
				lengthInFoot = lengthFromUserInput *  3.2808399;
				System.out.println( lengthFromUserInput + " meter(s) " + lengthInFoot + " foot.");

				break;
		}

	}

}

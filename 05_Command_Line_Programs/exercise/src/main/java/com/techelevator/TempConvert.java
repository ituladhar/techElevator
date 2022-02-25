package com.techelevator;

import java.util.Scanner;

public class TempConvert {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		double tempInCelsius;
		double tempInFahrenheit;

		//Get Temp. data from the user
		System.out.print("Please enter the temperature: ");
		String tempFromUserData = in.nextLine();
		float temperature = Float.parseFloat(tempFromUserData);

		//Get data from the user either Celsius or Fahrenheit
		System.out.print("Is the temperature in (C)elcius, or (F)arenheit? ");
		String unitFromUser = in.nextLine();

		// switch case to work on F or C

		switch (unitFromUser){
			case "C":
				tempInFahrenheit = temperature * 1.8 + 32;
				System.out.print(temperature + " of C is " + tempInFahrenheit + " of F");
				break;

			case "F":
				tempInCelsius = (temperature -32) /1.8;
				System.out.print (temperature + " of F is " + tempInCelsius + " of C");
				break;

		}


	}

}

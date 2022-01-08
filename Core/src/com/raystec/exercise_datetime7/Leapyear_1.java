package com.raystec.exercise_datetime7;

public class Leapyear_1 {

	public static void main(String[] args) {

		int year = 2020;

		if (year % 4 == 0) {
			// System.out.println(year+ ": is a leap year");
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					System.out.println(year + ": is a leap year");
				} else {
					System.out.println(year + ": is not a leap year");
				}

			} else {
				System.out.println(year + ": is a leap year");
			}

		} else {
			System.out.println(year + ": is not a leap year");
		}
	}
}

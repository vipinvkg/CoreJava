package com.raystec.exercise_datetime7;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;

public class CalculateAge_1 {

	public static void main(String[] args) throws ParseException {
		
		LocalDate ld = LocalDate.of(1992, 01, 22);
		LocalDate nows= LocalDate.now();
		Period diffe = Period.between(ld, nows);
		System.out.println(diffe.getYears() + "years " + diffe.getMonths() + "Months " + diffe.getDays() + "Days");
		
		String dob = "04/01/1992";
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date d = sdf.parse(dob);
		
		Calendar c = Calendar.getInstance();
		c.setTime(d);
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH) + 1;
		int date = c.get(Calendar.DATE);
		LocalDate l = LocalDate.of(year, month, date);
		LocalDate now = LocalDate.now();
		Period diff = Period.between(l, now);
		System.out.println(diff.getYears() + "years " + diff.getMonths() + "Months " + diff.getDays() + "Days");
		
	}
}

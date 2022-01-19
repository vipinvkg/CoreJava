package com.raystec.exercise_datetime7;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalculateMaintanancedays_2 {

	public static void main(String[] args) throws Exception {
		
		String str = "15/02/2020" ;
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");
		Date d = (Date) sdf.parse(str); 
		System.out.println(d);
		
		for(int i = 1; i<= 12 ; i++) {
			Calendar Cal = Calendar.getInstance();
			Cal.setTime(d);
			Cal.add(Calendar.DATE,30);
			System.out.println(Cal.getTime());
			d = Cal.getTime();
		}
	}
}

package com.greg.maventest;

import java.time.LocalDate;
import java.time.Year;
import java.time.YearMonth;

public class Datejdk8 {
	
	public  void dateFunctionality( ) {
		
		LocalDate date1=LocalDate.of(2021, 05, 20);
		LocalDate date2=LocalDate.of(2021,10,10);
		
		
		if(date1.isAfter(date2)) {
			System.out.println(" Date1 is grater than Dat2");

		}
		else if(date1.isBefore(date2)) {
			System.out.println(" Date1 is lesser than Dat2");

		}
		else {
			System.out.println(" Date is Equall");

		}
		System.out.println("  is this leaf year "+Year.isLeap(2020));
		
		System.out.println(" Month of Year"+YearMonth.of(2021, 10).getMonthValue());
		
		System.out.println(" Date of day "+date1.getDayOfMonth());
		System.out.println(" Date of day "+date1.getDayOfWeek());


		
		
		

		
	}
	
	public  Boolean isDateGrater(LocalDate date1,LocalDate date2) 
	{
		
		
		if(date1.isAfter(date2))
		{
			System.out.println(" Date1 is grater than Dat2");
        return true;
		
		}
return false;

}
}
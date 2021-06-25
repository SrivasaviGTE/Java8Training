package com.greg.maventest;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

import org.junit.Test;

public class Datejdk8Test {

	@Test
	public void test1() {
	
		LocalDate date1=LocalDate.of(2021, 05, 20);
		LocalDate date2=LocalDate.of(2021,10,10);
		
		Datejdk8 dateObj=new Datejdk8();
 
 
 assertEquals(new Boolean(false), dateObj.isDateGrater(date1, date2));
	}

}

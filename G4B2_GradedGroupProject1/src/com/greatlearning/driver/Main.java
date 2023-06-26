package com.greatlearning.driver;
import com.greatlearning.dept.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdminDept ad = new AdminDept("Admin Department" , "Complete your documents submission", "Complete by EOD");
		System.out.println("Welcome to "+ ad.departmentName());
		System.out.println(ad.getTodaysWork());
		System.out.println(ad.getWorkDeadline());
		System.out.println(ad.isTodayAHoliday());
		System.out.println("\n");

		HRDept hr = new HRDept("HR Department" , "Fill today’s timesheet and mark your attendance", "Complete by EOD");

		System.out.println("Welcome to "+hr.departmentName());
		System.out.println(hr.doActivity());
		System.out.println(hr.getTodaysWork());
		System.out.println(hr.getWorkDeadline());
		System.out.println(hr.isTodayAHoliday());
		System.out.println("\n");
		
		TechDept td = new TechDept("Tech Department" , "Complete coding of Module 1", "Complete by EOD");

		System.out.println("Welcome to "+td.departmentName());
		System.out.println(td.getTodaysWork());
		System.out.println(td.getWorkDeadline());
		System.out.println(td.getTechStackInformation());
		System.out.println(td.isTodayAHoliday());
		System.out.println("\n");
		
		
	}

}

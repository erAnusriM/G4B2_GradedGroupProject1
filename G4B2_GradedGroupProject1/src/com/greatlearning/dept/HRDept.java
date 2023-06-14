package com.greatlearning.dept;

public class HRDept extends SuperDept {
	private String activity;
	
	public HRDept() {
		super("HR Department" , "Fill today’s timesheet and mark your attendance", "Complete by EOD");
		this.activity = "team Lunch";
	}

   public String doActivity() {
	  return this.activity;
   }
}

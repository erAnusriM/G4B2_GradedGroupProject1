package com.greatlearning.dept;

public class HRDept extends SuperDept {
	private String activity;
	
	public HRDept(String deptName, String todaysWrk, String deadline) {
//		super("HR Department" , "Fill today’s timesheet and mark your attendance", "Complete by EOD");
		super(deptName, todaysWrk, deadline);
		this.activity = "team Lunch";
	}

   public String doActivity() {
	  return this.activity;
   }
}

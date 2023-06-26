package com.greatlearning.dept;

public class SuperDept {
	private String departmentName;
	private String todaysWork;
	private String workDeadLine;
	private static String isAHoliday = "Today is not a Holiday";

	public SuperDept() {
		this.departmentName = "Super Department";
		this.todaysWork = "No Work as of now";
		this.workDeadLine = "Nil";
//		this.isAHoliday = "Today is not a Holiday";
	}
	
	public SuperDept(String deptName, String todaysWrk, String deadline) {
		this.departmentName = deptName;
		this.todaysWork = todaysWrk;
		this.workDeadLine = deadline;
//		this.isAHoliday = "Today is not a Holiday";
	}

	public String departmentName() {
		return this.departmentName;
	}

	public String getTodaysWork() {
		return this.todaysWork;
	}
	
	public String isTodayAHoliday() {
		return SuperDept.isAHoliday;
	}

	public String getWorkDeadline() {
		return this.workDeadLine;
	}
}

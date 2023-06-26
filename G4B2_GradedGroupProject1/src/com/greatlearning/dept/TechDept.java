package com.greatlearning.dept;

public class TechDept extends SuperDept {
	private String techStackInformation;
	
	public TechDept(String deptName, String todaysWrk, String deadline) {
//		super("Tech Department" , "Complete coding of Module 1", "Complete by EOD");
		super(deptName, todaysWrk, deadline);
		this.techStackInformation = "Core Java";
	}

   public String getTechStackInformation() {
	  return this.techStackInformation;
   }
}

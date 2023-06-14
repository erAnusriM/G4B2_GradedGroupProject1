package com.greatlearning.dept;

public class TechDept extends SuperDept {
	private String techStackInformation;
	
	public TechDept() {
		super("Tech Department" , "Complete coding of Module 1", "Complete by EOD");
		this.techStackInformation = "Core Java";
	}

   public String getTechStackInformation() {
	  return this.techStackInformation;
   }
}

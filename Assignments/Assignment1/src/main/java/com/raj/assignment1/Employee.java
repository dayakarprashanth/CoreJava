package com.raj.assignment1;

public class Employee {
	
	int empId;
	double sal = 0;
	double basic;
	double allowance;
	double deductions;
	String firstName;
	String lastName;
	String address;
	String pincode;
	String realname;
	
	public Employee() {
		
	}

	public Employee(double basic, double allowance, double deductions) {
		
		this.basic = basic;
		this.allowance = allowance;
		this.deductions = deductions;
	}
	
	

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public double getBasic() {
		return basic;
	}

	public void setBasic(double basic) {
		this.basic = basic;
	}

	public double getAllowance() {
		return allowance;
	}

	public void setAllowance(double allowance) {
		this.allowance = allowance;
	}

	public double getDeductions() {
		return deductions;
	}

	public void setDeductions(double deductions) {
		this.deductions = deductions;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public double getSal() {
		return sal;
	}

	public String getRealname() {
		return firstName+lastName;
	}

	public double calcSalary()
	{
		double sal = 0;	
		sal = basic + allowance - deductions;
		return sal;
	}
	
}

package com.raj.assignment1;

public class PartTimeEmployee extends Employee {
	
	public double calcSalary()
	{
		int parttimeSal=1000;
		sal = basic + parttimeSal + allowance - deductions;
		return sal;
	}

}

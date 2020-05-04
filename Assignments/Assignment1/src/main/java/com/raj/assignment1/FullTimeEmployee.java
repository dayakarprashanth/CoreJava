package com.raj.assignment1;

public class FullTimeEmployee extends Employee {

	public double calcSalary()
	{
		int fulltimeSal=5000;
		sal = basic + fulltimeSal + allowance - deductions;
		return sal;
	}
}

package com.bridgelabz.employeewage;

public class Employee {
	
	String empName;
	
	public Employee(String empName) {
		this.empName = empName;
	}
	
	static final int present = 1;
	static final int part_Time = 2;
	static final int wagePerHour = 20;
	static final int totalWorkingDays = 20;
	static final int totalWorkingHours = 100;
	static int fullDayWorkingHour = 8;
	
	public static int employeeCheck() {
		int empCheck =(int) Math.floor(Math.random() * 10) % 3;
		return empCheck;
	}
	
	public int getWorkignHour(int attendanceCheck) {
		int empHr;
		
		switch (attendanceCheck) {
		case present:
			empHr = fullDayWorkingHour;
			break;

		case part_Time:
			empHr = (fullDayWorkingHour / 2);
			break;

		default:
			empHr = 0;
			break;
		}
		return empHr;
	}
}

package com.company.base;

public class Employee {
	protected String department = "Unknown";

    protected void printDepartment() {
        System.out.println("Отдел: " + department);
    }
}
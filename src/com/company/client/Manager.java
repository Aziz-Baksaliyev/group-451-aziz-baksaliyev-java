package com.company.client;

import com.company.base.Employee;

public class Manager extends Employee {
	public void showDepartment() {
        department = "Продажа";
        printDepartment();
    }
}
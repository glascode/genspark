package com.Week_9_Assignment_1.Week_9_Assignment.Service;

import com.Week_9_Assignment_1.Week_9_Assignment.Entity.Employee;

import java.util.List;

public interface EmployeeRecord {

    List<Employee> seeAllWorkers();
    Employee getRecordbyID(int workerID);
    Employee addEmployee(Employee employee);
    Employee updateEmployeeInformation(Employee employee);
    String terminateEmployee(int workerID);

}

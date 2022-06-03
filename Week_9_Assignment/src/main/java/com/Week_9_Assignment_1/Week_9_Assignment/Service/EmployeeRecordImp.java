package com.Week_9_Assignment_1.Week_9_Assignment.Service;

import com.Week_9_Assignment_1.Week_9_Assignment.Dao.EmployeeDao;
import com.Week_9_Assignment_1.Week_9_Assignment.Entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeRecordImp implements EmployeeRecord {

    //add database object
    @Autowired
    private EmployeeDao employeeDao;



    @Override
    public List<Employee> seeAllWorkers() {
        return this.employeeDao.findAll();
    }

    @Override
    public Employee getRecordbyID(int workerID) {
        Optional<Employee> e = this.employeeDao.findById(workerID);
        Employee employee = null;
        if(e.isPresent()){
            employee = e.get();
        }else{throw new RuntimeException("Employee is not found for ID ::" + workerID);
        }
        return employee;
    }

    @Override
    public Employee addEmployee(Employee employee) {
        return employeeDao.save(employee);
    }


    @Override
    public Employee updateEmployeeInformation(Employee employee) {
        return employeeDao.save(employee);
    }

    @Override
    public String terminateEmployee(int workerID) {
        this.employeeDao.deleteById(workerID);
        return "Employee terminated successfully";
    }
}

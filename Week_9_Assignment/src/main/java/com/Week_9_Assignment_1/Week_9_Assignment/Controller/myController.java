package com.Week_9_Assignment_1.Week_9_Assignment.Controller;

import com.Week_9_Assignment_1.Week_9_Assignment.Entity.Employee;
import com.Week_9_Assignment_1.Week_9_Assignment.Service.EmployeeRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class myController {

    @Autowired
    private EmployeeRecord employeeRecord;
    @GetMapping("/")
    public String home(){
        return "<HTML><H1> Welcome to the Employee application!</H1></HTML>";
    }

    @GetMapping("/employeeRecord")
    public List<Employee> getEmployees(){
        return this.employeeRecord.seeAllWorkers();
    }

    @GetMapping("/employeeRecord/{workerID}")
    public Employee getEmployeeByID(@PathVariable String workerID){
        return this.employeeRecord.getRecordbyID(Integer.parseInt(workerID));
    }

    @PostMapping("/employeeRecord")
    public Employee hireEmployee(@RequestBody Employee newHire){
        return this.employeeRecord.addEmployee(newHire);
    }

    @PutMapping("/employeeRecord")
        public Employee updateEmployeeInformation(@RequestBody Employee oldInformation){

        return this.employeeRecord.updateEmployeeInformation(oldInformation);
    }

    @DeleteMapping("/employeeRecord/{workerID}")
    public String terminateEmployee(@PathVariable String workerID){
        return employeeRecord.terminateEmployee(Integer.parseInt(workerID));
    }







}

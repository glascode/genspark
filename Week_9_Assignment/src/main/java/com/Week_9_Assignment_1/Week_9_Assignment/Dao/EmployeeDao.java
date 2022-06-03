package com.Week_9_Assignment_1.Week_9_Assignment.Dao;

import com.Week_9_Assignment_1.Week_9_Assignment.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeDao extends JpaRepository<Employee, Integer> {
}

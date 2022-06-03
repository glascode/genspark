package com.Week_9_Assignment_1.Week_9_Assignment.Entity;

import javax.persistence.*;


@Entity
@Table(name = "tbl_employees")
public class Employee {


    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int workerID;
    private String name;
    private int age;
    private boolean readyForPromotion;



    public Employee() {
    }

    public Employee(int age, String name, int workerID, boolean readyForPromotion) {
        this.age = age;
        this.name = name;
        this.workerID = workerID;
        this.readyForPromotion = readyForPromotion;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWorkerID() {
        return workerID;
    }

    public void setWorkerID(int workerID) {
        this.workerID = workerID;
    }

    public boolean isReadyForPromotion() {
        return readyForPromotion;
    }

    public void setReadyForPromotion(boolean readyForPromotion) {
        this.readyForPromotion = readyForPromotion;
    }


}

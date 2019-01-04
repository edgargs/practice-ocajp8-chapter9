package com.gs.ocajp8;

public class Employee extends Person{
    public String employeeId;

    public static void main(String[] args){
        Employee ee = new Employee();
        ee.employeeId="111";
        ee.name="Amy";
        System.out.println(ee.getName());
    }
}
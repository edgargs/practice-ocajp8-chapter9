package com.gs.ocajp8;

public class Manager extends Employee{

    public String projectId;

    public static void main(String[] args){
        Manager m = new Manager();
        m.projectId = "OCAJP";
        m.employeeId = "222";
        m.name = "Nya";
        System.out.println(m.getName());

        //Acces static members inherited
        m.personCount = 1;
        System.out.println(m.getPersonCount()); //print 1
        Person.personCount = 2; //setting static variable of Base Class
        System.out.println(Employee.getPersonCount()); //print 2 - Parent Class
        System.out.println(m.getPersonCount()); //print 2
    }
}
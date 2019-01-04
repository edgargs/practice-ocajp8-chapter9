package com.gs.ocajp8.case4;

import com.gs.ocajp8.*;

/**
 * Created by USER on 4/01/2019.
 */
public class TestClass extends Manager{

    public static int getPersonCount(){
        return 100;
    }

    public static void main(String[] args){
        TestClass m = new TestClass();
        m.projectId = "OCAJP";
        m.employeeId = "222";
        m.name = "Nya";
        System.out.println(m.getName());

        //Acces static members inherited
        m.personCount = 1;
        System.out.println(m.getPersonCount()); //print 100
        System.out.println(Manager.getPersonCount()); //print 1
        Person.personCount = 2; //setting static variable of Base Class
        System.out.println(Employee.getPersonCount()); //print 2 - Parent Class
        System.out.println(Manager.getPersonCount()); //print 2
    }
}

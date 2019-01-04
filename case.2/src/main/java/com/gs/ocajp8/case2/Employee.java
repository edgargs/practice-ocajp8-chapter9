package com.gs.ocajp8.case2;

class Employee extends Person{
    public static void main(String[] args){
        Employee ee = new Employee("Bob"); //No compila porque 'Constructors (and Initializers)', no son miembros de una clase y no se heredan.        
    }
}
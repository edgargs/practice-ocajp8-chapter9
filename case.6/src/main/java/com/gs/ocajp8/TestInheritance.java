package com.gs.ocajp8;

/**
 * Created by USER on 4/01/2019.
 */
class A {
    static{
        println("In A's static initializer");
    }
    A(){
        println("In A's constructor");
    }
    {
        println("In A's instance initializer");
    }

    public static void println(Object obj){
        System.out.println(obj);
    }
}

class B extends A{
    static{
        println("In B's static initializer");
    }
    B(){
        println("In B's constructor");
    }
    public static void main(String[] args){
        println("In B.main()");
        B b = new B();
        b = new B();
    }
}

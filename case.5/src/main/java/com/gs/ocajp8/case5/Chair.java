package com.gs.ocajp8.case5;

/**
 * Created by USER on 4/01/2019.
 */
public final class Chair extends Furniture{
    //abstract method must be implemented
    public void assemble(){
        System.out.println("Assembling chair!");
    }
}

//Cannot inherit from final class
class MyChair extends Chair{

}
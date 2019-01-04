package com.gs.ocajp8.case5;

/**
 * Created by USER on 4/01/2019.
 */
public final class DoubleBed extends Bed{
    public void assemble(){
        System.out.println("Assembling DoubleBed");
    }

    //Can't override because is final
    public int getNumberOfLegs(){
        return 8;
    }
}

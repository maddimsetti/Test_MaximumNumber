package com.testmaximum;

/**
 * @description create Class for Defining the Maximum Of Three Inputs
 *
 */
public class MaximumVariables {

    /**
     * @description create Method for Finding the Maximum among Elements Using Generics
     * param: x,y,z are three Integers, Finding Maximum using "compareTo" Method
     * param: x,y,z are three Floats, Finding Maximum using "compareTo" Method
     * param: x,y,z are three Strings, Finding Maximum using "compareTo" Method
     */
    public static <M extends Comparable<M>>  M maximumElement(M x, M y, M z) {
        M maximum = x;               //Initializing maximum String
        if (y.compareTo(maximum) > 0 ) {
            maximum = y;
        }
        if (z.compareTo(maximum) > 0 ) {
            maximum = z;
        }
        return maximum;
    }

    /**
     * @description create Main Method for Welcoming the Test Maximum
     *
     */
    public static void main(String[] args) {
        System.out.println("Welcome to Test Maximum of Three Variables");
    }
}

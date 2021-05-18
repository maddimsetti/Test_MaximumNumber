package com.testmaximum;

/**
 * @description create Class for Defining the Maximum Of Three Inputs
 *
 */
public class MaximumVariables {

    /**
     * @description create Method for Finding the Maximum Number among Three Integers
     * param: x,y,z are three Integers, Finding Maximum using "compareTo" Method
     */
    public Integer maximumNUmber(Integer x, Integer y, Integer z) {
        Integer maximum = x;               //Initializing maximumNumber
        if (y.compareTo(maximum) > 0 ) {
            maximum = y;
        }
        if (z.compareTo(maximum) > 0 ) {
            maximum = z;
        }
        return maximum;
    }

    /**
     * @description create Method for Finding the Maximum Number among Three Float Numbers
     * param: x,y,z are three Float Numbers, Finding Maximum using "compareTo" Method
     */
    public Float maximumFloatNUmber(Float x, Float y, Float z) {
        Float maximum = x;               //Initializing maximumNumber
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

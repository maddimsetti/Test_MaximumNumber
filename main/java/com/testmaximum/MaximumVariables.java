package com.testmaximum;

/**
 * @description create Class for Defining the Maximum Of Three Inputs
 *
 */
public class MaximumVariables<M extends Comparable<M>> {
    //variables
    M x,y,z;
    /**
     * @description create Parameter Constructor for Defining the Variables
     *
     */
    public MaximumVariables(M x, M y, M z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    /**
     * @description create Empty Constructor for Passing the Variables
     *
     */
    public MaximumVariables () {
    }

    /**
     * @description create Generic Method for Printing the Variables within the class
     *
     */
    public M maximumElement() {
        return MaximumVariables.maximumElement(x, y, z);
    }

    /**
     * @description create Method for Finding the Maximum among Elements Using Generics
     * param: x,y,z are three Integers, Finding Maximum using "compareTo" Method
     * param: x,y,z are three Floats, Finding Maximum using "compareTo" Method
     * param: x,y,z are three Strings, Finding Maximum using "compareTo" Method
     */
    public static <M extends Comparable<M>>  M maximumElement(M x, M y, M z) {
        M maximum = x;               //Initializing maximum String
        if (y.compareTo(maximum) > 0 ) {
            maximum = y;             //y is largest so far
        }
        if (z.compareTo(maximum) > 0 ) {
            maximum = z;             //z is largest now
        }
        return maximum;              //Returning the largest Element
    }

    public static String testMaximum(String x, String y, String z) {
        String maximum = x;               //Initializing maximum String
        if (y.compareTo(maximum) > 0 ) {
           maximum = y;                   //y is largest so far
        }
       if (z.compareTo(maximum) > 0 ) {
            maximum = z;                  //z is largest now
        }
        return maximum;                   //Returning the largest Element
    }


    /**
     * @description create Main Method for the Test Maximum
     *
     */
    public static void main(String[] args) {
        System.out.println("Welcome to Test Maximum of Three Variables");
        Integer xInt = 9, yInt = 4, zInt = 15;
        Float xFl = 4.4f, yFl = 10.526f, zFl = 18.52f;
        String xStr = "Peach", yStr = "Banana", zStr = "Apple";
        MaximumVariables.testMaximum(xStr,yStr,zStr);
        new MaximumVariables<>(xInt,yInt,zInt).maximumElement();      //calling the Method to Print maximum of Integer variables
        new MaximumVariables<>(xFl,yFl,zFl).maximumElement();         //calling the Method to Print maximum of Float variables
        new MaximumVariables<>(xStr,yStr,zStr).maximumElement();      //calling the Method to Print maximum of String variables
    }
}

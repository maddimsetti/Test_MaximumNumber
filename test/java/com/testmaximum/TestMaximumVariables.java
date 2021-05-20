package com.testmaximum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @description create Class for Testing the Maximum of Three Inputs
 *
 */
public class TestMaximumVariables {
    MaximumVariables maximum = new MaximumVariables();    //creating object for passing Test Cases

    /**
     * @description creating methods for Testing the Three Integers which is maximum
     * param1: Maximum Number at First Position should return the same Number
     * param2: Maximum Number at Second Position should return the same Number
     * param3: Maximum Number at Third Position should return the same Number
     */
    @Test
    public void givenThreeNumbers_1stPosition_shouldReturnMaximum() {
        Integer result = maximum.maximumElement(9,3,4);
        Assertions.assertEquals(9, result);            //Testing for First Position
    }
    @Test
    public void givenThreeNumbers_2ndPosition_shouldReturnMaximum() {
        Integer result = maximum.maximumElement(3,9,4);
        Assertions.assertEquals(9, result);            //Testing for second Position
    }
    @Test
    public void givenThreeNumbers_3rdPosition_shouldReturnMaximum() {
        Integer result = maximum.maximumElement(3,4,9);
        Assertions.assertEquals(9, result);            //Testing for Third Position
    }

    /**
     * @description creating methods for Testing the Three Float Numbers which is maximum
     * param1: Maximum Number at First Position should return the same Number
     * param2: Maximum Number at Second Position should return the same Number
     * param3: Maximum Number at Third Position should return the same Number
     */
    @Test
    public void givenThreeFloatNumbers_1stPosition_shouldReturnMaximum() {
        Float result = maximum.maximumElement(5.5f,3.3f,4.4f);
        Assertions.assertEquals(5.5f, result);            //Testing for First Position
    }
    @Test
    public void givenThreeFloatNumbers_2ndPosition_shouldReturnMaximum() {
        Float result = maximum.maximumElement(3.3f,5.5f,4.4f);
        Assertions.assertEquals(5.5f, result);            //Testing for Second Position
    }
    @Test
    public void givenThreeFloatNumbers_3rdPosition_shouldReturnMaximum() {
        Float result = maximum.maximumElement(3.3f,4.4f,5.5f);
        Assertions.assertEquals(5.5f, result);          //Testing for Third Position
    }

    /**
     * @description creating methods for Testing the Three Strings which is maximum
     * param1: Maximum Number at First Position should return the same Number
     * param2: Maximum Number at Second Position should return the same Number
     * param3: Maximum Number at Third Position should return the same Number
     */
    @Test
    public void givenStrings_1stPosition_shouldReturnMaximum() {
        String result = maximum.maximumElement("Peach","Banana","Apple");
        Assertions.assertEquals("Peach", result);            //Testing for First Position
    }
    @Test
    public void givenStrings_2ndPosition_shouldReturnMaximum() {
        String result = maximum.maximumElement("Banana","Peach","Apple");
        Assertions.assertEquals("Peach", result);            //Testing for Second Position
    }
    @Test
    public void givenStrings_3rdPosition_shouldReturnMaximum() {
        String result = maximum.maximumElement("Apple","Banana","Peach");
        Assertions.assertEquals("Peach", result);            //Testing for Third Position
    }

    /**
     * @description create method for Testing the Three Elements(Integer,Float,String) which is maximum
     * param1: Given Three Integer Number and  should return the maximum Integer Number among the Three variables
     * param2: Given Three Float Number and should return the maximum Float Number among the Three Variables
     * param3: Given Three String and should return the maximum String among the Three Variables
c    */
    @Test
    public void givenElements_CheckGeneric_shouldReturnMaximum() {
        Integer result = maximum.maximumElement(9,8,15);
        Float result1 = maximum.maximumElement(2.2f,5.5f,4.4f);
        String result2 = maximum.maximumElement("Paris","America","Bhutan");
        Assertions.assertEquals(15,result);                   //Testing for Integer Variables
        Assertions.assertEquals(5.5f,result1);                //Testing for Float Variables
        Assertions.assertEquals("Paris", result2);            //Testing for String Variables
    }

}

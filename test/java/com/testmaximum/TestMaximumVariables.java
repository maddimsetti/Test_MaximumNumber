package com.testmaximum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @description create Class for Testing the Maximum of Three Inputs
 *
 */
public class TestMaximumVariables {
    MaximumVariables maximum = new MaximumVariables();      //creating object for passing Test Cases

    /**
     * @description create method for Testing the Three Integers which is maximum
     * param: Maximum Number at First Position should return the same Number
     */
    @Test
    public void givenThreeNumbers_1stPosition_shouldReturnMaximum() {
        Integer result = maximum.maximumNUmber(9,3,4);
        Assertions.assertEquals(9, result);
    }

}

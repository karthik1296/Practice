package com.tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;


public class RepeatedTests
{
    @Test
    @RepeatedTest(5)
    void addNumber() {
        Calculator cal = new Calculator();
       int  sum=cal.add(1, 7);
        Assertions.assertEquals(8, sum);
        System.out.println("addNumber testcase executed");
    }


}

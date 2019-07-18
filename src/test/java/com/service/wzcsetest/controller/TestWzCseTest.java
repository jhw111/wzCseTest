package com.service.wzcsetest.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestWzCseTest {

        WzCseTestDelegate wzcsetestDelegate = new WzCseTestDelegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = wzcsetestDelegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}
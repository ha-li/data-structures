package com.gecko.structures;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by hlieu on 10/25/16.
 */
public class StackImplTest {

    //@Test
    public void test_push() {
        Integer i = new Integer(5);
        Stack myStack = new StackImpl();
        myStack.push(i);

        Integer r = (Integer) myStack.pop();
        Assert.assertEquals(i, r);
    }


    @Test
    public void test_push_to_limit() {

        Stack myStack = new StackImpl();

        for(int i = 0; i < 5; i++) {
            Integer i1 = new Integer(2);
            myStack.push(i1);
        }

        while( !myStack.isEmpty() ) {
            Integer i = (Integer) myStack.pop();
        }

        for(int i = 0; i < 5; i++) {
            Integer i1 = new Integer(5);
            myStack.push(i1);
        }
    }
}
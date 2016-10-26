package com.gecko.structures;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by hlieu on 10/25/16.
 */
public class QueueImplTest {
    @Test
    public void test_enqueue() {
        Queue q = new QueueImpl();
        q.enqueue(new Integer(5));

    }
}
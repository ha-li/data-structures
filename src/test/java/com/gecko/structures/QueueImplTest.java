package com.gecko.structures;

import com.gecko.structures.exceptions.QueueEmptyException;
import com.gecko.structures.exceptions.QueueFullException;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by hlieu on 10/25/16.
 */
public class QueueImplTest {
    @Test(expected = QueueFullException.class)
    public void test_enqueue() {
        Queue q = new CircularQueueImpl(5);
        q.enqueue(new Integer(5));
        q.enqueue(new Integer(6));
        q.enqueue(new Integer(7));
        q.enqueue(new Integer(8));

        // throws an exception
        q.enqueue(new Integer(9));


        // q.enqueue(new Integer(10));
    }


    @Test(expected = QueueEmptyException.class)
    public void test_dequeue() {
        Queue q = new CircularQueueImpl(5);
        q.enqueue(new Integer(5));

        q.dequeue();
        q.dequeue();
    }

}
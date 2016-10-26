package com.gecko.structures;

import com.gecko.structures.exceptions.EmptyQueueException;

/**
 * Created by hlieu on 10/25/16.
 */
public class QueueImpl implements Queue {

    private Object[] _q = null;
    private int head = 0;  //points the front of the queue
    private int tail = 0;  // points to the back element of the queue
    private static int DEFAULT_SIZE = 10;
    private int size = 0;


    public QueueImpl() {
        _q = new Object[DEFAULT_SIZE];
    }

    public void enqueue(Object o) {
        if (isFull() )  { throw new StackOverflowError(); }

        _q[tail] = o;
        if(tail == _q.length-1) { tail = 0; }
        else { tail = tail + 1; }

        size++;
    }

    public Object dequeue() {
        if( isEmpty() ) {
            throw new EmptyQueueException();
        }

        Object ret = _q[head];
        if(head == _q.length - 1) { head = 0; }
        else { head = head + 1; }

        size--;
        return ret;
    }

    private Boolean isEmpty() {
        return size == 0;
    }

    private Boolean isFull() {
        return size == DEFAULT_SIZE;
    }
}

package com.gecko.structures;

import com.gecko.structures.exceptions.QueueEmptyException;
import com.gecko.structures.exceptions.QueueFullException;

/**
 * Created by hlieu on 10/25/16.
 */
public class CircularQueueImpl implements Queue {

    private Object[] _q = null;
    private int head = 0;  //points the front of the queue
    private int tail = 0;  // points to the last spot of the queue
    private static int DEFAULT_SIZE = 10;
    private int size = 0;


    // construct a circular queue that holds n - 1 elements
    // weird behavior of circular queue.

    // to make a circular queue that holds n elements,
    // we need to keep track of the number of elements in the queue
    // eg int curr_size = 0;
    public CircularQueueImpl( int n ) {
        size = n;
        _q = new Object[size];
    }

    public void enqueue(Object o) {

        if ( (tail + 1) % size == head )  {
            throw new QueueFullException();
        }

        _q[tail] = o;
        // solve for the first addition
        // if(head == -1) { head = 0; }

        // enqueuing grows the tail
        tail = (tail + 1) % size;
        //_q[tail] = o;
        //if(tail == _q.length-1) { tail = 0; }
        //else { tail = tail + 1; }

        //size++;
    }

    public Object dequeue() {

        /* if( head == tail ) {
            throw new QueueEmptyException();
        } */
        if ( head == tail ) {
            throw new QueueEmptyException();
        }

        Object ret = _q[head];

        head = (head+1) % size;
        // if ( head == tail ) { head = -1 ; tail = 0; }
        // Object ret = _q[head];
        //if(head == _q.length - 1) { head = 0; }
        //else { head = head + 1; }

        //size--;
        return ret;
    }

}

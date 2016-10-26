package com.gecko.structures;

import java.util.EmptyStackException;

/**
 * Created by hlieu on 10/25/16.
 */
public class StackImpl implements Stack {

    Object[] _stack = null;
    private static int DEFAULT_SIZE = 10;
    // -1 means the stack is empty
    private int top = -1;


    public StackImpl() {
        _stack = new Object[DEFAULT_SIZE];
        this.top = -1;
    }

    public Boolean isEmpty() {
        return top == -1;
    }


    private Object[] copyStack(Object[] new_stack) {
        for(int i = 0; i <= top; i++) {
            new_stack[i] = _stack[i];
        }
        return new_stack;
    }

    public void push(Object o) {
        if( top >= (_stack.length/2 + 1) ) {
            Object[] new_stack = new Object[_stack.length*2];
            _stack = copyStack(new_stack);
        }
        top = top + 1;
        _stack[top] = o;
    }

    public Object pop() {
        if( ! isEmpty() ) {
            Object ret = _stack[top];
            top = top - 1;
            return ret;
        }
        throw new EmptyStackException();
    }
}

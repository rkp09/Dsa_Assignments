package _14_stack_queues;

import java.util.Stack;

public class CustomStack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    int ptr = -1;
    public CustomStack(){
        this(DEFAULT_SIZE);
    }
    public CustomStack(int size){
        this.data = new int[size];
    }

    public boolean push(int value) throws StackException{
        if (isFull()){
            throw new StackException("Can't add an element to a full stack.");
        }

        data[++ptr] = value;

        return true;
    }

    public int pop() throws StackException {
        if (ptr == -1){
            throw new StackException("Can't remove an element from an empty stack.");
        }

        return data[ptr--];
    }

    public int peek() throws StackException{
        if (ptr == -1){
            throw new StackException("Can't provide peek from an empty stack.");

        }
        return data[ptr];
    }

    protected boolean isFull() {
        return ptr == data.length - 1;
    }

}

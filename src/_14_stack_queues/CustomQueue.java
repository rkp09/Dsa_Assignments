package _14_stack_queues;

public class CustomQueue {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    private int end = 0;

    public CustomQueue() {
        this(DEFAULT_SIZE);
    }

    public CustomQueue(int size) {
        this.data = new int[size];
    }


    public boolean insert(int value) throws QueueException {
        if (isFull()){
            throw new QueueException("Can't insert element to a loaded queue.");
        }

        data[end++] = value;
        return true;
    }


    public int peek(){
        return data[0];
    }

    public int remove() throws QueueException{
        if (isEmpty()){
            throw new QueueException("Can't remove an element from an empty queue.");
        }
        int removed = data[0];

        for (int i = 1; i < end; i++) {
            data[i - 1] = data[i];
        }

        end--;
        return removed;
    }

    private boolean isEmpty() {
        return end == 0;
    }

    public void display(){
        for (int i = 0; i < end; i++) {
            System.out.print(data[i] + " -> ");
        }

        System.out.println("End.");
    }

    public boolean isFull() {
        return end == data.length;
    }
}

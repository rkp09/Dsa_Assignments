package _14_stack_queues;

public class CircularQueue{
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    protected int first = 0;
    protected int end = 0;
    private int size = 0;

    public CircularQueue() {
        this(DEFAULT_SIZE);

    }

    public CircularQueue(int size) {
        this.data = new int[size];
    }

    public boolean insert(int value) throws QueueException {
        if (isFull()){
            throw new QueueException("Can't insert element to a loaded queue.");
        }

        data[end++] = value;
        end = end % data.length;
        size++;
        return true;
    }

    public int peek() {
        return data[first];
    }


    public int remove() throws QueueException {
        if (isEmpty()){
            throw new QueueException("Can't remove an element from an empty queue.");
        }

        size--;
        return data[first++];
    }

    public void display() {
        int i = first;

        do {
            System.out.print(data[i++] + " -> ");
            i = i % data.length;

        } while (i != end);

        System.out.println("End.");
    }

    protected boolean isFull() {
        return data.length == size;
    }

    protected boolean isEmpty(){
        return size == 0;
    }
}

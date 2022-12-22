package _14_stack_queues;

public class DynamicQueue extends CircularQueue{
    public DynamicQueue() {
        super();
    }

    public DynamicQueue(int size) {
        super(size);
    }

    @Override
    public boolean insert(int value) throws QueueException {
        if (this.isFull()){
            int N = data.length;
            int[] temp = new int[N * 2];

            for (int i = 0; i < data.length; i++) {
                temp[i] = data[(i + first) % N];
            }
            first = 0;
            end = N;
            data = temp;

        }
        return super.insert(value);
    }
}

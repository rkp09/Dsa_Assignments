package _14_stack_queues;

public class DynamicStack extends CustomStack {
    public DynamicStack(){
        super();
    }

    public DynamicStack(int size){
        super(size);
    }

    @Override
    public boolean push(int value) throws StackException {
        if (this.isFull()){
            int[] temp = new int[data.length * 2];

            // Copy all the elements from data to temp
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[i];
            }

            data = temp;
        }

        return super.push(value);
    }
}

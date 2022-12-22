package _14_stack_queues;

public class StackMain {
    public static void main(String[] args) throws StackException{
        DynamicStack stack = new DynamicStack(2);
        stack.push(3);
        stack.push(9);
        stack.push(11);
        System.out.println(stack.pop());
    }
}

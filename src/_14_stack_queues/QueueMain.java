package _14_stack_queues;

public class QueueMain {
    public static void main(String[] args) throws QueueException {
        DynamicQueue queue = new DynamicQueue(5);
        queue.insert(5);
        queue.insert(7);
        queue.insert(13);
        queue.insert(45);
        queue.insert(80);
        queue.display();

        System.out.println(queue.remove());
        queue.insert(18);
        queue.insert(5);
        queue.display();
    }
}

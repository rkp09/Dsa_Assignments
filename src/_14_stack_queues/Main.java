package _14_stack_queues;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        Stack<Integer> stack = new Stack<>();
//        stack.add(2);
//        stack.add(5);
//        stack.add(9);
//        stack.add(11);
//        stack.add(15);
//
//
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());

//        Queue<Integer> queue = new LinkedList<>();
//        queue.add(2);
//        queue.add(5);
//        queue.add(9);
//        queue.add(11);
//        queue.add(18);
//
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());

        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(2);
        deque.add(5);
        deque.addLast(8);
        deque.addLast(11);
        System.out.println(deque.remove());
        System.out.println(deque.removeLast());
    }
}

package _13_linked_list;

public class CLL {
    private Node head;
    private Node tail;

    public void insert (int value){
        Node node = new Node(value);

        if (head == null){
            head = node;
            tail = node;
            return;
        }

        tail.next = node;
        node.next = head;
        tail = node;
    }


    public void delete (int value){
        if (head.value == value){
            head = head.next;
            tail.next = head;
            return;
        }

        Node node = find (value);
        if (node == null){
            System.out.println("Value " + value + " is not present at the list.");
            return;
        }

        if (node.next == tail){
            node.next = head;
            tail = node;
            return;
        }

        node.next = node.next.next;
    }

    public Node find (int value){

        Node temp = head;
        do {
            Node node = temp.next;

            if (node.value == value){
                return temp;
            }
            temp = node;

        } while (temp != head);

        return null;
    }

    public void display (){
        Node temp = head;
        if (temp != null){
            do {
                System.out.print(temp.value + " -> ");
                temp = temp.next;
            }
            while (temp != head);

            System.out.println("HEAD");
        }
    }

    private class Node{
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }
}

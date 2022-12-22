package _13_linked_list;

public class DLL {
    private Node head;

    public void insertFirst (int value){
        Node node = new Node(value);
        node.previous = null;
        node.next = head;

        if (head != null){
            head.previous = node;
        }

        head = node;
    }

    public void insertLast (int value){
        if (head == null){
            insertFirst(value);
            return;
        }

        Node last = head;
        while (last.next != null){
            last = last.next;
        }

        Node node = new Node(value);
        last.next = node;
        node.previous = last;
        node.next = null;
    }

    // Insert after this value
    public void insert (int valueAfter, int value){
        Node temp = find(valueAfter);

        if (temp == null){
            insertLast(value);
            return;
        }

        Node node = new Node(value);

        node.next = temp.next;

        if (temp.next.previous != null){
            temp.next.previous = node;
        }

        temp.next = node;
        node.previous = temp;
    }


    private Node find (int value){
        Node temp = head;

        while (temp != null){
            if (temp.value == value){
                return temp;
            }

            temp = temp.next;
        }

        return null;
    }

    public void display (){
        Node temp = head;

        while (temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }

        System.out.println("END");
    }

    public void reversalDisplay (){
        Node temp = head;

        while (temp.next != null){
            temp = temp.next;
        }

        while (temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.previous;
        }
        System.out.println("START");
    }


    private class Node {
        private int value;
        private Node next;
        private Node previous;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next, Node previous) {
            this.value = value;
            this.next = next;
            this.previous = previous;
        }
    }
}

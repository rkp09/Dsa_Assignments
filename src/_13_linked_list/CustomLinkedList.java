package _13_linked_list;

public class CustomLinkedList {
    private Node head;
    private Node tail;
    private int size;


    // Reverse nodes in k-Groups
    public Node reverseKGroup(int k) {
        int length = getLength(head);

        Node temp = head;
        Node link = head;
        Node cEnd = head;
        Node nStart = head;

        for (int i = 0; (i + k) <= length; i += k){

            for (int j = 0; j < k; j++){
                nStart = nStart.next;
            }

            Node swapNode = reverse(temp, k);

            if (i == 0){
                head = swapNode;
                link = swapNode;
            } else {
                link.next = swapNode;
            }

            link = cEnd;
            cEnd.next = nStart;
            cEnd = nStart;
            temp = nStart;

        }

        return head;
    }



    public int getLength(Node head){
        Node temp = head;
        int count = 0;
        while (temp != null){
            count++;
            temp = temp.next;
        }

        return count;
    }

    public Node reverse(Node head, int k){
        Node previous = null;
        Node present = head;
        Node next = present.next;
        int i = 0;
        while (i < k && present != null){
            present.next = previous;
            previous = present;
            present = next;
            if (next != null){
                next = next.next;
            }

            i++;
        }

        return previous;
    }

    // Reorder linked list
    public void reorderList() {
        Node mid = getMid(head);
        Node temp2 = reverse(mid);
        Node temp1 = head;

        while (temp1 != null && temp2 != null) {
            Node next1 = temp1.next;
            Node next2 = temp2.next;

            temp1.next = temp2;
            temp2.next = next1;

            temp1 = next1;
            temp2 = next2;
        }

        if (temp1 != null){
            temp1.next = null;
        }

    }

    public Node getMid(Node head){
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public Node reverse(Node head){
        Node previous = null;
        Node present = head;
        Node next = present.next;

        while (present != null){
            present.next = previous;
            previous = present;
            present = next;
            if (next != null){
                next = next.next;
            }
        }

        return previous;
    }

    // Insert or add element to linkedList.
    public void insertFirst (int value){
        Node node = new Node(value);
        node.next = head;
        head = node;

        if (tail == null){
            tail = node;
        }

        size++;
    }

    public void insertLast (int value){
        if (size == 0){
            insertFirst(value);
            return;
        }

        Node node = new Node(value);
        tail.next = node;
        tail = node;
        size++;
    }

    public void insert (int index, int value){
        if (index == 0){
            insertFirst(value);
            return;
        }

        if (index == size){
            insertLast(value);
            return;
        }


        Node node = new Node(value);
        Node temp = head;
        for (int i = 1; i < index; i++){
            temp = temp.next;
        }

        node.next = temp.next;
        temp.next = node;
        size++;
    }

    // Insert using recursion
    public void insertRec (int index, int value){
        head = insertion(index, value, head);
    }

    private Node insertion (int index, int value, Node node){
        if (index == 0){
            size++;
            return new Node(value, node);
        }

        node.next = insertion(--index, value, node.next);

        return node;
    }
    // End of insertion.

    // Delete an element from linkedList
    public void deleteFirst (){
        head = head.next;

        if (head == null){
            tail = null;
        }
        size--;
    }

    public void deleteLast (){
        Node temp = head;

        while (temp.next.next != null){
            temp = temp.next;
        }

        temp.next = null;
        tail = temp;
        size--;
    }

    public void delete (int index) throws Exception {
        if (index > size || index < 0){
            throw new NullPointerException("This is not a valid index.");
        }

        if (index == size - 1){
            deleteLast();
            return;
        }

        if (index == 0){
            deleteFirst();
            return;
        }


        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }

        temp.next = temp.next.next;
        size--;
    }
    // End of deletion .



    // Reversing linked list
    public void reverse(){
        if (size < 2){
            return;
        }

        Node previous = null;
        Node present = head;
        Node next = present.next;

        while (present != null){
            present.next = previous;
            previous = present;
            present = next;
            if (next != null){
                next = next.next;
            }
        }


        head = previous;
    }


    // Find the index of the value
    public int findIndex (int value){
        Node temp = head;
        int i = 0;
        while (temp != null){
            if (temp.value == value){
                return i;
            }

            temp = temp.next;
            i++;
        }

        return -1;
    }
    public void display(){
        Node temp = head;

        while (temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }

        System.out.println("End");
    }
    private class Node{
        private int value;
        private Node next;

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }

        public Node(int value){
            this.value = value;
        }
    }
}

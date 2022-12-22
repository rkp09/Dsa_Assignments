package _13_linked_list;

public class Main {
    public static void main(String[] args) throws Exception {
        CustomLinkedList list = new CustomLinkedList();
        list.insertLast(1);
        list.insertLast(2);
        list.insertLast(3);
        list.insertLast(4);
        list.insertLast(5);
        list.display();
        list.reverseKGroup(3);
        list.display();
    }
}

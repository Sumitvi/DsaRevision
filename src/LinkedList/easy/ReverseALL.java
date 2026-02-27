package LinkedList.easy;

public class ReverseALL {

    static class Node {
        int data;
        MiddleNodeofLL.Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static MiddleNodeofLL.Node head;


    static void add(int data) {
        MiddleNodeofLL.Node newNode = new MiddleNodeofLL.Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        MiddleNodeofLL.Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public static void main(String[] args) {

//         Reverse a LinkedList (Iterative)

        
    }
}

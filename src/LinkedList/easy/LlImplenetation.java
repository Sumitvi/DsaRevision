package LinkedList.easy;

public class LlImplenetation {

    class Node {
        int data;
        Node next;

        public Node (int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

//    ADD IN LinkedList

    public void addFirst(int data){

        Node newNode = new Node(data);

        if(head == null){
            head = tail = newNode;
            return;
        }

        newNode.next = head;

        head = newNode;
    }


    public void addLast(int data){

//        Create a New Node
        Node newNode = new Node(data);

//        check if the ll is empty
        if(head == null){
            head = tail = newNode;
        }

    }


    public static void main(String[] args) {



    }
}

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

        tail.next = newNode;
        tail = newNode;

    }


    public void addInMiddle(int data , int idx){
        
    }


    public static void main(String[] args) {

        LlImplenetation ll = new LlImplenetation();
        ll.addFirst(5);
        ll.addFirst(4);

        ll.addLast(1);
        ll.addLast(2);

//       print a ll
        Node temp = head;

        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }


    }
}

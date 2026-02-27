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

        Node newNode = new Node(data);
        Node temp = head;
        int i=0;

        while( i < idx-1 ){
            temp = temp.next;
            i++;
        }

        newNode.next = temp.next;
        temp.next = newNode;


    }


    public static void main(String[] args) {

//        LlImplenetation ll = new LlImplenetation();
//        ll.addFirst(5);
//        ll.addFirst(4);
//
//        ll.addLast(1);
//        ll.addLast(2);
//
////       print a ll
//        Node temp = head;
//
//        while(temp != null){
//            System.out.println(temp.data);
//            temp = temp.next;
//        }

        LlImplenetation ll = new LlImplenetation();

        ll.addFirst(5);
        ll.addFirst(4);
        ll.addFirst(2);
        ll.addFirst(1);

        ll.addInMiddle(3 , 2);

        Node temp = head;

        while(temp!=null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }




    }
}

package LinkedList.medium;

import LinkedList.easy.LlImplenetation;

public class LLImplenetation {

    class Node {
        int data;
        LLImplenetation.Node next;

        public Node (int data){
            this.data = data;
            this.next = null;
        }
    }

    public static LLImplenetation.Node head;
    public static LLImplenetation.Node tail;

//    ADD IN LinkedList

    public void addFirst(int data){

        LLImplenetation.Node newNode = new LLImplenetation.Node(data);

        if(head == null){
            head = tail = newNode;
            return;
        }

        newNode.next = head;

        head = newNode;
    }


    public void addLast(int data){

//        Create a New Node
        LLImplenetation.Node newNode = new LLImplenetation.Node(data);

//        check if the ll is empty
        if(head == null){
            head = tail = newNode;
        }

        tail.next = newNode;
        tail = newNode;

    }


    public void addInMiddle(int data , int idx){

        LLImplenetation.Node newNode = new LLImplenetation.Node(data);
        LLImplenetation.Node temp = head;
        int i=0;

        while( i < idx-1 ){
            temp = temp.next;
            i++;
        }

        newNode.next = temp.next;
        temp.next = newNode;


    }

}

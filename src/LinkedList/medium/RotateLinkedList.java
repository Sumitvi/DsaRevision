package LinkedList.medium;

public class RotateLinkedList {

    public LLImplenetation.Node rotate(LLImplenetation.Node head, int k) {

        if(k==0 || head == null){
            return head;
        }

        LLImplenetation.Node curr = head;
        int len = 0;

        while(curr.next!=null){
            curr = curr.next;
            len+=1;
        }

        k = k % len;

//        making circular ll
        curr.next = head;
        curr = head;


        for(int i=0; i<k; i++){
            curr = curr.next;
        }

        

    }
        public static void main(String[] args) {

//        Rotate a Linked List

    }
}

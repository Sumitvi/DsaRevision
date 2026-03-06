package LinkedList.medium;

public class OddEvenNode {

    static LLImplenetation.Node SegrigateOddEven(LLImplenetation.Node head){

        if(head == null){
            return head;
        }

        LLImplenetation.Node odd = head;
        LLImplenetation.Node even = head.next;
        LLImplenetation.Node evenHead = even;

        while (even!=null && even.next!=null){

            odd.next = odd.next.next;
            odd = odd.next;

            even.next = even.next.next;
            even = even.next;
        }

        odd.next = evenHead;

        return head;

    }

    public static void main(String[] args) {


    }
}

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
        }

    }

    public static void main(String[] args) {


    }
}

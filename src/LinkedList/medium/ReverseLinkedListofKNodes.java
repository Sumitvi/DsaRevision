package LinkedList.medium;

public class ReverseLinkedListofKNodes {

    static LLImplenetation.Node reverseKGroup(LLImplenetation.Node head , int k){
        LLImplenetation.Node temp = head;
        int count = 0;

        while (temp!=null && count < k){
            temp = temp.next;
            count++;
        }

        if(count < k){
            return head;
        }

        LLImplenetation.Node curr = head;
        LLImplenetation.Node prev = null;
        LLImplenetation.Node next = null;

        while(curr != null && count < k){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            count++;
        }

        head.next = reverseKGroup(curr , k);

        return prev;

    }


    public static void main(String[] args) {

//        Reverse k node of a LL
    }
}

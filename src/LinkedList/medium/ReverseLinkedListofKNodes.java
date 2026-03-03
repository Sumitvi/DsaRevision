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


    }


    public static void main(String[] args) {

//        Reverse k node of a LL
    }
}

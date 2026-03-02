package LinkedList.medium;

public class LengthofCycle {

    static int lengthOfLoop(LLImplenetation.Node head) {
        LLImplenetation.Node slow = head;
        LLImplenetation.Node fast = head;

        while(fast!=null && fast.next!=null){
            slow =slow.next;
            fast = fast.next.next;

            if(slow == fast){
                return countNodes(slow);
            }
        }

        return 0;
    }

    static int countNodes(LLImplenetation.Node loopNode){
        LLImplenetation.Node temp = loopNode;
        int count = 0;

        while(temp!=loopNode){
            
        }

    }



        public static void main(String[] args) {

//        find the length of cycle

    }
}

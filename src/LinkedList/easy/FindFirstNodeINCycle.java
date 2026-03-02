package LinkedList.easy;

public class FindFirstNodeINCycle {

    static int cycleStart(LlImplenetation.Node head) {
        // code here

        LlImplenetation.Node slow = head;
        LlImplenetation.Node fast = head;

        while(fast!=null && fast.next!=null){

            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){

                slow = head;

                while(slow!=fast){
                    slow = slow.next;
                    fast = fast.next;
                }

                return slow.data;
            }
        }

        return -1;

    }

    public static void main(String[] args) {

//        find the first node in cycle


    }
}

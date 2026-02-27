package LinkedList.easy;

public class DetectLoopinLL {

    public boolean detectLoop(MiddleNodeofLL.Node head) {
        // code here

        MiddleNodeofLL.Node slow = head;
        MiddleNodeofLL.Node fast = head;

        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;

            if(slow == fast){
                return true;
            }

        }

        return false;
    }

    public static void main(String[] args) {



    }
}

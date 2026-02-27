package LinkedList.easy;
import java.util.LinkedList;





public class MiddleNodeofLL {


    class Node{

        Node next;
        int data;

        public Node(int data , Node next){
            this.data = data;
            this.next = null;
        }



    }

    public static Node head;
    public static LlImplenetation.Node tail;

    public static void main(String[] args) {

        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);

        Node slow = head;
        Node fast = head;

        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            
        }


    }
}

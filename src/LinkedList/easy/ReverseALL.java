package LinkedList.easy;

public class ReverseALL {

    static class Node {
        int data;
        ReverseALL.Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static ReverseALL.Node head;


    static void add(int data) {
        ReverseALL.Node newNode = new ReverseALL.Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        ReverseALL.Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public static void main(String[] args) {

//         Reverse a LinkedList (Iterative)
          add(1);
          add(2);
          add(3);
          add(4);
          add(5);

          Node prev = null;
          Node curr = head;
          Node next;


          while(curr!=null){
              next = curr.next;
              curr.next = prev;
              prev = curr;
              curr = next;
          }

        prev = head;

        Node temp = head;

        while(temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }



    }
}

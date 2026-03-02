package LinkedList.medium;

public class AddTwoNumbers {

    public LLImplenetation.Node addTwoNumbers(LLImplenetation.Node l1, LLImplenetation.Node l2) {

        LLImplenetation.Node res = new LLImplenetation.Node(0);
        LLImplenetation.Node ptr = res;
        int carry = 0;

        while(l1!=null && l2!=null){
            int sum = 0 + carry;

            if(l1!=null){
                sum+=l1.data;
                l1 = l1.next;
            }

            if(l2!=null){
                sum+=l2.data;
                l2 = l2.next;
            }
        }

    }
    public static void main(String[] args) {

    }
}

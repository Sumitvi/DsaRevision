package LinkedList.easy;

import java.util.Stack;

public class CheckPalindromeLL {

    public boolean isPalindrome(LlImplenetation.Node head) {

        // using stack Approach
        LlImplenetation.Node currNode = head;
        Stack<Integer> st = new Stack<>();

        while(currNode!=null){
            st.push(currNode.data);
            currNode = currNode.next;
        }

        while (head!=null){

            int top = st.pop();

            if(head.data != top){
                return false;
            }

            head = head.next;
        }

        return true;

    }


    public static void main(String[] args) {

//        Check if a LL is Plaindrome or not
    }
}

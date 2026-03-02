package LinkedList.easy;

public class PointofIntersection {

    public LlImplenetation.Node intersectPoint(LlImplenetation.Node head1, LlImplenetation.Node head2) {
        // code here

        LlImplenetation.Node ptr1 = head1;
        LlImplenetation.Node ptr2 =head2;

        if(ptr1 == null || ptr2 == null){
            return null;
        }

        while(ptr1!=ptr2){

            if(ptr1!=null){
                ptr1 = ptr1.next;
            }else{
                ptr1 = head2;
            }

            if(ptr2!=null){
                ptr2 = ptr2.next;
            }else{
                ptr2 = head1;
            }
        }

        return ptr1;


    }

    public static void main(String[] args) {


    }
}

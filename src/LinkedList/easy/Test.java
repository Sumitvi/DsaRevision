package LinkedList.easy;

import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {

        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(1);
        ll.add(2);
        ll.add(3); // 2 index
        ll.add(4);
        ll.add(5);

        System.out.println(ll);
        System.out.println(ll.size());
        System.out.println(ll.get(2));
        

    }
}

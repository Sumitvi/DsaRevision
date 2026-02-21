package arrays.basic;

import java.util.HashMap;
import java.util.HashSet;

public class RemoveDuplicate {

    public static void main(String args[]){

//        Remove Duplicates from Sorted Array

        int arr[] = {0,0,1,1,1,2,2,3,3,4};
        HashSet<Integer> set = new HashSet<>();

        for(int data : arr){
            set.add(data);
        }

        System.out.println(set);

    }
}

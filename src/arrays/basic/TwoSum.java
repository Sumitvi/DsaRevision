package arrays.basic;

import java.util.ArrayList;
import java.util.HashMap;

public class TwoSum {

    public static void main(String args[]){

//     using two pointers - Brute Force

        int arr[] = {2,6,5,8,11};
        int target = 14;
//        ArrayList<Integer> res = new ArrayList<>();
//
//        for(int i=0; i<arr.length; i++){
//
//            for(int j=i+1; j<arr.length; j++){
//
//                if(arr[i] + arr[j] == target){
//                    res.add(i);
//                    res.add(j);
//                }
//            }
//        }
//
//        System.out.println(res);

//        using HashMap

        HashMap<Integer , Integer> map = new HashMap<>();

        for(int i=0; i<arr.length; i++){

            int comp = target - arr[i];

            if(map.containsKey(comp)){
                System.out.println("Yes");
                break;
            }else{

                System.out.println("No");
            }

            map.put(arr[i] , i);


        }







    }
}

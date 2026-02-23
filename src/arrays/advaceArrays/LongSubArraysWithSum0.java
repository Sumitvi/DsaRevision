package arrays.advaceArrays;

import java.util.HashMap;

public class LongSubArraysWithSum0 {

    public static void main(String[] args) {

//        longest Subarrays with sum equals to zero
//        BRUTE FORCE
//        int arr[] = {15, -2, 2, -8, 1, 7, 10};
//        int maxLen = 0;
//
//        for(int i=0; i<arr.length; i++){
//            int sum = 0;
//
//            for (int j=i; j<arr.length; j++){
//                sum+=arr[j];
//
//                if(sum == 0){
//                    maxLen = Math.max(maxLen , j-i+1);
//                }
//            }
//        }
//
//        System.out.println("Max Subarrays with sum 0 is : "+ maxLen);

//        OPTIMAL USING PREFIX SUM + HASHMAP
        int arr[] = {15, -2, 2, -8, 1, 7, 10};
        HashMap<Integer, Integer> map = new HashMap<>();
        int prefixSum = 0;
        int maxLen = 0;

        for(int i=0; i<arr.length; i++){
            prefixSum+=arr[i];

            if(map.containsKey(prefixSum)){
                int preInd = map.get(prefixSum);
                int length = i - preInd;
                maxLen = Math.max(maxLen , length);
            }

        }



    }
}

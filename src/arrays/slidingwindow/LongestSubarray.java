package arrays.slidingwindow;

import java.util.HashMap;

public class LongestSubarray {

    public static void main(String args[]){

//        Longest Subarray with Sum K (Positive integers)
        int arr[] = {10, 5, 2, 7, 1, -10};
        int k = 15;

//        Brute Force
//        int count = 0;
//
//        for(int i=0; i<arr.length; i++){
//            int sum = 0;
//
//            for(int j=i; j<arr.length; j++){
//
//                sum+=arr[j];
//
//                if(sum == k){
//                    count = Math.max(count , j-i+1);
//                }
//            }
//        }
//
//        System.out.println(count);

        HashMap<Integer, Integer> map = new HashMap<>();
        int maxLen = 0;
        int prefixSum = 0;


        for(int i=0; i<arr.length; i++){

            prefixSum+=arr[i];

            if(prefixSum == k){
                maxLen = i + 1;
            }

            if(map.containsKey(prefixSum-k)){
                int len = i - map.get(prefixSum - k);
                maxLen = Math
            }

        }
    }
}

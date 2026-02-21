package arrays.twopointers;

import java.util.*;

public class ThreeSumOptimal {

    public static void main(String[] args) {

        int arr [] = {-1,0,1,2,-1,-4};
        int n = arr.length-1;
        Set<List<Integer>> result = new HashSet<>();
        Arrays.sort(arr);


        for(int i=0; i<arr.length; i++){
            int left = i+1;
            int right = n - 1;

            while(left < right){

                int sum = arr[left] + arr[right] + arr[i];

                if(sum == 0){
                   result.add(Arrays.asList(arr[left] , arr[right] , arr[i]));
                   left++;
                   right--;

                }else if(sum < 0){
                    left++;
                }else{
                    right--;
                }
            }
        }

        System.out.println(result);
    }
}

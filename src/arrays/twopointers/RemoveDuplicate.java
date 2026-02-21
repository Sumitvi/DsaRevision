package arrays.twopointers;

import java.util.Arrays;

public class RemoveDuplicate {
    public static void main(String[] args) {

//        Remove Duplicates from Sorted Array II

        int arr[] = {1,1,1,2,2,3};

        if(arr.length <= 2) System.out.println(arr.length);

        int i = 2;

        for(int j=2; j<arr.length; j++){

            if(arr[j] != arr[i-2]){
                arr[i] = arr[j];
                i++;
            }
        }

        System.out.println(Arrays.toString(arr));


    }
}

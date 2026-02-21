package arrays.twopointers;

import java.util.ArrayList;

public class ThreeSum {

    public static void main(String[] args) {

//        3 Sum
        int arr [] = {-1,0,1,2,-1,-4};
        ArrayList<Integer> res = new ArrayList<>();


//        Brute Force
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                for(int k = j+1; k<arr.length; k++){

                    if(arr[i] + arr[j] + arr[k] == 0){
                        res.add(arr[i]);
                        res.add(arr[j]);
                        res.add(arr[k]);
                        break;
                    }
                }
            }
        }

        System.out.println(res);
    }
}

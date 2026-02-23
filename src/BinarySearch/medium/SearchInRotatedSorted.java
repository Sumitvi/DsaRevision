package BinarySearch.medium;

import java.util.HashMap;
import java.util.Map;

public class SearchInRotatedSorted {
    public static void main(String[] args) {

//
        int arr[] = {1,1,2,3,3,4,4,8,8};
        HashMap<Integer, Integer> map = new HashMap<>();
//      i can do using HashMap by storing freq if ele found freq 1 then it is a ans

        for(int i=0; i<arr.length; i++){
            map.put(arr[i] , map.getOrDefault(arr[i] , 0) + 1);
        }

        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            if(entry.getValue()==1){
                System.out.println(entry.getKey());
            }
        }


    }
}

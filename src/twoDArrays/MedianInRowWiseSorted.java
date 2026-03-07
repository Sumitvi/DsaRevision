package twoDArrays;

import java.util.ArrayList;
import java.util.Collections;

public class MedianInRowWiseSorted {

    public static void main(String[] args) {

        int mat[][] = {{1, 3, 5},
                       {2, 6, 9},
                       {3, 6, 9}};

        System.out.println(median(mat));

    }


    static int median(int arr[][]){

        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                    list.add(arr[i][j]);
            }

        }

        Collections.sort(list);
        int mid = list.size()/2;
        return list.get(mid);
    }
}

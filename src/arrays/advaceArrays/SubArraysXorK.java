package arrays.advaceArrays;

public class SubArraysXorK {
    public static void main(String args[]){

//        BRUTE FORCE
        int arr[] = {4, 2, 2, 6, 4};
        int k = 6;
        int res = 0;

        for(int i=0; i<arr.length; i++){
            int preXor = 0;

            for(int j=i; j<arr.length; j++){

                preXor = preXor ^ arr[j];

                if(preXor == k){
                    res++;
                }
            }
        }


    }
}

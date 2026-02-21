package arrays.basic;

public class CheckArraySorted {
    public static void main(String args[]){

//        Check if Array is Sorted
       int arr[] = {10, 20, 30, 240, 50};
//        need to return true or false

        boolean assending = true;

       for(int i=0; i<arr.length-1; i++){
           if(arr[i] > arr[i+1]){
               assending = false;
           }
       }

        System.out.println(assending);

    }
}

package BinarySearch.foundation;

public class LowerBound {
    public static void main(String[] args) {

//        Given a sorted array arr[] and a number target,
//        find the lower bound of the target in this given array.
//        The lower bound of a number is defined as the smallest index
//        in the sorted array where the element is greater than or equal to the target.
//        Note: If all the elements in the given array are
//        smaller than the target, the lower bound will be the length of the array.
        int arr[] = {2, 3, 7, 10, 11, 11, 25};
        int target = 9;
//        boolean found = false;
//
////        using linear Search
//        for(int i=0; i<arr.length; i++){
//            if(arr[i] >= target){
//                System.out.println("Lower Bound Index : "+ i);
//                found = true;
//                break;
//            }
//        }
//
//
//        if(!found){
//            System.out.println("The Length of Array : "+arr.length);
//        }

//        Using Binary Search
        int start = 0 , end = arr.length-1;
        boolean found = false;

        while(start <= end){
            int mid = start + (end - start)/2;

            if(arr[mid] >= target){
                
            }
        }
    }
}

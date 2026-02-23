package BinarySearch.foundation;

public class SearchX {
    public static void main(String[] args) {

//        Search X in Sorted Array
//        Binary Search Works only on Sorted Arrays
        int arr[] = {-1,0,3,5,9,12};
        int target = 9;
        int start = 0 , end = arr.length-1;

        while(start <= end){

            int mid = start + (end - start)/2;

            if(arr[mid] == target){
                System.out.println(mid);
                break;
            }else if(arr[mid] < target){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }



    }
}

package BinarySearch.foundation;

public class OccurOfEle {

    public static void main(String[] args) {

//        Count Occurrences in Sorted Array
        int arr[] = {2, 2 , 3 , 3 , 3 , 3 , 4};
        int x = 3;
        int count = 0;

        /*Brute Force Approach */
       /* for(int i=0; i<arr.length; i++){
            if(arr[i]==x){
                count++;
            }
        }

        System.out.println("Occurs of Element is :"+ count);*/

        int start = 0 , end = arr.length-1;
        int ans = -1;


        while(start <= end){
            int mid = start + (end - start)/2;

            if(arr[mid] == x){
                ans = mid;
                end = mid - 1;
            }else if(arr[mid] < x){
                start = mid + 1;
            }else {
                end = mid - 1;
            }
        }

        System.out.println(ans);

    }
}

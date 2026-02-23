package BinarySearch.foundation;

public class OccurOfEle {

    public static void main(String[] args) {

//        Count Occurrences in Sorted Array
        int arr[] = {2, 2 , 3 , 3 , 3 , 3 , 4};
        int x = 3;
        int count = 0;

        for(int i=0; i<arr.length; i++){
            if(arr[i]==x){
                count++;
            }
        }

        System.out.println("Occurs of Element is :"+ count);
    }
}

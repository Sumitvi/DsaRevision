package arrays.basic;

public class SecondLarge {

    public static void main(String args[]){

//        Second Largest Element in Array
//        to find second largest i need to find max
//        then if (arr[i]>secondMax && arr[i] < max)

        int arr[] = {2,6,5,8,11};
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }

        System.out.println(max);

    }
}

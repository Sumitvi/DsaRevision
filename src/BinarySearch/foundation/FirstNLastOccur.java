package BinarySearch.foundation;

public class FirstNLastOccur {
    public static void main(String[] args) {

//        Print First and Last Occurance
        int arr[] = {3, 4, 13, 13, 13, 20, 40};
        int target = 13;

//        simple approach the first occur can be find by
//        using starting for loop & ending for loop

//        For First Occurance
        for(int i=0; i<arr.length; i++){
            if(arr[i]==target){
                System.out.println("First Occur Index is : "+ i);
                break;
            }
        }

        for(int i=arr.length-1; i>0; i--){
            if(arr[i]==target){
                System.out.println("Last Occur Index is : "+ i);
                break;
            }
        }


    }
}

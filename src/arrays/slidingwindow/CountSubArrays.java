package arrays.slidingwindow;

public class CountSubArrays {

    public static void main(String[] args) {

//        Count Subarrays with Given Sum

        int arr[] = {10, 2, -2, -20, 10};
        int k = -10;
        int count = 0;


//        Brute Force
        for(int i=0; i<arr.length; i++){
            int sum = 0;

            for(int j=i; j<arr.length; j++){
                sum+=arr[j];

                if(sum == k){
                    count++;
                }
            }

        }

        System.out.println("No of Subarrays is " + count);
    }
}


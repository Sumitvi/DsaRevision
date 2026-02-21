package arrays.slidingwindow;

public class MaxSumSubArrays {

    public static void main(String[] args) {

//        Maximum Sum Subarray of Size K
        int arr [] = {100, 200, 300, 400};
        int k = 2;
        int sum = 0;
        int left = 0;
        int right = k-1;

        for(int i=0; i<=right; i++){
            sum+=arr[i];
        }

        int maxSum = sum;

        while(right < arr.length - 1){
            sum = sum - arr[left];
            left++;
            right++;
            sum = sum + arr[right];
            maxSum = Math.max(maxSum , sum);
        }

        System.out.println(maxSum);

    }
}

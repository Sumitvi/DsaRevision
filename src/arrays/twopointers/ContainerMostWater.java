package arrays.twopointers;

public class ContainerMostWater {

    public static void main(String[] args) {

//        Container With Most Water

        int arr[] = {1,8,6,2,5,4,8,3,7};
        int left = 0 , right = arr.length-1;
        int res = 0;

        while(left < right){

            int water = Math.min(arr[left] , arr[right]) * (right - left);
            res = Math.max(res , water);

            if(arr[left] < arr[right]){
                left+=1;
            }

        }

    }
}

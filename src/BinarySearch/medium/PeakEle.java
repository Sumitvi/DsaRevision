package BinarySearch.medium;

public class PeakEle {

    public static void main(String[] args) {

//        Find Peak Element
        int arr[] = {1, 2, 4, 5, 7, 8, 3};
//        i need to find the index of peak element
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            boolean left = true;
            boolean right = true;

            // Check for element to the left
            if (i > 0 && arr[i] <= arr[i - 1])
                left = false;

            // Check for element to the right
            if (i < n - 1 && arr[i] <= arr[i + 1])
                right = false;

            // If arr[i] is greater than its left as well as
            // its right element, return its index
            if (left && right) {
                System.out.println(i);
                break;
            }
        }
        System.out.println("-1");
    }
}

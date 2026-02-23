package BinarySearch.medium;

public class Sqrt {
    public static void main(String[] args) {

//        Find Square Root of a Number
        int x = 28;
        int start = 0;
        int end = x;
        int ans = 0;

        while(start <= end){

            int mid = start + (end - start)/2;
            int square = mid * mid;

            if(square == x){
                System.out.println(mid);
                break;
            }else if(square < x){
                ans = mid;
                start = mid + 1;
            }else {
                end = mid - 1;
            }

        }

        System.out.println(ans);
    }
}

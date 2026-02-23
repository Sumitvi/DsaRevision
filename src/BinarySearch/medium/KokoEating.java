package BinarySearch.medium;

public class KokoEating {
    public static void main(String[] args) {

        int piles [] = {3,6,7,11};
        int h = 8;
        int minSpeed = 1;
        int maxSpeed = 0;

        



    }
}

//Brute Force
class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        int max = Integer.MIN_VALUE;

        for(int pile : piles){
            max = Math.max(max , pile);
        }

        for(int k=1; k<=max; k++){
            int hours = 0;

            for(int pile : piles){
                hours+=(pile + k - 1)/k;
            }

            if(hours <= h){
                return k;
            }
        }

        return -1;


    }
}
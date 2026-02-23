package BinarySearch.medium;

public class KokoEating {
    public static void main(String[] args) {

        int piles [] = {3,6,7,11};
        int h = 8;
        int minSpeed = 1;
        int maxSpeed = 0;

        for(int i=0; i<piles.length; i++){
            maxSpeed = Math.max(maxSpeed , piles[i]);
        }

        while (minSpeed < maxSpeed){
            int mid = minSpeed + (maxSpeed - minSpeed)/2;

            if(ICanEat(piles , h , mid)){
                maxSpeed = mid;
            }else{
                minSpeed = mid + 1;
            }
        }

        System.out.println("Max Speed is "+ maxSpeed);


    }

    public static boolean ICanEat(int piles[], int h, int speed){
        int hours = 0;

        for(int pile : piles){
            hours+=(int) Math.ceil((double) pile/speed);
        }
        return hours<=h;
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
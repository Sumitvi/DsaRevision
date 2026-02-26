package String.medium;

public class LongestPalindromeSubstring {
    public static void main(String[] args) {


    }

    static boolean isPalindrome(String s , int i , int j){

        while(i < j){
            char ch1 = s.charAt(i);
            char ch2 = s.charAt(j);

            if(ch1 != ch2){
                return false;
            }
            i++;
            j--;
        }

        return true;
    }
}

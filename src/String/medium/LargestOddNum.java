package String.medium;

public class LargestOddNum {
    public static void main(String[] args) {

        String s = "504";
        System.out.println(maxOdd(s));

    }

    static String maxOdd(String s){
        int n = s.length();

        for(int i=n-1; i>=0; i--){
            if(s.charAt(i)!=0){
                return s.substring(0 , i+1);
            }
        }

        return " ";
    }
}

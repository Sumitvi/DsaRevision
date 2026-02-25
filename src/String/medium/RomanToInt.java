package String.medium;

public class RomanToInt {
    public static void main(String[] args) {

//         Roman to Integer

    }

    static int getVal(char ch){
        
    }



    static int RomToInt(String s){

        int n = s.length();
        int sum = 0;

        for(int i=0; i<n; i++){

            char ch1 = s.charAt(i);
            if(i < n && getVal(ch1) < getVal(s.charAt(i+1))){
                sum = sum - getVal(ch1);
            }else{
                sum = sum + getVal(ch1);
            }
        }

        return sum;

    }


}

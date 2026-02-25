package String.easy;

import java.util.Arrays;

public class ReverseWord {
    public static void main(String[] args) {

        String s = "the sky is blue";
        System.out.println(RevWord(s));

    }


    static String RevWord(String s){

        String word[] = s.split(" +");
        System.out.println(Arrays.toString(word));
        StringBuilder sb = new StringBuilder();
        int n = word.length;

        for(int i=n-1; i>=0; i--){
            sb.append(word[i]);
            sb.append(" ");
        }

        return sb.toString().trim();

    }
}

package String.easy;

import java.util.Arrays;

public class Anagrams {
    public static void main(String[] args) {

        String s1 = "geeks";
        String s2 = "kseeg";

        if(s1.length()!=s2.length()){
            System.out.println("False");
        }
        /*Output: true
        Explanation: Both the string have same characters with
        same frequency. So, they are anagrams.*/

        char ch1[] = s1.toCharArray();
        char ch2[] = s2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        System.out.println(Arrays.equals(ch1 , ch2));



    }
}

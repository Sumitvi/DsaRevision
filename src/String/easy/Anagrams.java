package String.easy;

import java.util.Arrays;

public class Anagrams {
    public static void main(String[] args) {

        String s1 = "geek";
        String s2 = "kseeg";
        /*Output: true
        Explanation: Both the string have same characters with
        same frequency. So, they are anagrams.*/

        char ch1[] = s1.toCharArray();
        char ch2[] = s2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        



    }
}

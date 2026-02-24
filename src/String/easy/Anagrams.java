package String.easy;

import java.awt.*;
import java.util.Arrays;
import java.util.HashMap;

public class Anagrams {
    public static void main(String[] args) {

        String s1 = "allergy";
        String s2 = "allergyy";

        if(s1.length()!=s2.length()){
            System.out.println("False");
        }
        /*Output: true
        Explanation: Both the string have same characters with
        same frequency. So, they are anagrams.*/

//        char ch1[] = s1.toCharArray();
//        char ch2[] = s2.toCharArray();
//
//        Arrays.sort(ch1);
//        Arrays.sort(ch2);
//
//        System.out.println(Arrays.equals(ch1 , ch2));


//        Using HashMap




    }


    static boolean IsAnagram(String s1 , String s2){
        if(s1.length()!=s2.length()){
            return false;
        }

        HashMap<Character , Integer> map = new HashMap<>();

        for(char ch : s1.toCharArray()){
            map.put(ch , map.getOrDefault(ch , 0) + 1);
        }

        return true;
    }
}

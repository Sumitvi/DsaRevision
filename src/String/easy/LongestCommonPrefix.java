package String.easy;

import java.lang.reflect.Array;
import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) {

//        Longest Common Prefix
        String strs[] = {"flower","flow","flight"};
        Arrays.sort(strs);
//        System.out.println(Arrays.toString(strs));
        String str1 = strs[0];
        String str2 = strs[strs.length-1];
        int i=0;

        while (i<str1.length()){
            if(str1.length() == str2.length()){
                i++;
            }else{
                break;
            }
        }

        System.out.println(str1.substring(0 , i));

            }
}

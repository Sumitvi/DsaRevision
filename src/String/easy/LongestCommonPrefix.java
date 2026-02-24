package String.easy;

import java.lang.reflect.Array;
import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) {

//        Longest Common Prefix
        String strs[] = {"flower","flow","flight"};
        System.out.println(LongestCom(strs));


    }


        public static String LongestCom(String strs[]){

            Arrays.sort(strs);
//        System.out.println(Arrays.toString(strs));
            String str1 = strs[0];
            String str2 = strs[strs.length-1];
            int i=0;

            while (i < str1.length() && i < str2.length()){
                if(str1.charAt(i) == str2.charAt(i)){
                    i++;
                }else{
                    break;
                }
            }

            return i == 0 ? " ": str1.substring(0 , i);

        }
}

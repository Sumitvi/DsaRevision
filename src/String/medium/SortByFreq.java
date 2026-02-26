package String.medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class SortByFreq {
    public static void main(String[] args) {


    }
    static String frequencySort(String s) {
        // code here

        // storing in hashMap by managing freq
        HashMap<Character , Integer > map = new HashMap<>();

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            map.put(ch , map.getOrDefault(ch , 0) + 1);
        }

        List<Character> list = new ArrayList<>(map.keySet());

        Collections.sort(list , (a , b)->{
            int freqCom = map.get(a) - map.get(b);
        }
    })





}

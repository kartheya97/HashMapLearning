package hashmap;

import java.util.*;

public class PrintAllUniqueWordsOfAString {

    public static String[] printUniqueWords(String s){

        //Time Complexity : O(N) , Space Complexity : O(N)
        Map<String, Integer> map = new HashMap<>();
        String strArray[]        = s.split("\\W+");
        for(String str : strArray)
            map.put(str, map.getOrDefault(str, 0) + 1);
        return map.entrySet()
                  .stream()
                  .filter( entry -> entry.getValue() == 1)
                  .map(entry -> entry.getKey())
                  .toArray(String[] ::new);
    }

    public static void main(String[] args){
        System.out.println(Arrays.toString(printUniqueWords("Java is great. Grails is also great")));
    }

}

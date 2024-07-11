package hashmap;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingCharacterOfGivenString {

    public static int returnFirstNonRepeatingCharacter(String str){

        /*
            Time Complexity : O(N) ; Space Complexity : O(1)
         */
        Map<Character,Integer> map = new HashMap<>();
        for(char character : str.toCharArray())
            map.put(character, map.getOrDefault(character, 0) + 1);
        for(int i = 0;i<str.length();i++)
            if(map.get(str.charAt(i)) == 1)
                return i;
        return -1;
    }

    public static void main(String[] args){
       System.out.println( returnFirstNonRepeatingCharacter("aabbccc") );
    }

}

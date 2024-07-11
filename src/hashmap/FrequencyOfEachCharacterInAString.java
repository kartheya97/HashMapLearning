package hashmap;
import java.util.HashMap;
import java.util.Map;

class FrequencyOfEachCharacterInAString{
    /*
    Input: str = “geeksforgeeks”
    Output:
    r 1
    e 4
    s 2
    g 2
    k 2
    f 1
    o 1

    Input: str = “programming”
    Output:
    n 1
    i 1
    p 1
    o 1
    r 2
    a 1
    g 2
    m 2
     */

    public static Map<Character, Integer> returnFrequencyOfEachCharacter(String str){
        /*
            Time  Complexity : O(N)
            Space Complexity : O(1)
         */
        Map<Character, Integer> map = new HashMap<>();
        for(char character : str.toCharArray())
            map.put(character, map.getOrDefault(character, 0) + 1);
        return map;
    }

    public static void main(String[] args){
        System.out.println(returnFrequencyOfEachCharacter("geeksforgeeks"));
    }

}
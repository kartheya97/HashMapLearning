package hashmap;

import java.util.*;

public class FindMissingElementsOfRange {

    public static int[] returnMissingElementsOfRange(int nums[], int low, int high){

        /*
            Time  Complexity : O(N)
            Space Complexity : O(N)
         */
        Map<Integer, Integer>  map = new HashMap<>();
        for(int num : nums)
            map.put(num, 0);
        List<Integer> list = new ArrayList<>();
        while( low  <= high ){
            if(!map.containsKey(low))
                list.add(low);
            low++;
        }
       return list.stream().mapToInt(Integer :: intValue).toArray();

    }

    public static void main(String[] args){

        int arr[] = {10, 12, 11, 15};
        int low = 10, high = 15;
        System.out.println(Arrays.toString(returnMissingElementsOfRange(arr, low, high)));

    }

}

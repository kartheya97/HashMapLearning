package hashmap;

import java.util.HashSet;
import java.util.Set;

public class CountDistinctElementsInAnArray {

    public static int returnDistinctCount(int arr[]){
        //Time Complexity : O(N), Space Complexity : O(N)
        Set<Integer> set = new HashSet<>();
        for(int num : arr)
            set.add(num);
        return set.size();
    }

    public static void main(String[] args){
        int arr[] = {10, 20, 20, 10, 20};
        System.out.println(returnDistinctCount(arr));
    }

}

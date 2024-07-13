package hashmap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PairWithGivenSum {

    public static boolean isPairWithGivenSumPresent(int nums[], int target){
        /* Time Complexity : O(N2), Space Complexity : O(1)
            for(int i = 0;i<nums.length;i++){
                for(int j = i + 1;j<nums.length;j++){
                    if( nums[i] + nums[j] == target)
                        return true;
                }
            }
            return false;
         */
        //Time Complexity : O(N2), Space Complexity : O(N)
        Set<Integer> set = new HashSet<Integer>();
        for(int num : nums){
           int remainingSum = target - num;
           if(set.contains(remainingSum))
               return true;
           else
               set.add(num);
        }
        return false;
    }

    public static void main(String[] args){
        int arr[] = {0, -1, 2, -3, 1};
        int x= -2;
        System.out.println(isPairWithGivenSumPresent(arr, x));
    }

}

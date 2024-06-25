package hashmap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum1 {

	public static int[] twoSum(int nums[], int target) {
	    /*
	     * Brute Force time complexity : O(N2), Space : O(1)
		for(int i = 0;i<nums.length;i++) {
			for(int j = i+1;j<nums.length;j++) {
				if(nums[i] + nums[j] == target)
					return new int[]{i,j};
			}
		}
		return new int[0];
		*/
		
		/*
		 * Optimal Approach Time Complexity : O(N), Space Complexity : O(1)
		 */
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i = 0;i<nums.length;i++) {
			int remainingSum = target - nums[i];
			if(map.containsKey(remainingSum))
				return new int[] {map.get(remainingSum),i};
			else 
				map.put(nums[i], i);
		}
		return new int[0];
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		int nums[] = {2, 7, 11, 15};
		int target = 9;
		System.out.println(Arrays.toString(twoSum(nums,target)));
		
	}

}

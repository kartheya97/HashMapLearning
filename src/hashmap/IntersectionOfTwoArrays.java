package hashmap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class IntersectionOfTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       /*
        * Time  Complexity : O(N)
        * Space Complexity : O(N)
        */
		int nums1[] = {1,2,2,1};
		int nums2[] = {2,2};
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int num : nums1)
        	map.put(num, map.getOrDefault(num, 0)+1);
        Set<Integer> set = new HashSet<Integer>();
        for(int num : nums2) {
        	if(map.containsKey(num))
        		set.add(num);
        }
		System.out.println(Arrays.toString(set.stream().mapToInt(Integer::intValue).toArray()));
        
		
	}

}

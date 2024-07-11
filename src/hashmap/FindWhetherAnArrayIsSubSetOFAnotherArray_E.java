package hashmap;

import java.util.HashMap;
import java.util.Map;

public class FindWhetherAnArrayIsSubSetOFAnotherArray_E {

	/*
	 * Given two arrays arr1[] and arr2[] of size m and n respectively, 
	 * the task is to determine whether arr2[] is a subset of arr1[]. 
	 * Both arrays are not sorted, and elements are distinct.
	 * 
	 * Input: arr1[] = {11, 1, 13, 21, 3, 7}, arr2[] = {11, 3, 7, 1} 
	 *	Output: Yes
	 * Input: arr1[] = {1, 2, 3, 4, 5, 6}, arr2[] = {1, 2, 4} 
     * Output: Yes
     * 
	 */
	
	public static boolean isSubset(int arr1[],int arr2[]) {
		
		/*
		 * Bruteforce
		  		Arrays.sort(arr1);
				Arrays.sort(arr2);
				for(int i = 0;i<arr2.length;i++) {
					int element = arr2[i];
					for(int j = 0;j<arr1.length;j++) {
							if(element != arr1[i])
								return false;
				}
			}
			return true;
		 */
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int num : arr1)
			map.put(num, 0);
		for(int num : arr2) {
			if(!map.containsKey(num))
				return false;
		}
        return true;		
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr1[] = {11, 1, 13, 21, 3, 7};
		int arr2[] = {11, 3, 7, 1};
		System.out.println(isSubset(arr1, arr2));
		
	}

}

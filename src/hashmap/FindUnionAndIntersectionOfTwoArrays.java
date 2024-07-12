package hashmap;

import java.nio.file.FileSystemNotFoundException;
import java.util.*;

public class FindUnionAndIntersectionOfTwoArrays {

    public static List<int[]> returnUnionAndIntersection(int[] nums1, int[] nums2){

        Map<Integer, Integer>  map = new HashMap<Integer, Integer>();
        for(int num : nums1)
            map.put(num,0);
        for(int num : nums2)
            map.put(num, 0);
        List<int[]> list = new ArrayList<int[]>();
        int unionArray[] = map.entrySet()
                              .stream()
                              .mapToInt(entry-> entry.getKey())
                              .toArray();
        list.add(unionArray);
        map.clear();
        for(int num : nums1)
            map.put(num,0);
        for(int num : nums2)
            if(map.containsKey(num))
                map.put(num,1);
        int intersectionArray[] = map.entrySet()
                                     .stream()
                                     .filter(entry-> entry.getValue() == 1)
                                     .mapToInt(entry -> entry.getKey()).toArray();
        list.add(intersectionArray);
        return list;
    }

    public static void main(String[] args){
        int arr1[] = {7, 1, 5, 2, 3, 6};
        int arr2[] = {3, 8, 6, 20, 7};
        List<int[]> result = returnUnionAndIntersection(arr1, arr2);
        System.out.println("Union = "+ Arrays.toString(result.get(0)));
        System.out.println("Intersection = "+ Arrays.toString(result.get(1)));
    }

}

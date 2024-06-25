package hashmap;

import java.util.Arrays;

public class ValidAnagram {

	public static boolean isValidAnagram(String s, String t) {
		/*
		 * Brute-Force. Time Complexity : O(NLogN) Space Complexity : O(N)
		 * if(s.length() != t.length())
			return false;
		else {
			   char sArray[] = s.toCharArray();
			   char tArray[] = t.toCharArray();
			   Arrays.sort(sArray);
			   Arrays.sort(tArray);
			   for(int i = 0;i<sArray.length;i++)
				   if(sArray[i] != tArray[i])
					   return false;
			   return true;
		}
		 */
		/*
		 * Optimal Approach Time Complexity : O(N) and space Complexity : O(1)
		 */
        int frequency[] = new int[26];
        for(int i = 0;i<s.length();i++)
        	frequency[s.charAt(i) - 'a'] += 1;
        for(int i = 0;i<t.length();i++)
        	frequency[t.charAt(i) - 'a'] -= 1;
        for(int i = 0;i<26;i++) {
        	if(frequency[i] != 0)
        		return false;
        }
        return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println(isValidAnagram("anagram", "nagaram"));
	}

}

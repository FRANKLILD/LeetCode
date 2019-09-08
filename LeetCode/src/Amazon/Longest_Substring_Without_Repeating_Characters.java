package Amazon;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

//Given a string, find the length of the longest substring without repeating characters.
//Example 1:
//
//Input: "abcabcbb"
//Output: 3 
//Explanation: The answer is "abc", with the length of 3. 
//Example 2:
//
//Input: "bbbbb"
//Output: 1
//Explanation: The answer is "b", with the length of 1.
//Example 3:
//
//Input: "pwwkew"
//Output: 3
//Explanation: The answer is "wke", with the length of 3. 
//             Note that the answer must be a substring, "pwke" is a subsequence and not a substring.



public class Longest_Substring_Without_Repeating_Characters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] index = new int[128];
        index[2] = 5;
		System.out.println(index['c']+"");
	}
	
	//my first try
    public int lengthOfLongestSubstring(String s) {
        int chIndex = 0, m = 0;
        String str = "";
        for(int i =0; i < s.length(); i++ ){
            chIndex = str.indexOf(s.charAt(i));
            if(chIndex > -1){
                str = str.substring(chIndex + 1);
            }
            str = str + s.charAt(i);
            m = Math.max(m, str.length());
        }
        return m;
        
    }
    
    //first solution*****************
    
//    To enumerate all substrings of a given string, we enumerate the start and end indices of them. Suppose the start 
//    and end indices are i and j, respectively. Then we have 0<=i<j<=n (here end index j is exclusive by 
//    convention). Thus, using two nested loops with i from 0 to n - 1 and j from i+1 to n, we can enumerate all the substrings of s.
//
//    To check if one string has duplicate characters, we can use a set. We iterate through all the characters in the 
//    string and put them into the set one by one. Before putting one character, we check if the set already contains it. If so, we return false. After the loop, we return true.

//    Time complexity : O(n^3)
    public int lengthOfLongestSubstring1(String s) {
        int n = s.length();
        int ans = 0;
        for (int i = 0; i < n; i++)
            for (int j = i + 1; j <= n; j++)
                if (allUnique(s, i, j)) ans = Math.max(ans, j - i);
        return ans;
    }

    public boolean allUnique(String s, int start, int end) {
        Set<Character> set = new HashSet<>();
        for (int i = start; i < end; i++) {
            Character ch = s.charAt(i);
            if (set.contains(ch)) return false;
            set.add(ch);
        }
        return true;
    }
    
    
    
   //Approach 2: Sliding Window
   // Time complexity : O(2n) = O(n)O(2n)=O(n)
    //Space complexity : O(min(m, n))
        public int lengthOfLongestSubstring2(String s) {
            int n = s.length();
            Set<Character> set = new HashSet<>();
            int ans = 0, i = 0, j = 0;
            //i and j both < n
            while (i < n && j < n) {
                // try to extend the range [i, j]
                if (!set.contains(s.charAt(j))){
                	// i ~ j don't have duplicate character
                	set.add(s.charAt(j++));
                	//j++, move j pointer forward
                    ans = Math.max(ans, j - i);
                    //update max length
                }
                else {
                	// find duplicate value, remove first position in HashSet, HashSet don't have order. but string has, so use charAt() get  
                    set.remove(s.charAt(i++));
                    //after remove. come back to while, check if still have duplicate value
                }
            }
            return ans;
        }

    
    
    //Approach 3: Sliding Window Optimized
        //Time complexity : O(n)O(n). Index jj will iterate nn times.
        //Space complexity (HashMap) : O(min(m, n))O(min(m,n)). Same as the previous approach.
        public static int lengthOfLongestSubstring3(String s) {
            int n = s.length(), ans = 0;
            Map<Character, Integer> map = new HashMap<>(); // current index of character
            // try to extend the range [i, j]
            for (int j = 0, i = 0; j < n; j++) {
                if (map.containsKey(s.charAt(j))) {
                	// a b c b a x 
                	//       b =>   max(map.get(b) = 1, 0)   => i = 1
                	//         a => max(map.get(a) = 0, 1)   => i = 1
                	// find the largest Index of duplicate values
                	// make sure i ~ j don't have duplicate values
                    i = Math.max(map.get(s.charAt(j)), i);
                }

                //get current i - j length and compare with current max
                ans = Math.max(ans, j - i + 1);
                //store j in hashMap, hashMap key is unique, the same key value will be overwritten
                map.put(s.charAt(j), j + 1);
                //go back loop and check new hasMap duplicate with next j++;
                
            }
            return ans;
        }
    
    
//        int[26] for Letters 'a' - 'z' or 'A' - 'Z'
//        int[128] for ASCII
//        int[256] for Extended ASCII
        public static int lengthOfLongestSubstring4(String s) {
            int n = s.length(), ans = 0;
            int[] index = new int[128];
            for (int j = 0, i = 0; j < n; j++) {
            	//don't need to check if charAt(j) exist in Array
            	//if not exist, it will return 0, definitely smaller or equal than i, don't influent result
            	//if exist, get the same value index, compare with current largest i, choose the largest one 
                i = Math.max(index[s.charAt(j)], i);
                // +1 for " " case or "abcdefg"; 
                // j and i in same value
                // array is empty, so i always 0 
                // j+1 make 0-6 to 1-7, so it delete 0, get total length
                // but for i != 0; 
                ans = Math.max(ans, j - i + 1);
                // j + 1, because add 1 in last step
                index[s.charAt(j)] = j + 1;
            }
            return ans;
        }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    //conclusion:
    
    //Java HashSet
    
//Java HashSet class is used to create a collection that uses a hash table for storage.
//It inherits the AbstractSet class and implements Set interface.

//The important points about Java HashSet class are:
//
//HashSet stores the elements by using a mechanism called hashing.
//HashSet contains unique elements only.
//HashSet allows null value.
//HashSet class is non synchronized.
//HashSet doesn't maintain the insertion order. Here, elements are inserted on the basis of their hashcode.
//HashSet is the best approach for search operations.
//The initial default capacity of HashSet is 16, and the load factor is 0.75.
    
//Difference between List and Set:
//A list can contain duplicate elements whereas Set contains unique elements only.
//
//Hierarchy of HashSet class:
//The HashSet class extends AbstractSet class which implements Set interface. The Set interface inherits Collection and 
    //Iterable interfaces in hierarchical order.
//    
    
    
//  HashMap vs HashTable vs HashSet
//	Https://blog.csdn.net/u011109589/article/details/80535412

}

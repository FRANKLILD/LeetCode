package Amazon;

import java.util.HashMap;
import java.util.Map;

public class Two_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	//Two-pass Hash Table
		//Time complexity : O(n) hash table reduces the look up time to O(1)
		//Space complexity : O(n) hash table space
		public int[] twoSum1(int[] nums, int target) {
		    Map<Integer, Integer> map = new HashMap<>();
		    for (int i = 0; i < nums.length; i++) {
		        map.put(nums[i], i);
		    }
		    for (int i = 0; i < nums.length; i++) {
		        int complement = target - nums[i];
		        //use HashMap method containsKey() => find complement
		        //get() => expect number itself
		        if (map.containsKey(complement) && map.get(complement) != i) {
		            return new int[] { i, map.get(complement) };
		        }
		    }
		    throw new IllegalArgumentException("No two sum solution");
		}
		
		//One-pass Hash Table
		public int[] twoSum2(int[] nums, int target) {
		    Map<Integer, Integer> map = new HashMap<>();
		    for (int i = 0; i < nums.length; i++) {
		        int complement = target - nums[i];
		        //compare with exist hash table, actually, the initial hash table is empty
		        if (map.containsKey(complement)) {
		            return new int[] { map.get(complement), i };
		        }
		        //can't find, put current number in hash table
		        map.put(nums[i], i);
		        //go back loop
		    }
		    throw new IllegalArgumentException("No two sum solution");
		}
		
		
		//Mine
	    public int[] twoSum(int[] nums, int target) {
	        Map<Integer, Integer> map= new HashMap<>();
	        for(int i = 0; i < nums.length; i++){
	            if( map.containsKey(target - nums[i])){
	                return new int[] {map.get(target - nums[i]), i};
	            }
	            map.put(nums[i], i);
	        }  
	        throw new IllegalArgumentException("No two sum solution");
	    }
	    
	    
	    //conclusion
	    
	    
	    // store number in Key, store index in value
	    // Hash Table:  use containsKey, easy way to check
}

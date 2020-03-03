package other;

import java.util.Arrays;

//1365. How Many Numbers Are Smaller Than the Current Number

//Given the array nums, for each nums[i] find out how many numbers 
//in the array are smaller than it. That is, for each nums[i] you have to 
//count the number of valid j's such that j != i and nums[j] < nums[i].
//Return the answer in an array.

//Input: nums = [8,1,2,2,3]
//Output: [4,0,1,1,3]
//Explanation: 
//For nums[0]=8 there exist four smaller numbers than it (1, 2, 2 and 3). 
//For nums[1]=1 does not exist any smaller number than it.
//For nums[2]=2 there exist one smaller number than it (1). 
//For nums[3]=2 there exist one smaller number than it (1). 
//For nums[4]=3 there exist three smaller numbers than it (1, 2 and 2).


//Constraints:
//
//2 <= nums.length <= 500
//0 <= nums[i] <= 100

public class Code1365 {
	//worst solution O(n^2)
//    public static int[] smallerNumbersThanCurrent(int[] nums) {
//        //set inital array with all zero
//        int[] smArray = new int[nums.length];
//        //(O): n *(1 + n)/2
//        for(int i = 0; i < (nums.length - 1); i++){
//            for(int j = i + 1; j < nums.length; j++){
//                if( nums[j] < nums[i] ){
//                    smArray[i] += 1;
//                }
//                else if( nums[j] > nums[i]){
//                    smArray[j] += 1;
//                }
//            }
//        }
//        return smArray;
//    }
    
	//O(NlogN)
//	public int[] smallerNumbersThanCurrent(int[] nums) {
//        int[] numsCopy = Arrays.copyOf(nums, nums.length);
//        Arrays.sort(numsCopy);
//        int[] res = new int[nums.length];
//        for (int i = 0; i < nums.length; i++) {
//            res[i] = binarySearch(numsCopy, nums[i]);
//        }
//        return res;
//    }
//    private int binarySearch(int[] nums, int target) {
//        int l = 0, r = nums.length - 1;
//        while (l < r) {
//            int mid = l + (r - l) / 2;
//            if (nums[mid] < target) l = mid + 1;
//            else r = mid;
//        }
//        return l;
//    }

	//o(N)
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] count = new int[101], presum = new int[101], ans = new int[nums.length];
        
        for(int num : nums) count[num]++;
        
        for(int i = 1; i <= 100; i++) presum[i] = presum[i-1] + count[i-1];
        
        for(int i = 0; i < nums.length; i++) ans[i] = presum[nums[i]];
        
        return ans;
        
    }
    
    
    public static int binarySearch(int[] mArray, int value){
        //set init start, end 
        int start = 0, end = mArray.length - 1, mid;
        
        //compare while loop 
        while(start < end){
           mid = start + (end - start)/2;
           if(mArray[mid] < value){
               start = mid + 1;
           }
           else{
               end = mid;
           }
        }
        
        return start;
    }
	public static void main(String[] args) {
		System.out.print(Arrays.toString(smallerNumbersThanCurrent(new int[]{8,1,2,2,3})));
		 System.out.println(binarySearch(new int[]{1,2,2,3,3,4,5}, 3));
	}
}

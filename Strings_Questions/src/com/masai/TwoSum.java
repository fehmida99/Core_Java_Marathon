package com.masai;
/*Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]

*/


public class TwoSum {
	public int[] twosummethod(int num[],int target) {
		for(int i=0;i<num.length-1;i++) {
			for(int j=i+1;j<num.length;j++) {
				if(num[i]+num[j]==target) {
					// Return indices using separate variables
                    int[] result = new int[2];
                    result[0] = i;
                    result[1] = j;
                    return result;
				}
			}
		}
		// If no solution is found, return an empty array
        return new int[0];
		
	}
	
	
	
public static void main(String[] args) {
	TwoSum ts = new TwoSum();
	int[] nums = {2, 7, 11, 15, 4, 6};
    int target = 10;

    int[] result = ts.twosummethod(nums, target);

    if (result.length == 2) {
        System.out.println("Indices of the two numbers: [" + result[0] + ", " + result[1] + "]");
    } else {
        System.out.println("No solution found.");
    }
	
	
	
}
}

package com.javalearn17.DataStructureAndAlgorithms;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

//Finding Maximum value in each Sliding Window using Deque 

/*Time Complexity: O(n), where n is the length of the array. Each element is added and removed at most once from the deque.

Space Complexity: O(k) for the deque and O(n - k + 1) for the result array.
*/

/*
🔧 How It Works (Step-by-step):

    Iterate through the array.

    Remove indices from the front of the deque that are out of the current window.

    Remove indices from the back of the deque if the current element is greater than elements at those indices (they can't be maximums anymore).

    Add current index to the back of the deque.

    If the window has formed (i.e., i >= k-1), record the maximum, which is always at the front of the deque (nums[deque.peekFirst()]).
*/


public class FindMaxValueEachSlidWindow {

	 public static int[] maxSlidingWindow(int[] nums, int k) {
	        if (nums == null || k <= 0) return new int[0];

	        int n = nums.length;
	        int[] result = new int[n - k + 1];
	        Deque<Integer> deque = new ArrayDeque<>();

	        for (int i = 0; i < n; i++) {
	            
	            while (!deque.isEmpty() && deque.peekFirst() < i - k + 1)
	                deque.pollFirst();

	            // Remove indices of smaller elements from the end
	            while (!deque.isEmpty() && nums[deque.peekLast()] < nums[i])
	                deque.pollLast();

	            
	            deque.offerLast(i);

	            // Add result if window is fully formed
	            if (i >= k - 1)
	                result[i - k + 1] = nums[deque.peekFirst()];
	        }

	        return result;
	    }
	
	public static void main(String[] args) {
		
		int nums[] = {1,3,-1,-3,5,3,6,7};
		int k =3;
		int result[] = maxSlidingWindow(nums,k);
		System.out.println(Arrays.toString(result));
		
	}
}

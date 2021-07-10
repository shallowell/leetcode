package com.shallow.program;

public class MaximumSubarrayImpl {
	public void ReverseIntegerImpl() {
	}

	public int maxSubArray (int[] array) {
		int maxSub = Integer.MIN_VALUE;
		int leftPositive = 0;
		for (int i = 0; i < array.length; i++) {
			maxSub = Math.max(maxSub, leftPositive + array[i]);
			leftPositive = Math.max(0, leftPositive + array[i]);
		}
		return maxSub;
	}
}

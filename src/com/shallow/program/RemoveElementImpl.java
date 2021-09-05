package com.shallow.program;

public class RemoveElementImpl {
	public int removeElement(int[] nums, int val) {
		int newIndex = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != val) {
				nums[newIndex] = nums[i];
				newIndex++;
			}
		}
		return newIndex;
	}
}
package com.shallow.program;

import java.util.HashMap;

public class BinarianImpl {

	public int binarian(int[] A) {
		int powerOf2;
		int minimunArrayLength = A.length;
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int num: A) {
			powerOf2 = (int)Math.pow(2, num);
			while (map.containsKey(powerOf2)) {
				minimunArrayLength--;
				map.remove(powerOf2);
				powerOf2 *= 2;
			}
			map.put(powerOf2, 0);

		}
		return minimunArrayLength;

	}

}

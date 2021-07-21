package com.shallow.program;

public class PalindromeNumberImpl {
	public boolean isPalindrome (int x){ // 13 m sec
		if (x < 0 ) return false;
		int original = x;
		int reversed = 0;
		while (x > 0) {
			reversed *= 10;
			int pop = x % 10;
			reversed += pop;
			x /= 10;
		}
        return original == reversed;
	}

	public boolean isPalindrome2 (int x){ // 13 m sec
		if (x < 0 ) return false;
		StringBuilder sb = new StringBuilder();
		sb.append(Integer.toString(x));
		for (int i =0; i < sb.length() /2; i++ ) {
			if (sb.charAt(i) != sb.charAt(sb.length() - 1 - i)) {
				return false;
			}
		}
		return true;
	}
}

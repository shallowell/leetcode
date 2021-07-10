package com.shallow.program;

public class LengthOfLastWordImpl {


	public int lengthOfLastWord(String str) {
		int count = 0;
		for (String cha: str.split("")) {
			count++;
			if (cha.equals(" ")) count = 0;
		}
		return count;
	}
}

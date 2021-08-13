package com.shallow.program;

public class LongestCommonPrefixImpl {
	public String longestCommonPrefix (String[] strs) {
		StringBuilder commonPrefix = new StringBuilder();
		char charAtIdx;

		for (int idx = 0; idx < strs[0].length(); idx++) { //文字のループ
			charAtIdx = strs[0].charAt(idx);
			for (int j = 0; j < strs.length; j++) { // 配列のループ
				if (strs[j].length() <= idx || charAtIdx != strs[j].charAt(idx)) {
					return commonPrefix.toString();
				}
			}
			commonPrefix.append(charAtIdx);
		}
		return commonPrefix.toString();
	}

	// flower, flow, fly




	public String longestCommonPrefix2 (String[] strs) {
		StringBuilder returnStr = new StringBuilder();
		char tempChar;
		int i = 0;

		while (true) { //文字のループ
			if (strs[0].length() <= i) break;
			tempChar = strs[0].charAt(i);
			for (int j = 0; j < strs.length; j++) { // 配列のループ
				if (strs[j].length() <= i || tempChar != strs[j].charAt(i)) {
					return returnStr.toString();
				}
			}
			returnStr.append(tempChar);
			i++;
		}
		return returnStr.toString();
	}

}

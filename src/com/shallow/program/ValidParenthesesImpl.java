package com.shallow.program;

import org.assertj.core.internal.Iterables;

import java.util.*;

public class ValidParenthesesImpl {
	Map<Character, Character> parenthesesMap = new HashMap<Character, Character>() {
		{put(')','(');}
		{put(']','[');}
		{put('}','{');}
	};
	Stack<Character> stack = new Stack<>();
	Stack<Character> leftList = new Stack<>();


	public boolean isValid (String s) {
		char nextParenthesis;
		for (int i = 0; i < s.length(); i++) {
			nextParenthesis = s.charAt(i);
			if (isLeftParenthesis(nextParenthesis)) { // 左側の括弧の時はStackに追加
				stack.push(nextParenthesis);
				continue;
			}
			if (isCorrectRightParenthesisStack(nextParenthesis)) {
				return false; // 右側の括弧が来て、本来来るべきかっこでなければreturn
			}
		}
		return stack.isEmpty();
	}

	public boolean isValid2 (String s) {
		char nextParenthesis;
		int lastIndexofStack = 0;
		for (int i = 0; i < s.length(); i++) {
			nextParenthesis = s.charAt(i);
			lastIndexofStack  = leftList.size() - 1;
			if (isLeftParenthesis(nextParenthesis)) { // 左側の括弧の時はStackに追加
				leftList.add(nextParenthesis);
				continue;
			}
			if (isCorrectRightParenthesis(lastIndexofStack, nextParenthesis)) {
				return false; // 右側の括弧が来て、本来来るべきかっこでなければreturn
			}
			leftList.remove(lastIndexofStack); //正しいかっこが来たら、stackにある最新のかっこを取り除く
		}
		return leftList.isEmpty();
	}

	private boolean isLeftParenthesis(char nextParenthesis) {
		return !parenthesesMap.containsKey(nextParenthesis);
	}

	private boolean isCorrectRightParenthesis(int lastIndexofStack, char nextParenthesis) {
		return 	lastIndexofStack < 0 || leftList.get(lastIndexofStack) != parenthesesMap.get(nextParenthesis);
	}

	private boolean isCorrectRightParenthesisStack(char nextParenthesis) {
		return 	!stack.isEmpty() || stack.pop() != parenthesesMap.get(nextParenthesis);
	}


}

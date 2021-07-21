package com.shallow.program;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class RomanToIntImpl {
	public int romanToInt(String s) { // 17 m sec
		int sum = 0;
		HashSet<String> usedNumerals = new HashSet<>();
		final HashMap<String, Integer> numeralMap = createNumeralMap();
		for (int i = 0; i < s.length(); i++) {
			String oneLetter = s.substring(i,i + 1);
			sum += numeralMap.get(oneLetter);
			usedNumerals.add(oneLetter);
			switch (oneLetter) {
			case "V":
			case "X":
				if (usedNumerals.contains("I")) sum -= 2; break;
			case "L":
			case "C":
				if (usedNumerals.contains("X")) sum -= 20; break;
			case "D":
			case "M":
				if (usedNumerals.contains("C")) sum -= 200; break;
			}
		}
		return sum;
	}

	private HashMap createNumeralMap() {
		HashMap<String, Integer> numeralMap = new HashMap<>();
		numeralMap.put("I", 1);
		numeralMap.put("V", 5);
		numeralMap.put("X", 10);
		numeralMap.put("L", 50);
		numeralMap.put("C", 100);
		numeralMap.put("D", 500);
		numeralMap.put("M", 1000);
		return numeralMap;
	}

	public int romanToInt1(String s) { // 17 m sec
		int sum = 0;
		HashSet<String> usedNumerals = new HashSet<>();
		final HashMap<String, Integer> numeralMap = createNumeralMap();
		for (String romanNumeral :s.split("")) {
			sum += numeralMap.get(romanNumeral);
			usedNumerals.add(romanNumeral);
			switch (romanNumeral) {
			case "V":
			case "X":
				if (usedNumerals.contains("I")) sum -= 2; break;
			case "L":
			case "C":
				if (usedNumerals.contains("X")) sum -= 20; break;
			case "D":
			case "M":
				if (usedNumerals.contains("C")) sum -= 200; break;
			}
		}
		return sum;
	}

	public int romanToInt2(String s) { //16 m sec
		int sum = 0;
		HashSet<String> set = new HashSet<>();
		for (int i = 0; i < s.length(); i++) {
			switch (s.substring(i,i+1)) {
			case "I":
				sum ++;
				break;
			case "V":
				sum += 5;
				if (set.contains("I")) {
					sum -= 2;
				}
				break;
			case "X":
				sum += 10;
				if (set.contains("I")) {
					sum -= 2;
				}
				break;
			case "L":
				sum += 50;
				if (set.contains("X")) {
					sum -= 20;
				}
				break;
			case "C":
				sum += 100;
				if (set.contains("X")) {
					sum -= 20;
				}
				break;
			case "D":
				sum += 500;
				if (set.contains("C")) {
					sum -= 200;
				}
				break;
			case "M":
				sum += 1000;
				if (set.contains("C")) {
					sum -= 200;
				}
				break;
			}
			set.add(s.substring(i,i+1));
		}
		return sum;
	}
}

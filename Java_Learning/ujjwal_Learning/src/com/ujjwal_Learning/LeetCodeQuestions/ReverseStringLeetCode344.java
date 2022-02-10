package com.ujjwal_Learning.LeetCodeQuestions;

public class ReverseStringLeetCode344 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char[]	s = {'h','e','l','l','o'};
		reverseString(s);
		System.out.println(new String(s));
	}

	public static void reverseString(char[] s) {
		int i = 0;
		int j = s.length - 1;

		while (i < j) {

			swap(s, i, j);
			i++;
			j--;
		}

		return;

	}

	public static void swap(char[] s, int i, int j) {
		char t = s[i];
		s[i] = s[j];
		s[j] = t;
	}

}

package com.ujjwal_Learning.stack;

import java.util.Stack;

public class RemoveKDigitLeetcode402 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public String removeKdigits1(String num, int k) {
		int len = num.length();
		if (k == 0)
			return num;
		if (k == len)
			return "0";

		Stack<Character> stack = new Stack<>();
		int index = 0;

		while (index < len) {
			while (k > 0 && !stack.isEmpty() && stack.peek() > num.charAt(index)) {
				stack.pop();
				k--;
			}
			stack.push(num.charAt(index++));
		}
		while (k-- > 0)
			stack.pop();

		String smallest = "";
		while (!stack.isEmpty())
			smallest = stack.pop() + smallest;

		// delete leading zeros
		while (smallest.length() > 1 && smallest.charAt(0) == '0')
			smallest = smallest.substring(1);

		return smallest;
	}
	
	public static String removeKdigits(String num, int k) {
        
        int len = num.length();
        if (k == len){
            return "0";
        } 
        
        Stack<Character> stack = new Stack<>();
        int i = 0;
        while (i < num.length()) {
            while (k > 0 && !stack.isEmpty() && stack.peek() > num.charAt(i)) {
                stack.pop();
                k--;
            }
            stack.push(num.charAt(i));
            i++;
        }
        
        while (k > 0) {
            stack.pop();
            k--;
        }
        
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        sb.reverse();
        
        while (sb.length() > 1 && sb.charAt(0) == '0') {
            sb.deleteCharAt(0);
        }
        
        return sb.toString();
    }
}

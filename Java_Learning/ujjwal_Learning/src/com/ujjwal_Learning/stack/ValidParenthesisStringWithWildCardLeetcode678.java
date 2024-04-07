package com.ujjwal_Learning.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class ValidParenthesisStringWithWildCardLeetcode678 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public boolean checkValidString(String s) {
		Deque<Character> stk = new ArrayDeque<>();
		int scount = 0;
		for (char c : s.toCharArray()) {
			if (c == '(')
				stk.push(c);
			else {
				if (c == ')' && !stk.isEmpty())
					stk.pop();
				else if (c == ')' && scount > 0)
					scount--;
				else if (c == ')')
					return false;
				else {
					scount++;
					if (!stk.isEmpty()) {
						stk.pop();
						scount++;
					}
				}
			}
		}
		return stk.isEmpty();
	}

}

package com.ujjwal_Learning.maths;

import java.util.LinkedList;
import java.util.Queue;

public class NumberOfStudentsUnableToEatLunchLeetcode1700 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int countStudents(int[] A, int[] B) {
		int count[] = { 0, 0 }, n = A.length, k;
		for (int a : A)
			count[a]++;
		for (k = 0; k < n && count[B[k]] > 0; ++k)
			count[B[k]]--;
		return n - k;
	}

	public static int countStudents1(int[] students, int[] sandwiches) {
		Queue<Integer> student = new LinkedList();
		Queue<Integer> sandwich = new LinkedList();
		for (int i : students)
			student.offer(i);
		for (int i : sandwiches)
			sandwich.offer(i);
		int count = 0;
		while (true) {
			if (student.peek() == sandwich.peek()) {
				student.poll();
				sandwich.poll();
				count = 0;
			} else if (student.peek() != sandwich.peek()) {
				int s = student.poll();
				student.offer(s);
				count++;
			}
			if (student.isEmpty() || count >= student.size())
				break;
		}
		return student.size();
	}

}

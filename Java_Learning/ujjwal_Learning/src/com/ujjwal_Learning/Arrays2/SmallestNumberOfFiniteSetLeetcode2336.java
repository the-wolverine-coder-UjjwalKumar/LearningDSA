package com.ujjwal_Learning.Arrays2;

import java.util.PriorityQueue;

public class SmallestNumberOfFiniteSetLeetcode2336 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	PriorityQueue<Integer> queue;
    int current;

    public SmallestNumberOfFiniteSetLeetcode2336() {
        queue = new PriorityQueue<>();
        current = 1;
    }

    public int popSmallest() {
        int result = current;

        if (!queue.isEmpty() && queue.peek() < current)
            result = queue.poll();
        else
            current++;

        while (!queue.isEmpty() && queue.peek() == result)
            queue.poll();

        return result;
    }

    public void addBack(int num) {
        queue.add(num);
    }

}

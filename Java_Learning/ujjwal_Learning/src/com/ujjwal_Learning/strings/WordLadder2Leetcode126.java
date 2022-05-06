package com.ujjwal_Learning.strings;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class WordLadder2Leetcode126 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
		List<List<String>> result = new ArrayList<>();

		Set<String> hs = new HashSet<>();

		for (String word : wordList) {
			hs.add(word);
		}

		Queue<List<String>> queue = new LinkedList<>();
		List<String> temp = new ArrayList<>();
		temp.add(beginWord);
		queue.offer(temp);

		while (!queue.isEmpty()) {
			int size = queue.size();
			Set<String> eligibleToRemove = new HashSet<>();

			for (int i = 0; i < size; i++) {
				List<String> currList = queue.poll();
				String currWord = currList.get(currList.size() - 1);

				if (currWord.equals(endWord)) {
					result.add(new ArrayList<>(currList));
				}

				List<String> neighbours = findAllNeighbours(currWord, hs);
				for (String neighbour : neighbours) {
					currList.add(neighbour);
					queue.offer(new ArrayList<>(currList));
					currList.remove(currList.size() - 1);
					eligibleToRemove.add(neighbour);
				}
			}

			for (String word : eligibleToRemove) {
				hs.remove(word);
			}
		}

		return result;
	}

	private List<String> findAllNeighbours(String word, Set<String> hs) {

		char[] wordChar = word.toCharArray();
		List<String> neighbours = new ArrayList<>();

		for (int i = 0; i < wordChar.length; i++) {
			char ch = wordChar[i];

			for (char character = 'a'; character <= 'z'; character++) {
				wordChar[i] = character;
				String eligibleNeighbour = new String(wordChar);
				if (hs.contains(eligibleNeighbour) && character != ch)
					neighbours.add(eligibleNeighbour);
			}

			wordChar[i] = ch;
		}

		return neighbours;
	}

}

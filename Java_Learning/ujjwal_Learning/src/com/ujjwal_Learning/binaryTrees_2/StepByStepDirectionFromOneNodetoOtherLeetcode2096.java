package com.ujjwal_Learning.binaryTrees_2;

public class StepByStepDirectionFromOneNodetoOtherLeetcode2096 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	private boolean DFS(TreeNode currNode, StringBuilder path, int destVal) {
		if (currNode == null)
			return false;
		if (currNode.val == destVal)
			return true;
		if (DFS(currNode.left, path, destVal))
			path.append("L");
		else if (DFS(currNode.right, path, destVal))
			path.append("R");
		return path.length() > 0;
	}

	public String getDirections(TreeNode root, int startValue, int destValue) {
		StringBuilder startToRoot = new StringBuilder();
		StringBuilder endToRoot = new StringBuilder();

		DFS(root, startToRoot, startValue);
		DFS(root, endToRoot, destValue);

		int i = startToRoot.length(), j = endToRoot.length();
		int cnt = 0;
		while (i > 0 && j > 0 && startToRoot.charAt(i - 1) == endToRoot.charAt(j - 1)) {
			cnt++;
			i--;
			j--;
		}

		//String sPath = "U".repeat(startToRoot.length() - cnt);
		String sPath = "";
		String ePath = endToRoot.reverse().toString().substring(cnt, endToRoot.length());

		return sPath + ePath;
	}
}

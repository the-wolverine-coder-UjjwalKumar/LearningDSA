package com.ujjwal_Learning.BinaryTrees;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Booleantreeleetcode2331 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static boolean evaluateTree(TreeNode root) {
        Map<Integer,String> operations = new HashMap<>();
        operations.put(0,"FALSE");
        operations.put(1,"TRUE");
        operations.put(2,"OR");
        operations.put(3,"AND");

        String ans = evaluateBoolean(root, operations);
        if (Objects.nonNull(ans)) {
            return ans.equalsIgnoreCase("TRUE");
        }

        return false;

    }

    private static String evaluateBoolean(TreeNode root, Map<Integer, String> operations) {

        String left = null;
        String right = null;

        if (root.left==null && root.right==null){
            return operations.get(root.val);
        }

        if (root.left!=null)
            left = evaluateBoolean(root.left, operations);

        if (root.right!=null)
            right = evaluateBoolean(root.right, operations);
        
        if (Objects.nonNull(left) && Objects.nonNull(right)) {
            boolean leftBoolValue = false;
            boolean rightBoolValue = false;
            boolean result = false;
            
            if (left.equalsIgnoreCase("TRUE"))
                leftBoolValue = true;


            if (right.equalsIgnoreCase("TRUE"))
                rightBoolValue = true;

            if (root.val==2) {
                result =  leftBoolValue || rightBoolValue;
            } else if (root.val==3) {
                result =  leftBoolValue && rightBoolValue;
            }

            if (result){
                return "TRUE";
            } else {
                return "FALSE";
            }
        }
        return null;
    }
}

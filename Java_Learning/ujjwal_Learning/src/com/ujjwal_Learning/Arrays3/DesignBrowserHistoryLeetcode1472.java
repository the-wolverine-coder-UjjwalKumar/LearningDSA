package com.ujjwal_Learning.Arrays3;

import java.util.HashMap;
import java.util.Map;

public class DesignBrowserHistoryLeetcode1472 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	Map<Integer,String> map;
    int current,max;
    public DesignBrowserHistoryLeetcode1472(String homepage) {
        current=max=1;
        map = new HashMap<>();
        map.put(current,homepage);
    }

    public void visit(String url) {
        current++;
        map.put(current,url);
        max= current;
    }

    public String back(int steps) {
        current = Math.max(current -steps,1);
        return map.get(current);
    }

    public String forward(int steps) {
        current =Math.min(current +steps,max);
        return map.get(current);
    }
}

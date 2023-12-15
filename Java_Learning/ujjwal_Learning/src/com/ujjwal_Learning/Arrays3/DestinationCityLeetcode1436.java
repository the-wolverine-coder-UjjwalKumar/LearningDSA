package com.ujjwal_Learning.Arrays3;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DestinationCityLeetcode1436 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public String destCity(List<List<String>> paths) {
		Set<String> cities = new HashSet<>();
		for (List<String> path : paths) {
			cities.add(path.get(0));
		}

		for (List<String> path : paths) {
			String dest = path.get(1);
			if (!cities.contains(dest)) {
				return dest;
			}
		}
		return "";
	}

}

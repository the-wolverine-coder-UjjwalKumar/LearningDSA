package com.ujjwal_Learning.binarySearch;

import java.util.Arrays;

public class NumberOfBoatsLeetcode881 {
  
  public static void main(String[] args) {
    // TODO: add inputs
	  int[] people = {3,2,2,1};
	  int limit = 3;
	  System.out.println(numRescueBoats(people, limit));
  }

  public static int numRescueBoats(int[] people, int limit) {
        int boatCount = 0;
        Arrays.sort(people);
        
        int left = 0;
        int right = people.length - 1;
        
        while(left <= right){
            int sum = people[left] + people[right];
            if(sum <= limit){
                boatCount++;
                left++;
                right--;
            }
            else{
                boatCount++;
                right--;
            }
        }
        return boatCount;
    }


}

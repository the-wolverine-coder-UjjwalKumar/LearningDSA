package com.ujjwal_Learning.Arrays3;

public class FindKBeautyOfNumberLeetcode2269 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 240;
		int k = 2;
		System.out.println(divisorSubstrings(num, k));
	}
	
	public static int divisorSubstrings(int num, int k) {
        Integer numI = num;
        int counter=0;
        String numS = numI.toString();

        for(int i = 0; i <= numS.length()-k; i++){
            int startIndex = i;
            int endIndex = i+k;

            String ss = numS.substring(startIndex, endIndex);
            Integer ssI = Integer.valueOf(ss);
            	
            if(ssI!=0 && num%ssI==0) counter++;
        }
        return counter;
    }

}

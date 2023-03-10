package com.ujjwal_Learning.Arrays3;

public class CalculateMoneyInLeetcodeBank1716 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(totalMoney(10));
	}
	
	public static int totalMoney(int n) {
        int[] dayInvestment = new int[8];

        dayInvestment[0] = -1;
        int temp = n;
        int ans = 0;

        
        for (int i = 1; i <= Math.min(n, 7) ; i++) {
            dayInvestment[i] = i;
            ans+=i;
        }

        if (n > 7) {
            while (temp!=0) {
                if (temp <= 7) {
                    for (int i = 1; i <= Math.min(temp, 7); i++) {
                        dayInvestment[i] += 1;
                        ans+=dayInvestment[i];
                    }
                }

                temp = temp%7;
            }
        }
            
        return ans;
        
        
       
    }
	
	public int totalMoney1(int n) {
        int ans = 0; 
        int s = 1;
        
        while (n > 0) {
            for (int i = 0; i < 7 && n-- > 0; ++i) ans += s + i;
            s++;
        }
            
        return ans;
       
    }

}

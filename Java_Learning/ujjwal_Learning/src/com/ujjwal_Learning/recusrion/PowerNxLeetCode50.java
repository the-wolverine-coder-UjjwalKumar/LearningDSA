package com.ujjwal_Learning.recusrion;

public class PowerNxLeetCode50 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	// added myPow function 
	public double myPow(double x, int n) {
        if(n>=0)
            return positive(x,n);
        else 
            return negative(x,n);
    }
    
	
	// added pow function with -ve powers
    private double negative(double x, int n)
    {
        if(n==-1)
            return 1/x;
            
        double smallOutput=myPow(x,n/2);
        if(n%2==0)
        return smallOutput*smallOutput;
        else
        return (1/x)*smallOutput*smallOutput;
    }
    
    private double positive(double x, int n)
    {
        if(n==0)
            return 1;
        
        double smallOutput=myPow(x,n/2);
        if(n%2==0)
        return smallOutput*smallOutput;
        else
        return x*smallOutput*smallOutput;    
    }
}

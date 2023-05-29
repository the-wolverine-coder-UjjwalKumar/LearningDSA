package com.ujjwal_Learning.Games;

public class DesignParkingLotLeetcode1603 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	int[] count;
    public DesignParkingLotLeetcode1603(int big, int medium, int small) {
        count = new int[]{big, medium, small};
    }

    public boolean addCar(int carType) {
        return count[carType - 1]-- > 0;
    }

}

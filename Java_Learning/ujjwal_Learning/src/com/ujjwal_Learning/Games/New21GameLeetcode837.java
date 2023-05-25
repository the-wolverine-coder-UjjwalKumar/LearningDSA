package com.ujjwal_Learning.Games;

public class New21GameLeetcode837 {
	
	public static void main(String[] args) {
		
	}
	
	public double new21Game(int N, int K, int W) {
        if (N >= K + W - 1)
            return 1.0;

        double[] p = new double[N + 1];

        // p[i] = probability of being able to sum up to i
        // eg:
        // W = 5 i.e cards = 1, 2, 3, 4, 5
        // 1/W = probability of picking any one of the above to make sum = i
        // p[3] = (p[2] + p[1] + p[0]) * 1/W
        // if we look closely here we will be either picking 1, 2 or 3 to make our
        // sum 3 for p[2] will pick 1, for p[1] pick 2 and p[0] pick 3. Cannot go
        // for the whole range till 5 because p[3 - 3] is the last number in the
        // range that has a probability
        // Similarly
        // p[6] = (p[5] + p[4] + p[3] + p[2] + p[1]) * 1/W
        // lets say we have K = 7 and N = 10 in that case
        // for i <= K
        // p[i] = (p[i - 1] + p[i - 2] + p[i - 3] + ... p[i - W]) * 1 / W
        // If we look closely here we are kind of moving in a sliding window
        // for eg. for p[6] the sum of previous numbers will be 
        // p[5] + p[4] + p[3] + p[2] + p[1]
        // and for p[7] previous sum will be
        // p[6] + p[5] + p[4] + p[3] + p[2]
        // we only need the sum of numbers within the range W before i
        // therefore we added p[7 - 1] = p[6] and removed p[7 - 1 - W] = p[6 - 5] = [1]
        p[0] = 1.0;

        double prev = 0.0;
        // for all i <= k
        for (int i = 1; i <= K; i++) {
            // add previously calculated p and remove last element
            // in prev which will be out of the window if it exits
            // eg for i = 6, add p[5] to running sum and remove
            // p[5 - W] since i = 6, p[6 - 1 - W]
            prev += p[i - 1] - ((i - W - 1) >= 0 ? p[i - 1 - W]: 0);
            p[i] = prev * 1 / (W * 1.0);
        }

        double res = p[K];
        // for all i > K
        // Also notice here
        // consider the same eg W = 5, K = 7, N = 10
        // sum for p[8] = p[7] + p[6] + p[5] + p[4] + p[3]
        // sum for p[9] = p[7] + p[6] + p[5] + p[4]
        // sum for p[10] = p[7] + p[6] + p[5]
        // we do not add up the values of p[9] and p[8]
        // Which means we stop at p[9] or p[8] if we ever pick
        // 2 after having sum = 6 or 3 after sum = 6
        for (int i = K + 1; i < N + 1; i++) {
            // we just remove the last element and not add the i - 1st
            // element because we have already passed K and we do not 
            // need previously calculated values, we just remove the ones
            // that go out of our current i's range
            prev -= (i - 1 - W >= 0 ? p[i - 1 - W] : 0);
            p[i] = prev * 1 / (W * 1.0);
            res += p[i];
        }

		return res;
    }
}

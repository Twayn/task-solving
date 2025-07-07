package com.training.solving.cases;

import java.util.HashMap;
import java.util.Map;

class FindSumPairsNonOptimal {

    private Map<Integer, Integer> sumToCount = new HashMap<>();

    private final int[] nums1;
    private final int[] nums2;

    public FindSumPairsNonOptimal(int[] nums1, int[] nums2) {
        this.nums1 = nums1;
        this.nums2 = nums2;

        for(int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++){
                int sum = this.nums1[i] + this.nums2[j];
                sumToCount.merge(sum, 1, Integer::sum);
            }
        }
    }

    public void add(int index, int val) {
        for (int n1 : nums1) {
            int previousSum = n1 + nums2[index];
            sumToCount.compute(previousSum, (k, v) -> v - 1);
        }

        nums2[index] = nums2[index] + val;

        for (int j : nums1) {
            int newSum = j + nums2[index];
            sumToCount.merge(newSum, 1, Integer::sum);
        }
    }

    public int count(int tot) {
        return sumToCount.get(tot) == null ? 0 : sumToCount.get(tot);
    }
}

package com.training.solving.cases;

import java.util.HashMap;
import java.util.Map;

class FindSumPairsOptimal {

    private final HashMap<Integer, Integer> numberToCountN2 = new HashMap<>();

    private final int[] nums1;
    private final int[] nums2;

    public FindSumPairsOptimal(int[] nums1, int[] nums2) {
        this.nums1 = nums1;
        this.nums2 = nums2;

        for (int n2 : nums2) {
            numberToCountN2.merge(n2, 1, Integer::sum);
        }
    }

    public void add(int index, int val) {
        numberToCountN2.compute(nums2[index], (k, v) -> v - 1);
        nums2[index] = nums2[index] + val;
        numberToCountN2.merge(nums2[index], 1, Integer::sum);
    }

    public int count(int tot) {
        int result = 0;
        for (int i : nums1) {
            Integer complement = numberToCountN2.get(tot - i);
            result = result + (complement == null ? 0 : complement);
        }
        return result;
    }
}

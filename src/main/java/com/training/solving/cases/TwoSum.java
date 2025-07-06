package com.training.solving.cases;

import java.util.HashMap;
import java.util.HashSet;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        var numberToIndex = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {
            int pairToFind = target - nums[i];

            if (numberToIndex.containsKey(pairToFind)) {
                return new int[]{i, numberToIndex.get(pairToFind)};
            } else {
                numberToIndex.put(nums[i], i);
            }
        }

        throw new RuntimeException("should never happen by conditions");
    }
}

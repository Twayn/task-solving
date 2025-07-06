package com.training.solving.cases;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class LongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;

        Set<Character> nonRepeated = new HashSet<>();

        int left = 0;
        int right = 0;

        while (true) {
            while (right < s.length() && !nonRepeated.contains(s.charAt(right))) {
                nonRepeated.add(s.charAt(right));
                right++;
                if (nonRepeated.size() > maxLength) {
                    maxLength = nonRepeated.size();
                }
            }

            if (right >= s.length()) {
                return maxLength;
            }

            while (nonRepeated.contains(s.charAt(right))) {
                nonRepeated.remove(s.charAt(left));
                left++;
            }

//            if (left >= s.length() - 1) {
//                return maxLength;
//            }
        }
    }
}

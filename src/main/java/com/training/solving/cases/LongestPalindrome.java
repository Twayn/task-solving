package com.training.solving.cases;

class LongestPalindrome {
    public String longestPalindrome(String s) {
        int maxLength = 0;
        String longest = "";

        if (s.length() == 1) return s;

        if (s.length() == 2) {
            if (s.charAt(0) == s.charAt(1)) {
                return s;
            } else return String.valueOf(s.charAt(0));
        }

        for (int i = 1; i < s.length() - 1; i++) {
            String candidate = palindromeStartingFrom(i, i, s);
            if (candidate.length() > longest.length()) {
                maxLength = candidate.length();
                longest = candidate;
            }
        }

        for (int i = 0; i < s.length() - 1; i++) {
            String candidate = palindromeStartingFrom(i, i + 1, s);
            if (candidate.length() > longest.length()) {
                maxLength = candidate.length();
                longest = candidate;
            }
        }

        return longest;
    }

    private String palindromeStartingFrom(int l, int r, String s) {
        if (s.charAt(l) != s.charAt(r)) return "";

        while (l > 0 && r < s.length() - 1 && s.charAt(l - 1) == s.charAt(r + 1)) {
            l--;
            r++;
        }

        return s.substring(l, r + 1);
    }
}
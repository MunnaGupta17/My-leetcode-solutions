import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Solution {
    public int longestPalindrome(String[] words) {
        Map<String, Integer> freq = new HashMap<>();
        Set<String> centerCandidates = new HashSet<>();

        int result = 0;

        for (String word : words) {
            char first = word.charAt(0);
            char second = word.charAt(1);

            // Words like "aa", "bb", etc. are already palindromes.
            if (first == second) {
                if (centerCandidates.contains(word)) {
                    result += 4;
                    centerCandidates.remove(word);
                } else {
                    centerCandidates.add(word);
                }
            } else {
                String reverse = "" + second + first;

                if (freq.containsKey(reverse)) {
                    result += 4;

                    if (freq.get(reverse) > 1) {
                        freq.put(reverse, freq.get(reverse) - 1);
                    } else {
                        freq.remove(reverse);
                    }
                } else {
                    freq.put(word, freq.getOrDefault(word, 0) + 1);
                }
            }
        }

        // At most one symmetric word can be placed in the center.
        if (!centerCandidates.isEmpty()) {
            result += 2;
        }

        return result;
    }
}
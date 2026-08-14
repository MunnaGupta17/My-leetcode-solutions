class Solution {
    public String reversePrefix(String word, char ch) {
        StringBuilder firstOccurrence = new StringBuilder();

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == ch) {
                firstOccurrence.append(ch);
                firstOccurrence.reverse();

                for (int j = i + 1; j < word.length(); j++) {
                    firstOccurrence.append(word.charAt(j));
                }

                break;
            } else {
                firstOccurrence.append(word.charAt(i));
            }
        }

        return firstOccurrence.toString();
    }
}
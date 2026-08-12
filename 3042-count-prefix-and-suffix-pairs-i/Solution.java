class Solution {
    public int countPrefixSuffixPairs(String[] words) {
        int n = words.length;
        int result = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int q = words[j].length();
                int m = words[i].length();

                if (q >= m) {
                    String pre = words[j].substring(0, m);
                    String suff = words[j].substring(q - m);

                    if (words[i].equals(pre) && words[i].equals(suff)) {
                        result++;
                    }
                }
            }
        }

        return result;
    }
}
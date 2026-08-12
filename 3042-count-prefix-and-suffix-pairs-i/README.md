# 3042. Count Prefix and Suffix Pairs I

**Difficulty:** Easy  
**Topic:** String, Brute Force  
**Language:** Java

## Problem

Given a 0-indexed array of strings `words`, count the number of index pairs `(i, j)` such that:

- `i < j`
- `words[i]` is a prefix of `words[j]`
- `words[i]` is also a suffix of `words[j]`

## Approach

Use a brute-force approach by checking every possible pair `(i, j)` where `i < j`.

For each pair:

1. Get the length of `words[i]`.
2. If `words[i]` is longer than `words[j]`, it cannot be a prefix or suffix, so skip the pair.
3. Extract the first `m` characters of `words[j]` as the prefix.
4. Extract the last `m` characters of `words[j]` as the suffix.
5. Check whether both are equal to `words[i]`.
6. If both conditions are true, increment the result.

## Complexity

Let `n` be the number of words and `L` be the maximum length of a word.

There are `O(n²)` possible pairs, and comparing the prefix and suffix can take `O(L)` time.

**Time:** `O(n² × L)`

**Space:** `O(L)` due to the substring strings created during comparisons.

## Solution

See [`Solution.java`](./Solution.java).
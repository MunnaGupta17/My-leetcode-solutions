# 4014. Minimum Total Price After Applying Discounts

**Difficulty:** Medium
**Topic:** Greedy, Sorting
**Language:** Java

## Problem

Given an array of item prices and an array of discount percentages, assign discounts to items such that:

* Each discount can be used at most once.
* Each item can receive at most one discount.
* An item may receive no discount.

Return the minimum possible total price after applying the discounts optimally.

## Approach

The key observation is that the discount should be applied to the most expensive items first.

For an item with price `p` and discount `d`, the amount saved is:

`p * d / 100`

Therefore, to maximize the total amount saved:

* Sort `prices` in ascending order.
* Sort `discounts` in ascending order.
* Match the largest discount with the largest price.
* Continue matching the next largest discount with the next largest price.

If there are more items than discounts, the remaining items are added at their original prices.

## Algorithm

1. Sort `prices`.
2. Sort `discounts`.
3. Start from the most expensive item.
4. Start from the largest discount.
5. Apply each discount to the corresponding expensive item.
6. Add the prices of any remaining items without discounts.
7. Return the total.

## Complexity

Let:

* `n` = number of prices
* `m` = number of discounts

Sorting takes:

`O(n log n + m log m)`

The matching process takes:

`O(min(n, m))`

Overall:

**Time:** `O(n log n + m log m)`
**Space:** `O(1)` auxiliary space, excluding the sorting implementation.

## Solution

See [`Solution.java`](./Solution.java).

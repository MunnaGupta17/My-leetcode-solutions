# 3100. Water Bottles II

**Difficulty:** Medium
**Topic:** Simulation, Greedy
**Language:** Java

## Problem

Given two integers `numBottles` and `numExchange`:

* `numBottles` is the number of full water bottles initially available.
* Drinking a full bottle produces one empty bottle.
* `numExchange` empty bottles can be exchanged for one full bottle.
* After every exchange, `numExchange` increases by `1`.

Return the maximum number of water bottles that can be drunk.

## Approach

Initially, all available full bottles can be drunk, so they are added directly to the result and converted into empty bottles.

After that, repeatedly check whether there are enough empty bottles to perform the current exchange.

For each successful exchange:

1. Use `numExchange` empty bottles.
2. Receive one full bottle.
3. Drink the newly obtained bottle, increasing the total count by `1`.
4. The newly drunk bottle produces one empty bottle.
5. Increase `numExchange` by `1` for the next exchange.

The process stops when there are not enough empty bottles for the next exchange.

This greedy simulation works because whenever an exchange is possible, using it gives one additional bottle to drink, and delaying the exchange cannot provide any advantage.

## Algorithm

1. Initialize `result` to the number of bottles initially available.
2. Set `emptyBottles` to `numBottles`.
3. While `emptyBottles >= numExchange`:

   * Subtract `numExchange` from `emptyBottles`.
   * Drink the newly exchanged bottle and increment `result`.
   * Add the newly created empty bottle to `emptyBottles`.
   * Increment `numExchange`.
4. Return `result`.

## Complexity

Let `k` be the number of successful exchanges.

**Time:** `O(k)`
**Space:** `O(1)`

## Solution

See [`Solution.java`](./Solution.java).

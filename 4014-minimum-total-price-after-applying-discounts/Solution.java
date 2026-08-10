import java.util.Arrays;

class Solution {
    public double minPrice(int[] prices, int[] discounts) {
        Arrays.sort(prices);
        Arrays.sort(discounts);

        double result = 0.0;
        int pricesPointer = prices.length - 1;

        for (int i = discounts.length - 1; i >= 0; i--) {
            if (pricesPointer < 0) {
                break;
            }

            result += ((double) prices[pricesPointer] * (100 - discounts[i])) / 100;
            pricesPointer--;
        }

        while (pricesPointer >= 0) {
            result += prices[pricesPointer];
            pricesPointer--;
        }

        return result;
    }
}
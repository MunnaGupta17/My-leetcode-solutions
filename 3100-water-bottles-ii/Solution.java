class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int emptyBottles = 0;
        int result = 0;

        result += numBottles;
        emptyBottles = numBottles;

        while (emptyBottles >= numExchange) {
            emptyBottles -= numExchange;
            result++;

            emptyBottles++;
            numExchange++;
        }

        return result;
    }
}
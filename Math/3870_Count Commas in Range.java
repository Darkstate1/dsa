class Solution {
    public int countCommas(int n) {
        int total = 0;

        if (n >= 1000) {
            total += n - 999;
        }

        if (n >= 1000000) {
            total += n - 999999;
        }

        if (n >= 1000000000) {
            total += n - 999999999;
        }

        return total;
    }
}
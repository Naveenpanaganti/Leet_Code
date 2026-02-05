class Solution {
    public double myPow(double x, int n) {
        long N = n;              // convert int to long safely
        return power(x, N);
    }

    private double power(double x, long n) {
        if (n == 0) return 1;

        if (n < 0) {
            return 1 / power(x, -n);
        }

        double half = power(x, n / 2);
        double ans = half * half;

        if (n % 2 != 0) {
            ans = ans * x;
        }
        return ans;
    }
}

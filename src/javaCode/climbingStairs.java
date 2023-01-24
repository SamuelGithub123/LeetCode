package javaCode;

public class climbingStairs {

    public int climbStairs(int n) {

        if (n == 1) {
            return 1;
        }

        if (n == 2) {
            return 2;
        }

        int one = 1;
        int two = 1;

        for (int i = 0; i < n - 1; i++) {
            int temp = one;
            one += two;
            two = temp;
        }
        return one;
    }
}

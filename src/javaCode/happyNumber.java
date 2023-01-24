package javaCode;

public class happyNumber {

    public boolean isHappy(int n) {
        int square_Value = 0;
        int temp = 0;

        if (n == 1)
            return true;
        if (n == 7)
            return true;
        else if(n < 10)
            return false;

        while (n != 0) {
            temp = n % 10;
            square_Value += (temp * temp); // 7,
            n /= 10;
        }
        return isHappy(square_Value);
    }
}

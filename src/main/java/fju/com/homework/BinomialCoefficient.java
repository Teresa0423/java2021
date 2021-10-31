package fju.com.homework;

public class BinomialCoefficient {
    public static long binom(int k, int n) {
        if (k == n || k == 0)
            return 1;
        else return binom(n-1,k-1) + binom(n-1,k);
    }
}

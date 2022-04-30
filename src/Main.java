package src;

import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        int max = 0;
        for (int i = 0; i < 100; i++) {
            final BigInteger bigI = BigInteger.valueOf(i);
            for (int j = 0; j < 100; j++) {
                final BigInteger bigInteger = bigI.pow(j);
                final int sumOfDigits = bigInteger.toString().chars().map(Character::getNumericValue).sum();
                if (sumOfDigits > max) {
                    max = sumOfDigits;
                }
            }
        }
        System.out.println(max);
    }
}

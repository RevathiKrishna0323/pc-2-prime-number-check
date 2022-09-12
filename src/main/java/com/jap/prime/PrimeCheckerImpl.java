package com.jap.prime;

public class PrimeCheckerImpl {
    public static void main(String[] args) {
        PrimeCheckerImpl obj = new PrimeCheckerImpl();
        System.out.println("prime checker = " + obj.primeNumberCheck(3));
    }

    public boolean primeNumberCheck(int number) {
        // write the logic here to check is a number is prime or not
        PrimeChecker primeChecker = number1 -> {
            int count = 0;
            if (number == 0) {
                return false;
            } else {
                for (int i = 1; i <= number; i++) {
                    if (number % i == 0) {
                        count++;
                    }
                }
                if (count == 2) {
                    return true;
                } else {
                    return false;
                }
            }

        };

        return primeChecker.isPrimeNumber(number);
    }
}
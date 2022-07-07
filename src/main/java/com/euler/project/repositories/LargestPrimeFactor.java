package com.euler.project.repositories;

public class LargestPrimeFactor extends Algorithm {
    private long prime = 2L;

    @Override
    public int execute(Long number) {
        while (prime != number) {
            if (number % prime == 0L) {
                number = number / prime;
            } else {
                prime += 1L;
            }
        }
        return Math.toIntExact(prime);
    }

}

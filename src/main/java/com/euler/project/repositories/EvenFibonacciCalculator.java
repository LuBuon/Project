package com.euler.project.repositories;

public class EvenFibonacciCalculator extends Algorithm {
    private long previousFibonacci = 1L , actualFibonacci = 1L, summatory = 0L, limit = 4000000L;


    @Override
    public int execute(Long number) {
        if (number <= 2L){
            return 0;
        }
        limit = number;

        do {
            moveToNextSuccession();
            if (isEven(actualFibonacci)) {
                summatory += actualFibonacci;
            }
            System.out.println("A: " + previousFibonacci + "  B: " + actualFibonacci );
        } while (theNextFibonacciNumberIsUnderLimit());
        return Math.toIntExact(summatory);
    }


    private boolean theNextFibonacciNumberIsUnderLimit(){
        return previousFibonacci + actualFibonacci < limit;
    }

    private boolean isEven(Long number){return number % 2L == 0L;}

    private void moveToNextSuccession(){
        long nextFibonacci = previousFibonacci + actualFibonacci;
        previousFibonacci = actualFibonacci;
        actualFibonacci = nextFibonacci;
    }







}

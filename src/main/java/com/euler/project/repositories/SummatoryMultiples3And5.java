package com.euler.project.repositories;

public class SummatoryMultiples3And5 extends Algorithm {

    private long summatory = 0L;
    private static final long FIRST_DIVIDER = 3L;
    private static final long SECOND_DIVIDER = 5L;

    @Override
    public int execute(Long limit) {
        for (long number = 0; number < limit; number++) {
            if (isMultipleOf3(number) || isMultipleOf5(number)) {
                summatory += number;
            }
        }
        System.out.println("resultado Ej1 " + summatory);
        return Math.toIntExact(summatory);
    }

    private boolean isMultipleOf3(Long number) {
        return number % FIRST_DIVIDER == 0L;
    }

    private boolean isMultipleOf5(Long number) {
        return number % SECOND_DIVIDER == 0L;
    }

}

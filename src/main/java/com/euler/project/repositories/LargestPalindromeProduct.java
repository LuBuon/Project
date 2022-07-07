package com.euler.project.repositories;

public class LargestPalindromeProduct extends Algorithm {

    private int firstFactor, secondFactor, product, palindrome, maxPalindrome, factorMax1, factorMax2, centenas, decenas, unidades, millares, decenasMillares, centenasMillares;

    @Override
    public int execute(Long number) {
        int DIGITS = Math.toIntExact(number);
        firstFactor = FactorGenerator(DIGITS);
        secondFactor = FactorGenerator(DIGITS);
        maxPalindrome = 0;
        while (firstFactor >= 0) {

            product = firstFactor * secondFactor;
            unidades = product % 10;
            product = product / 10;
            decenas = product % 10;
            product = product / 10;
            centenas = product % 10;
            product = product / 10;
            millares = product % 10;
            product = product / 10;
            decenasMillares = product % 10;
            product = product / 10;
            centenasMillares = product % 10;

            if (unidades == centenasMillares & decenas == decenasMillares & centenas == millares) {
                palindrome = firstFactor * secondFactor;

                if (palindrome > maxPalindrome) {
                    maxPalindrome = palindrome;
                    factorMax1 = firstFactor;
                    factorMax2 = secondFactor;
                }
            } else if (centenasMillares == 0 & decenasMillares == unidades & millares == decenas) {
                palindrome = firstFactor * secondFactor;

                if (palindrome > maxPalindrome) {
                    maxPalindrome = palindrome;
                    factorMax1 = firstFactor;
                    factorMax2 = secondFactor;
                }
            }
            if (secondFactor > 1) {
                secondFactor -= 1;
            } else {
                secondFactor = firstFactor - 1;
                firstFactor -= 1;
            }
        }
        System.out.print("  factor maximo1:  " + factorMax1 + "   factor maximo2: " + factorMax2);
        return this.maxPalindrome;
    }

    private int FactorGenerator(Integer number) {
        int summatory = 0;
        for (int i = 0; i < number; i += 1) {
            summatory += 9 * (int) (Math.pow(10, i));
        }
        return summatory;
    }
    private boolean IsPalindrome(Integer number){
        /*idea hacer un array con los dígitos
         */
    }

}

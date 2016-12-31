package com.pillartechnology.numeral

class RomanNumeralConverter {


    static int toNumber(String numeral) {
        int number = 0;
        numeral.count("I").times { number += 1 }
        number
    }
}

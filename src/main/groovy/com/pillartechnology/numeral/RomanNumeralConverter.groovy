package com.pillartechnology.numeral

class RomanNumeralConverter {

    static final def ONE = [numeral: 'I', number: 1]
    static final def FOUR = [numeral: 'IV', number: 4]
    static final def FIVE = [numeral: 'V', number: 5]

    static int toNumber(String numeral) {
        int number = 0
        numeral.count(FOUR.numeral).times { number += FOUR.number }
        String transformedNumeral = numeral.replaceAll(FOUR.numeral, '')
        transformedNumeral.count(FIVE.numeral).times { number += FIVE.number }
        transformedNumeral.count(ONE.numeral).times { number += ONE.number }
        number
    }
}

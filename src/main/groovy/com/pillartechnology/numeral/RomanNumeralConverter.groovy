package com.pillartechnology.numeral

class RomanNumeralConverter {

    static final String ONE = 'I'
    static final String FOUR = 'IV'

    static int toNumber(String numeral) {
        int number = 0
        numeral.count(FOUR).times { number += 4 }
        String transformedNumeral = numeral.replaceAll(FOUR, '')
        transformedNumeral.count(ONE).times { number += 1 }
        number
    }
}

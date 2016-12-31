package com.pillartechnology.numeral

class NumberConverter {

    static String toNumeral(int number) {
        String numeral = ''

        while (number >= 1000) {
            number -= 1000
            numeral += 'M'
        }

        while (number >= 900) {
            number -= 900
            numeral += 'CM'
        }

        numeral
    }
}

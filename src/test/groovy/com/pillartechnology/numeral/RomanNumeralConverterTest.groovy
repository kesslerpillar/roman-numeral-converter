package com.pillartechnology.numeral

import org.junit.Test

class RomanNumeralConverterTest {

    @Test
    void romanNumeralConversion() {
        [1 : 'I',
         2 : 'II',
         3 : 'III',
         4 : 'IV',
         5 : 'V',
         6 : 'VI',
         7 : 'VII',
         8 : 'VIII',
         9 : 'IX',
         10: 'X',
         12: 'XII',
        ].each { int expectedNumber, String numeral ->
            assertConversion(expectedNumber, numeral)
        }

    }

    static private void assertConversion(int expectedNumber, String numeral) {
        assert expectedNumber == RomanNumeralConverter.toNumber(numeral)
    }
}

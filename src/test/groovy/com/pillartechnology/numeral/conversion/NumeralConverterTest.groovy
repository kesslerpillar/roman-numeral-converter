package com.pillartechnology.numeral.conversion

import org.junit.Test

class NumeralConverterTest {

    private static final NumeralConverter converter = new NumeralConverter()

    @Test
    void romanNumeralConversion() {
        [1   : 'I', 2: 'II',
         3   : 'III', 4: 'IV',
         5   : 'V', 6: 'VI',
         7   : 'VII', 8: 'VIII',
         9   : 'IX', 10: 'X',
         12  : 'XII', 14: 'XIV',
         19  : 'XIX', 24: 'XXIV',
         39  : 'XXXIX', 44: 'XLIV',
         50  : 'L', 54: 'LIV',
         69  : 'LXIX', 74: 'LXXIV',
         78  : 'LXXVIII', 90: 'XC',
         99  : 'XCIX', 100: 'C',
         444 : 'CDXLIV', 500: 'D',
         667 : 'DCLXVII', 900: 'CM',
         944 : 'CMXLIV', 1000: 'M',
         1444: 'MCDXLIV', 3999: 'MMMCMXCIX',
        ].each { int expectedNumber, String numeral ->
            assertConversion(expectedNumber, numeral)
        }

    }

    @Test
    void mixedCaseConverstion() {
        assertConversion(8, 'ViIi')
    }

    static private void assertConversion(int expectedNumber, String numeral) {
        assert expectedNumber == converter.convert(numeral)
    }
}

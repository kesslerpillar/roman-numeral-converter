package com.pillartechnology.numeral

import org.junit.Test

class NumberConverterTest {

    @Test
    void convertToRomanNumeral() {
        [4000: 'MMMM', 4900: 'MMMMCM',
         1   : 'I', 2: 'II',
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
         1444: 'MCDXLIV', 4999: 'MMMMCMXCIX',
        ].each { int number, String expecteNumeral ->
            assertConversion(number, expecteNumeral)
        }
    }

    static private void assertConversion(int number, String expectedNumeral) {
        assert expectedNumeral == NumberConverter.toNumeral(number)
    }
}

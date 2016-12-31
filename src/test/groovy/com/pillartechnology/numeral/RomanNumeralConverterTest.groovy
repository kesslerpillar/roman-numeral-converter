package com.pillartechnology.numeral

import org.junit.Test

class RomanNumeralConverterTest {

    @Test
    void romanNumeralOneToNumber() {
        assert 1 == RomanNumeralConverter.toNumber("I")
    }

    @Test
    void romanNumeralTwoToNumber() {
        assert 2 == RomanNumeralConverter.toNumber("II")
    }
}

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

    @Test
    void romanNumeralThreeToNumber() {
        assert 3 == RomanNumeralConverter.toNumber("III")
    }

    @Test
    void romanNumeralFourToNumber() {
        assert 4 == RomanNumeralConverter.toNumber("IV")
    }
}

package com.pillartechnology.numeral

import org.junit.Test

class RomanNumeralConverterTest {

    @Test
    void romanNumeralOneToNumber() {
        assert 1 == RomanNumeralConverter.toNumber("I")
    }
}

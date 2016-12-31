package com.pillartechnology.numeral

import org.junit.Test

class RomanNumeralConverterTest {

    @Test
    void romanNumeralOneToNumber() {
        assertConversion(1, 'I')
    }

    @Test
    void romanNumeralTwoToNumber() {
        assertConversion(2, "II")
    }

    @Test
    void romanNumeralThreeToNumber() {
        assertConversion(3, "III")
    }

    @Test
    void romanNumeralFourToNumber() {
        assertConversion(4, "IV")
    }

    @Test
    void romanNumeralFiveToNumber() {
        assertConversion(5, "V")
    }

    @Test
    void romanNumeralSixToNumber() {
        assertConversion(6, "VI")
    }

    @Test
    void romanNumeralSevenToNumber() {
        assertConversion(7, "VII")
    }

    @Test
    void romanNumeralEightToNumber() {
        assertConversion(8, "VIII")
    }

    @Test
    void romanNumeralNineToNumber() {
        assertConversion(9, "IX")
    }

    @Test
    void romanNumeralTenToNumber() {
        assertConversion(10, "X")
    }

    @Test
    void romanNumeralTwelveToNumber() {
        assertConversion(12, "XII")
    }

    private void assertConversion(int expectedNumber, String numeral) {
        assert expectedNumber == RomanNumeralConverter.toNumber(numeral)
    }
}

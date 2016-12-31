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

    @Test
    void romanNumeralFiveToNumber() {
        assert 5 == RomanNumeralConverter.toNumber("V")
    }

    @Test
    void romanNumeralSixToNumber() {
        assert 6 == RomanNumeralConverter.toNumber("VI")
    }

    @Test
    void romanNumeralSevenToNumber() {
        assert 7 == RomanNumeralConverter.toNumber("VII")
    }

    @Test
    void romanNumeralEightToNumber() {
        assert 8 == RomanNumeralConverter.toNumber("VIII")
    }

    @Test
    void romanNumeralNineToNumber() {
        assert 9 == RomanNumeralConverter.toNumber("IX")
    }

    @Test
    void romanNumeralTenToNumber() {
        assert 10 == RomanNumeralConverter.toNumber("X")
    }

    @Test
    void romanNumeralTwelveToNumber() {
        assert 12 == RomanNumeralConverter.toNumber("XII")
    }
}

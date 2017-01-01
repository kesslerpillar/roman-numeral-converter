package com.pillartechnology.numeral

import com.pillartechnology.numeral.conversion.NumberConverter
import com.pillartechnology.numeral.conversion.NumeralConverter
import com.pillartechnology.numeral.exception.NumberConversionException
import com.pillartechnology.numeral.validation.NumberValidator
import groovy.mock.interceptor.MockFor
import org.junit.Before
import org.junit.Test

class ConverterApplicationTest {


    private def mockNumberConverter
    private def mockNumeralConverter
    private def mockNumberValidator
    private static final int number = 10
    private static final String numeral = 'test'

    @Before
    void setUp() {
        mockNumberConverter = new MockFor(NumberConverter)
        mockNumeralConverter = new MockFor(NumeralConverter)
        mockNumberValidator = new MockFor(NumberValidator)
    }

    @Test
    void toNumeral() {
        int number = 10
        def numeral = 'test'

        mockNumberValidator.demand.isValid { true }
        mockNumberConverter.demand.convert { value ->
            assert number == value
            numeral
        }

        runToNumeral(number, numeral)

    }

    @Test(expected = NumberConversionException)
    void toInvalidNumeral() {
        mockNumberValidator.demand.isValid { false }
        mockNumberConverter.demand.convert(0) { number -> throw new IllegalAccessError() }
        mockNumeralConverter.demand.convert(0) { numeral -> throw new IllegalAccessError() }
        runToNumeral(number)
    }

    @Test
    void toNumber() {
        mockNumberValidator.demand.isValid(0) { throw new IllegalAccessError() }
        mockNumberConverter.demand.convert(0) { number -> throw new IllegalAccessError() }
        mockNumeralConverter.demand.convert { value ->
            assert numeral == value
            number
        }

        runToNumber(numeral, number)

    }


    private void runToNumeral(int number, String expectedNumeral = '') {
        mockNumberConverter.use {
            mockNumeralConverter.use {
                mockNumberValidator.use {
                    assert expectedNumeral == ConverterApplication.instance().toNumeral(number)
                }
            }
        }
    }

    private void runToNumber(String numeral, int expectedNumber = 0) {
        mockNumberConverter.use {
            mockNumeralConverter.use {
                mockNumberValidator.use {
                    assert expectedNumber == ConverterApplication.instance().toNumber(numeral)
                }
            }
        }
    }
}

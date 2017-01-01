package com.pillartechnology.numeral

import com.pillartechnology.numeral.conversion.NumberConverter
import com.pillartechnology.numeral.conversion.NumeralConverter
import com.pillartechnology.numeral.exception.NumberConversionException
import com.pillartechnology.numeral.exception.NumeralConversionException
import com.pillartechnology.numeral.validation.NumberValidator
import com.pillartechnology.numeral.validation.NumeralValidator
import groovy.mock.interceptor.MockFor
import org.junit.Before
import org.junit.Test

class ConverterApplicationTest {


    private def mockNumberConverter
    private def mockNumeralConverter
    private def mockNumberValidator
    private def mockNumeralValidator
    private static final int number = 10
    private static final String numeral = 'test'

    @Before
    void setUp() {
        mockNumberConverter = new MockFor(NumberConverter)
        mockNumeralConverter = new MockFor(NumeralConverter)
        mockNumberValidator = new MockFor(NumberValidator)
        mockNumeralValidator = new MockFor(NumeralValidator)
    }

    @Test
    void toNumeral() {
        mockNumberValidator.demand.isValid { true }
        mockNumberConverter.demand.convert { value ->
            assert number == value
            numeral
        }
        mockNumeralValidator.demand.isValid(0) { throw new IllegalAccessError() }
        mockNumeralConverter.demand.convert(0) { value -> throw new IllegalAccessError() }

        runToNumeral(number, numeral)

    }

    @Test(expected = NumberConversionException)
    void toNumeralWithInvalidNumber() {
        mockNumberValidator.demand.isValid { false }
        mockNumberConverter.demand.convert(0) { value -> throw new IllegalAccessError() }
        mockNumeralValidator.demand.isValid(0) { throw new IllegalAccessError() }
        mockNumeralConverter.demand.convert(0) { value -> throw new IllegalAccessError() }
        runToNumeral(number)
    }

    @Test
    void toNumber() {
        mockNumberValidator.demand.isValid(0) { throw new IllegalAccessError() }
        mockNumberConverter.demand.convert(0) { value -> throw new IllegalAccessError() }
        mockNumeralValidator.demand.isValid { true }
        mockNumeralConverter.demand.convert { value ->
            assert numeral == value
            number
        }

        runToNumber(numeral, number)

    }

    @Test(expected = NumeralConversionException)
    void toNumberWithInvalidNumeral() {
        mockNumberValidator.demand.isValid(0) { throw new IllegalAccessError() }
        mockNumberConverter.demand.convert(0) { value -> throw new IllegalAccessError() }
        mockNumeralValidator.demand.isValid(0) { false }
        mockNumeralConverter.demand.convert(0) { value -> throw new IllegalAccessError() }
        runToNumber(numeral)
    }


    private void runToNumeral(int number, String expectedNumeral = '') {
        mockNumberConverter.use {
            mockNumeralConverter.use {
                mockNumberValidator.use {
                    mockNumeralValidator.use {
                        assert expectedNumeral == ConverterApplication.instance().toNumeral(number)
                    }
                }
            }
        }
    }

    private void runToNumber(String numeral, int expectedNumber = 0) {
        mockNumberConverter.use {
            mockNumeralConverter.use {
                mockNumberValidator.use {
                    mockNumeralValidator.use {
                        assert expectedNumber == ConverterApplication.instance().toNumber(numeral)
                    }
                }
            }
        }
    }
}

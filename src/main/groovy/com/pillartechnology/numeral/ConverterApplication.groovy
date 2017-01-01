package com.pillartechnology.numeral

import com.pillartechnology.numeral.conversion.NumberConverter
import com.pillartechnology.numeral.conversion.NumeralConverter
import com.pillartechnology.numeral.exception.NumberConversionException
import com.pillartechnology.numeral.exception.NumeralConversionException
import com.pillartechnology.numeral.validation.NumberValidator
import com.pillartechnology.numeral.validation.NumeralValidator

class ConverterApplication {

    private NumberConverter numberConverter
    private NumeralConverter numeralConverter
    private NumberValidator numberValidator
    private NumeralValidator numeralValidator

    private ConverterApplication(NumberConverter numberConverter, NumeralConverter numeralConverter,
                                 NumberValidator numberValidator, NumeralValidator numeralValidator) {
        this.numeralValidator = numeralValidator
        this.numberValidator = numberValidator
        this.numeralConverter = numeralConverter
        this.numberConverter = numberConverter
    }

    static ConverterApplication instance() {
        def numberConverter = new NumberConverter()
        def numeralConverter = new NumeralConverter()
        def numberValidator = new NumberValidator()
        def numeralValidator = new NumeralValidator()
        new ConverterApplication(numberConverter, numeralConverter, numberValidator, numeralValidator)
    }

    String toNumeral(int number) {
        if (numberValidator.isValid(number)) {
            numberConverter.convert(number)
        } else {
            throw new NumberConversionException()
        }
    }

    int toNumber(String numeral) {
        if (numeralValidator.isValid(numeral)) {
            numeralConverter.convert(numeral)
        } else {
            throw new NumeralConversionException()
        }
    }
}

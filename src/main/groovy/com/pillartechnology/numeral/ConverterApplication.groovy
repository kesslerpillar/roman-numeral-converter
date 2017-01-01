package com.pillartechnology.numeral

import com.pillartechnology.numeral.conversion.NumberConverter
import com.pillartechnology.numeral.conversion.NumeralConverter
import com.pillartechnology.numeral.exception.NumberConversionException
import com.pillartechnology.numeral.transformation.Transformation
import com.pillartechnology.numeral.transformation.TransformerFactory
import com.pillartechnology.numeral.validation.NumberValidator


class ConverterApplication {

    private NumberConverter numberConverter
    private NumeralConverter numeralConverter
    private NumberValidator numberValidator

    private ConverterApplication(NumberConverter numberConverter, NumeralConverter numeralConverter, NumberValidator numberValidator) {
        this.numberValidator = numberValidator
        this.numeralConverter = numeralConverter
        this.numberConverter = numberConverter
    }

    static ConverterApplication instance() {
        def numberConverter = new NumberConverter()
        def numeralConverter = new NumeralConverter()
        def numberValidator = new NumberValidator()
        new ConverterApplication(numberConverter, numeralConverter, numberValidator)
    }

    String toNumeral(int number) {
        if (numberValidator.isValid(number)) {
            numberConverter.convert(number)
        } else {
            throw new NumberConversionException()
        }
    }

    int toNumber(String numeral) {
        numeralConverter.convert(numeral)
    }
}

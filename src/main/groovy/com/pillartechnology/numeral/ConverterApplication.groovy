package com.pillartechnology.numeral

import com.pillartechnology.numeral.conversion.NumberConverter
import com.pillartechnology.numeral.conversion.NumeralConverter
import com.pillartechnology.numeral.exception.NumberConversionException
import com.pillartechnology.numeral.exception.NumeralConversionException
import com.pillartechnology.numeral.validation.NumberValidator
import com.pillartechnology.numeral.validation.NumeralValidator

class ConverterApplication {

    private final NumberConverter numberConverter
    private final NumeralConverter numeralConverter
    private final NumberValidator numberValidator
    private final NumeralValidator numeralValidator

    private ConverterApplication(NumberConverter numberConverter, NumeralConverter numeralConverter,
                                 NumberValidator numberValidator, NumeralValidator numeralValidator) {
        this.numeralValidator = numeralValidator
        this.numberValidator = numberValidator
        this.numeralConverter = numeralConverter
        this.numberConverter = numberConverter
    }

    static ConverterApplication instance() {
        new ConverterApplication(new NumberConverter(), new NumeralConverter(),
                new NumberValidator(), new NumeralValidator())
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

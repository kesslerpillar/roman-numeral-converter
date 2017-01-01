package com.pillartechnology.numeral.validation

import org.junit.Test

class NumberValidatorTest {

    NumberValidator validator = new NumberValidator()

    @Test
    void validateValidNumber() {
        assert validator.isValid(10)
    }

    @Test
    void validateZero() {
        assert !validator.isValid(0)
    }

    @Test
    void validateNegativeNumber() {
        assert !validator.isValid(-1)
    }

    @Test
    void validateMaxNumber() {
        assert validator.isValid(3999)
    }

    @Test
    void validateFourThousand() {
        assert !validator.isValid(4000)
    }
}

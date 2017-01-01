package com.pillartechnology.numeral.validation

import org.junit.Test

class NumberValidatorTest {

    @Test
    void validateValidNumber() {
        assert new NumberValidator().isValid(10)
    }

    @Test
    void validateZero() {
        assert !new NumberValidator().isValid(0)
    }

    @Test
    void validateNegativeNumber() {
        assert !new NumberValidator().isValid(-1)
    }

    @Test
    void validateMaxNumber() {
        assert new NumberValidator().isValid(3999)
    }

    @Test
    void validateFourThousand() {
        assert !new NumberValidator().isValid(4000)
    }
}

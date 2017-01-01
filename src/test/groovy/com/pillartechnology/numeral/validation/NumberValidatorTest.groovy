package com.pillartechnology.numeral.validation

import org.junit.Test

class NumberValidatorTest {

    @Test
    void validateValidNumber() {
        assert new NumberValidator().validate(10)
    }

    @Test
    void validateZero() {
        assert !new NumberValidator().validate(0)
    }

    @Test
    void validateNegativeNumber() {
        assert !new NumberValidator().validate(-1)
    }

    @Test
    void validateMaxNumber() {
        assert new NumberValidator().validate(3999)
    }

    @Test
    void validateFourThousand() {
        assert !new NumberValidator().validate(4000)
    }
}

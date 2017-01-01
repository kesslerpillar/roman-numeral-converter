package com.pillartechnology.numeral.validation

import org.junit.Test

class NumeralValidatorTest {

    NumeralValidator validator = new NumeralValidator()

    @Test
    void isValid() {
        assert validator.isValid('LXXXVIII')
    }

    @Test
    void isInvalidNull() {
        assert !validator.isValid(null)
    }

    @Test
    void isInvalidEmptyString() {
        assert !validator.isValid('')
    }

    @Test
    void isInvalidSpaces() {
        assert !validator.isValid('  ')
    }
}

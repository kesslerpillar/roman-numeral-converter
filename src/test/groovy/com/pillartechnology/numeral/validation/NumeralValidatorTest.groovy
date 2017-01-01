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

    @Test
    void isValidCharacters() {
        ['C', 'D', 'I', 'L', 'M', 'V', 'X'].each { validLetter ->
            assert validator.isValid(validLetter)
            assert validator.isValid(validLetter.toLowerCase())
        }
    }

    @Test
    void isInvalidCharacters() {
        ['A', 'B', 'E', 'F', 'G', 'H', 'J', 'K', 'N', 'O',
         'P', 'Q', 'R', 'S', 'T', 'U', 'W', 'Y', 'Z'].each { invalidLetter ->
            assert !validator.isValid(invalidLetter)
            assert !validator.isValid(invalidLetter.toLowerCase())
        }
    }
}

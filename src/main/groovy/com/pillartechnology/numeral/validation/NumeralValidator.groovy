package com.pillartechnology.numeral.validation

import java.util.regex.Matcher

class NumeralValidator {

    boolean isValid(String numeral) {
        numeralContainsCharacters(numeral) &&
                containsValidRomanNumeralCharacters(numeral)
    }

    private Matcher containsValidRomanNumeralCharacters(String numeral) {
        numeral =~ /^[MmDdCcLlXxVvIi]+$/
    }

    private boolean numeralContainsCharacters(String numeral) {
        numeral != null && numeral.trim().size() > 0
    }
}

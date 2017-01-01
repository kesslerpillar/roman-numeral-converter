package com.pillartechnology.numeral.validation

class NumeralValidator {

    boolean isValid(String numeral) {
        numeral != null && numeral.trim().size() > 0
    }
}

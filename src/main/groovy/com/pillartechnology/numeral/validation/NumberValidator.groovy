package com.pillartechnology.numeral.validation

class NumberValidator {

    boolean isValid(int number) {
        greaterThanOne(number) &&
                lessThanFourThousand(number)
    }

    private boolean lessThanFourThousand(int number) {
        number < 4000
    }

    private boolean greaterThanOne(int number) {
        number > 0
    }
}

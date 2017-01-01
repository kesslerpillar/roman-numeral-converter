package com.pillartechnology.numeral

import com.pillartechnology.numeral.transformation.Transformation
import com.pillartechnology.numeral.transformation.TransformerFactory


class RomanNumeralConverter {

    static int toNumber(String numeral) {
        Transformation transformation = new Transformation(numeral, 0)

        TransformerFactory.numeralConversionList().each { transformer ->
            transformation = transformer.numeralToNumber(transformation)
        }

        transformation.total
    }
}

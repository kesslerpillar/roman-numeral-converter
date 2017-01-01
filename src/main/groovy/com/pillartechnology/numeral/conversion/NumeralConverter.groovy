package com.pillartechnology.numeral.conversion

import com.pillartechnology.numeral.transformation.Transformation
import com.pillartechnology.numeral.transformation.TransformerFactory

class NumeralConverter {

    int convert(String numeral) {
        Transformation transformation = new Transformation(numeral, 0)

        TransformerFactory.numeralConversionList().each { transformer ->
            transformation = transformer.numeralToNumber(transformation)
        }

        transformation.total
    }
}

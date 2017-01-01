package com.pillartechnology.numeral.conversion

import com.pillartechnology.numeral.transformation.Transformation
import com.pillartechnology.numeral.transformation.TransformerFactory

class NumberConverter {

    String convert(int number) {
        Transformation transformation = new Transformation('', number)

        TransformerFactory.numberConversionList().each { transformer ->
            transformation = transformer.numberToNumeral(transformation)
        }

        transformation.part
    }
}

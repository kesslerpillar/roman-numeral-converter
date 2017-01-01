package com.pillartechnology.numeral

import com.pillartechnology.numeral.transformation.Transformation
import com.pillartechnology.numeral.transformation.TransformerFactory

class NumberConverter {

    static String toNumeral(int number) {
        Transformation transformation = new Transformation('', number)

        TransformerFactory.numberConversionList().each { transformer ->
            transformation = transformer.numberToNumeral(transformation)
        }

        transformation.part
    }
}

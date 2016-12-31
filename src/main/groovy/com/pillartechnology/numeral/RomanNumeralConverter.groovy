package com.pillartechnology.numeral

import com.pillartechnology.numeral.transformation.Transformation
import static com.pillartechnology.numeral.transformation.TransformerFactory.*


class RomanNumeralConverter {

    static final def TRANSFORMERS = [createFour(), createNine(), createTen(), createFive(), createOne()]

    static int toNumber(String numeral) {
        Transformation transformation = new Transformation(numeral, 0)

        TRANSFORMERS.each { tranformer ->
            transformation = tranformer.transform(transformation)
        }

        transformation.total
    }
}

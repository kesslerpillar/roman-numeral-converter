package com.pillartechnology.numeral

import com.pillartechnology.numeral.transformation.Transformation
import static com.pillartechnology.numeral.transformation.TransformerFactory.*


class RomanNumeralConverter {

    static final def TRANSFORMERS = [createFour(), createNine(), createForty(), createNinety(),
                                     createFourHundred(), createNineHundred(),
                                     createOne(), createFive(), createTen(), createFifty(),
                                     createOneHundred(), createFiveHundred(), createOneThousand()]

    static int toNumber(String numeral) {
        Transformation transformation = new Transformation(numeral, 0)

        TRANSFORMERS.each { transformer ->
            transformation = transformer.transform(transformation)
        }

        transformation.total
    }
}

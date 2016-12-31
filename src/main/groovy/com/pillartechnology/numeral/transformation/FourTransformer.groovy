package com.pillartechnology.numeral.transformation

class FourTransformer implements Transformer {

    static final def FOUR = [numeral: 'IV', number: 4]

    @Override
    Transformation transform(final Transformation transformation) {

        int total = transformation.part.count(FOUR.numeral) * FOUR.number

        String part = transformation.part.replaceAll(FOUR.numeral, '')

        return new Transformation(part, transformation.total + total)
    }
}

package com.pillartechnology.numeral.transformation

class NineTransformer implements Transformer {

    static final def NINE = [numeral: 'IX', number: 9]

    @Override
    Transformation transform(final Transformation transformation) {

        int total = transformation.part.count(NINE.numeral) * NINE.number

        String part = transformation.part.replaceAll(NINE.numeral, '')

        return new Transformation(part, transformation.total + total)
    }
}

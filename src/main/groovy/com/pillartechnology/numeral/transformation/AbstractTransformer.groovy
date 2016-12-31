package com.pillartechnology.numeral.transformation

abstract class AbstractTransformer implements NumeralTransformer, NumberTransformer {

    @Override
    Transformation numeralToNumber(final Transformation transformation) {

        int total = transformation.part.count(getNumeral()) * getNumber()

        String part = transformation.part.replaceAll(getNumeral(), '')

        new Transformation(part, transformation.total + total)
    }

    @Override
    Transformation numberToNumeral(final Transformation transformation) {
        int total = transformation.total
        String part = transformation.part

        while (total >= getNumber()) {
            total -= getNumber()
            part += getNumeral()
        }

        new Transformation(part, total)
    }

    abstract protected String getNumeral()

    abstract protected int getNumber()
}

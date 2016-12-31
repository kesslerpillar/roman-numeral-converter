package com.pillartechnology.numeral.transformation

abstract class AbstractTransformer implements NumeralTransformer {

    @Override
    Transformation numeralToNumber(final Transformation transformation) {

        int total = transformation.part.count(getNumeral()) * getNumber()

        String part = transformation.part.replaceAll(getNumeral(), '')

        return new Transformation(part, transformation.total + total)
    }

    abstract protected String getNumeral()

    abstract protected int getNumber()
}

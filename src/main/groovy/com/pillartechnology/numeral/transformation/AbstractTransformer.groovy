package com.pillartechnology.numeral.transformation

abstract class AbstractTransformer implements Transformer {

    @Override
    Transformation transform(final Transformation transformation) {

        int total = transformation.part.count(retrieveNumeral()) * retrieveNumber()

        String part = transformation.part.replaceAll(retrieveNumeral(), '')

        return new Transformation(part, transformation.total + total)
    }

    abstract protected String retrieveNumeral()

    abstract protected int retrieveNumber()
}

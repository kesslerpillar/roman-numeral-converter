package com.pillartechnology.numeral.transformation

import org.junit.Test

class AbstractTransformerTest {

    private static final AbstractTransformer transformer = new AbstractTransformer() {
        @Override
        protected String retrieveNumeral() {
            return 'YY'
        }

        @Override
        protected int retrieveNumber() {
            return 30
        }
    }

    @Test
    void transformNonFour() {
        Transformation transformation = transformer.transform(new Transformation('XXX', 0))
        assert 'XXX' == transformation.part
        assert 0 == transformation.total
    }

    @Test
    void transformWithFour() {
        Transformation transformation = transformer.transform(new Transformation('XYY', 0))
        assert 'X' == transformation.part
        assert 30 == transformation.total
    }

    @Test
    void transformWithExistingTotal() {
        Transformation transformation = transformer.transform(new Transformation('XYY', 10))
        assert 'X' == transformation.part
        assert 40 == transformation.total
    }
}

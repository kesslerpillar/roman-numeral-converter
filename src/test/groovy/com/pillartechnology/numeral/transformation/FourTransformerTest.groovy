package com.pillartechnology.numeral.transformation

import org.junit.Test

class FourTransformerTest {

    private static final FourTransformer transformer = new FourTransformer()

    @Test
    void transformNonFour() {
        Transformation transformation = transformer.transform(new Transformation('XXX', 0))
        assert 'XXX' == transformation.part
        assert 0 == transformation.total
    }

    @Test
    void transformWithFour() {
        Transformation transformation = transformer.transform(new Transformation('XIV', 0))
        assert 'X' == transformation.part
        assert 4 == transformation.total
    }

    @Test
    void transformWithExistingTotal() {
        Transformation transformation = transformer.transform(new Transformation('XIV', 10))
        assert 'X' == transformation.part
        assert 14 == transformation.total
    }
}

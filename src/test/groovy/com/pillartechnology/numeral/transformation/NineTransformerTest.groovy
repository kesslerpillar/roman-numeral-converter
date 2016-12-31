package com.pillartechnology.numeral.transformation

import org.junit.Test

class NineTransformerTest {

    private static final NineTransformer transformer = new NineTransformer()

    @Test
    void transformNonNine() {
        Transformation transformation = transformer.transform(new Transformation('XXX', 0))
        assert 'XXX' == transformation.part
        assert 0 == transformation.total
    }

    @Test
    void transformWithNine() {
        Transformation transformation = transformer.transform(new Transformation('XIX', 0))
        assert 'X' == transformation.part
        assert 9 == transformation.total
    }

    @Test
    void transformWithExistingTotal() {
        Transformation transformation = transformer.transform(new Transformation('XIX', 10))
        assert 'X' == transformation.part
        assert 19 == transformation.total
    }
}

package com.pillartechnology.numeral.transformation

import org.junit.Test

class FourTransformerTest {

    private static final FourTransformer transformer = new FourTransformer()

    @Test
    void retrieveNumber() {
        assert 4 == transformer.retrieveNumber()
    }

    @Test
    void retrieveNumeral() {
        assert 'IV' == transformer.retrieveNumeral()
    }
}

package com.pillartechnology.numeral.transformation

import org.junit.Test

class NineTransformerTest {

    private static final NineTransformer transformer = new NineTransformer()

    @Test
    void retrieveNumber() {
        assert 9 == transformer.retrieveNumber()
    }

    @Test
    void retrieveNumeral() {
        assert 'IX' == transformer.retrieveNumeral()
    }
}

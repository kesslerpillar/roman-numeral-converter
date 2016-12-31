package com.pillartechnology.numeral.transformation

import org.junit.Test

class TransformationTest {

    @Test
    void constructUpperCasePart() {
        def transformation = new Transformation("abcd", 10)
        assert "ABCD" == transformation.part
        assert 10 == transformation.total
    }
}

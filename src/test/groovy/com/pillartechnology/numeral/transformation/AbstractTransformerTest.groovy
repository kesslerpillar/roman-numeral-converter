package com.pillartechnology.numeral.transformation

import org.junit.Test

class AbstractTransformerTest {

    private static final AbstractTransformer transformer = new AbstractTransformer() {
        @Override
        protected String getNumeral() {
            return 'YY'
        }

        @Override
        protected int getNumber() {
            return 30
        }
    }

    @Test
    void numeralToNumberNoMatch() {
        Transformation transformation = transformer.numeralToNumber(new Transformation('XXX', 0))
        assert 'XXX' == transformation.part
        assert 0 == transformation.total
    }

    @Test
    void numeralToNumberMatch() {
        Transformation transformation = transformer.numeralToNumber(new Transformation('XYY', 0))
        assert 'X' == transformation.part
        assert 30 == transformation.total
    }

    @Test
    void numeralToNumberWithExistingTotal() {
        Transformation transformation = transformer.numeralToNumber(new Transformation('XYY', 10))
        assert 'X' == transformation.part
        assert 40 == transformation.total
    }

    @Test
    void numberToNumeralTotalLessThanNumber() {
        Transformation transformation = transformer.numberToNumeral(new Transformation('', 10))
        assert '' == transformation.part
        assert 10 == transformation.total
    }

    @Test
    void numberToNumeralTotalGreaterThanNumber() {
        Transformation transformation = transformer.numberToNumeral(new Transformation('', 60))
        assert 'YYYY' == transformation.part
        assert 0 == transformation.total
    }

    @Test
    void numberToNumeralTotalGreaterThanNumberExistingPart() {
        Transformation transformation = transformer.numberToNumeral(new Transformation('XX', 60))
        assert 'XXYYYY' == transformation.part
        assert 0 == transformation.total
    }

    @Test
    void numberToNumeralWithRemainder() {
        Transformation transformation = transformer.numberToNumeral(new Transformation('', 63))
        assert 'YYYY' == transformation.part
        assert 3 == transformation.total
    }
}

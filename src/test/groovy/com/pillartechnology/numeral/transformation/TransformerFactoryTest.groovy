package com.pillartechnology.numeral.transformation

import org.junit.Test


class TransformerFactoryTest {

    @Test
    void createOne() {
        assertTransformer(TransformerFactory.createOne(), 'I', 1)
    }

    @Test
    void createFour() {
        assertTransformer(TransformerFactory.createFour(), 'IV', 4)
    }

    @Test
    void createFive() {
        assertTransformer(TransformerFactory.createFive(), 'V', 5)
    }

    @Test
    void createNine() {
        assertTransformer(TransformerFactory.createNine(), 'IX', 9)
    }

    @Test
    void createTen() {
        assertTransformer(TransformerFactory.createTen(), 'X', 10)
    }

    @Test
    void createForty() {
        assertTransformer(TransformerFactory.createForty(), 'XL', 40)
    }

    @Test
    void createFifty() {
        assertTransformer(TransformerFactory.createFifty(), 'L', 50)
    }

    @Test
    void createNinety() {
        assertTransformer(TransformerFactory.createNinety(), 'XC', 90)
    }

    @Test
    void createOneHundred() {
        assertTransformer(TransformerFactory.createOneHundred(), 'C', 100)
    }

    @Test
    void createFourHundred() {
        assertTransformer(TransformerFactory.createFourHundred(), 'CD', 400)
    }

    @Test
    void createFiveHundred() {
        assertTransformer(TransformerFactory.createFiveHundred(), 'D', 500)
    }

    @Test
    void createNineHundred() {
        assertTransformer(TransformerFactory.createNineHundred(), 'CM', 900)
    }

    @Test
    void createOneThousand() {
        assertTransformer(TransformerFactory.createOneThousand(), 'M', 1000)
    }

    @Test
    void numeralConversionList() {
        def expected = [TransformerFactory.createFour(), TransformerFactory.createNine(),
                        TransformerFactory.createForty(), TransformerFactory.createNinety(),
                        TransformerFactory.createFourHundred(), TransformerFactory.createNineHundred(),
                        TransformerFactory.createOne(), TransformerFactory.createFive(),
                        TransformerFactory.createTen(), TransformerFactory.createFifty(),
                        TransformerFactory.createOneHundred(), TransformerFactory.createFiveHundred(),
                        TransformerFactory.createOneThousand()]
        assert expected == TransformerFactory.numeralConversionList()
    }

    @Test
    void numberConversionList() {
        def expected = [TransformerFactory.createOneThousand(), TransformerFactory.createNineHundred(),
                        TransformerFactory.createFiveHundred(), TransformerFactory.createFourHundred(),
                        TransformerFactory.createOneHundred(), TransformerFactory.createNinety(),
                        TransformerFactory.createFifty(), TransformerFactory.createForty(),
                        TransformerFactory.createTen(), TransformerFactory.createNine(),
                        TransformerFactory.createFive(), TransformerFactory.createFour(),
                        TransformerFactory.createOne(),
        ]
        assert expected == TransformerFactory.numberConversionList()
    }

    private static void assertTransformer(AbstractTransformer transformer, String expectedNumeral, int expectedNumber) {
        assert expectedNumeral == transformer.getNumeral()
        assert expectedNumber == transformer.getNumber()
    }
}

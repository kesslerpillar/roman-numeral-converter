package com.pillartechnology.numeral.transformation

class TransformerFactory {

    private static final AbstractTransformer ONE = create('I', 1)
    private static final AbstractTransformer FOUR = create('IV', 4)
    private static final AbstractTransformer FIVE = create('V', 5)
    private static final AbstractTransformer NINE = create('IX', 9)
    private static final AbstractTransformer TEN = create('X', 10)
    private static final AbstractTransformer FORTY = create('XL', 40)
    private static final AbstractTransformer FIFTY = create('L', 50)
    private static final AbstractTransformer NINETY = create('XC', 90)
    private static final AbstractTransformer ONE_HUNDRED = create('C', 100)
    private static final AbstractTransformer FOUR_HUNDRED = create('CD', 400)
    private static final AbstractTransformer FIVE_HUNDRED = create('D', 500)
    private static final AbstractTransformer NINE_HUNDRED = create('CM', 900)
    private static final AbstractTransformer ONE_THOUSAND = create('M', 1000)

    static AbstractTransformer createOne() { ONE }

    static AbstractTransformer createFour() { FOUR }

    static AbstractTransformer createFive() { FIVE }

    static AbstractTransformer createNine() { NINE }

    static AbstractTransformer createTen() { TEN }

    static AbstractTransformer createForty() { FORTY }

    static AbstractTransformer createFifty() { FIFTY }

    static AbstractTransformer createNinety() { NINETY }

    static AbstractTransformer createOneHundred() { ONE_HUNDRED }

    static AbstractTransformer createFourHundred() { FOUR_HUNDRED }

    static AbstractTransformer createFiveHundred() { FIVE_HUNDRED }

    static AbstractTransformer createNineHundred() { NINE_HUNDRED }

    static AbstractTransformer createOneThousand() { ONE_THOUSAND }

    static List<NumeralTransformer> numeralConversionList() {
        [createFour(), createNine(), createForty(), createNinety(),
         createFourHundred(), createNineHundred(),
         createOne(), createFive(), createTen(), createFifty(),
         createOneHundred(), createFiveHundred(), createOneThousand()]
    }

    static List<NumberTransformer> numberConversionList() {
        [createOneThousand(), createNineHundred(), createFiveHundred(),
         createFourHundred(), createOneHundred(), createNinety(),
         createFifty(), createForty(), createTen(), createNine(),
         createFive(), createFour(), createOne(),
        ]
    }

    private static AbstractTransformer create(String numeral, int number) {
        new AbstractTransformer() {
            @Override
            protected String getNumeral() {
                return numeral
            }

            @Override
            protected int getNumber() {
                return number
            }
        }
    }
}

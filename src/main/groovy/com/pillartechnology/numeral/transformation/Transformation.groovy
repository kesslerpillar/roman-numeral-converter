package com.pillartechnology.numeral.transformation

class Transformation {
    private String part
    private int total

    Transformation(String part, int total) {
        this.part = part.toUpperCase()
        this.total = total
    }

    String getPart() {
        return part
    }

    int getTotal() {
        return total
    }
}

package com.assignment1;

public class AddNumbers implements AddNumbersADT {

    @Override
    public double addNumbers(Number a, Number b) {
        double sum;
        sum = a.doubleValue() + b.doubleValue();
        return sum;
    }

}

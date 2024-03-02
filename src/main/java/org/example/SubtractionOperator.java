package org.example;

public class SubtractionOperator implements NewArithmeticOperator {

    @Override
    public boolean support(String opetator) {
        return "-".equals(opetator);
    }

    @Override
    public int calculator(int operand1, int operand2) {
        return operand1 - operand2;
    }
}

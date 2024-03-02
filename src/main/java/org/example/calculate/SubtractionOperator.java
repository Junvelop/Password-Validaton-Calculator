package org.example.calculate;

public class SubtractionOperator implements NewArithmeticOperator {

    @Override
    public boolean support(String opetator) {
        return "-".equals(opetator);
    }

    @Override
    public int calculator(PositiveNumber operand1, PositiveNumber operand2) {
        return operand1.toInt() - operand2.toInt();
    }
}

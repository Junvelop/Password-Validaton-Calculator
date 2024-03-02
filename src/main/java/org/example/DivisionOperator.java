package org.example;

public class DivisionOperator implements NewArithmeticOperator {


    @Override
    public boolean support(String operator) {
        return "/".equals((operator));
    }

    @Override
    public int calculator(int operand1, int operand2) {

        if(operand2 ==0){

            throw new ArithmeticException("0으로는 나눌 수 없습니다.");
        }

        return operand1 / operand2;
    }
}

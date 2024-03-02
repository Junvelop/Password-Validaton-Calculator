import org.example.ArithmeticOperator;
import org.example.calculate.*;

import java.util.List;

public class Calcurator {

    private  static  final List<NewArithmeticOperator> arithmeticOperators = List.of(new AdditionOperator(), new SubtractionOperator(), new MultiplicationOperator(), new DivisionOperator());

    public static int calcurate(PositiveNumber operand1, String operator, PositiveNumber operand2) {


        return arithmeticOperators.stream()
                .filter(arithmeticOperators -> arithmeticOperators.support(operator))
                .map(arithmeticOperator -> arithmeticOperator.calculator(operand1, operand2))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("올바른 사칙연산이 아닙니다."));



    }
}

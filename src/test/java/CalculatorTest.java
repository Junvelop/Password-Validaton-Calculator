import org.example.calculate.PositiveNumber;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatCode;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class CalculatorTest {
    
    
    @DisplayName("덧셈 연산을 정상적으로 수행한다")
    @ParameterizedTest
    @MethodSource("formulaAndResult")
    void addtionTest() {

        int result = Calcurator.calcurate(new PositiveNumber(1), "+", new PositiveNumber(2));

        assertThat(result).isEqualTo(3);

    }

    private static Stream<Arguments> formulaAndResult(){

        return  Stream.of(
                arguments(1, "+", 2, 3),
                arguments(1, "-", 2, -1),
                arguments(1, "*", 2, 2),
                arguments(2, "/", 2, 1)
        );

    }
    @DisplayName("나눗셈에서 0을 나누는 경우 IllegalArgument 예외를 발생시킨다.")
    @Test
    void calculateExcpetionTest() {

        assertThatCode(() -> Calcurator.calcurate(new PositiveNumber(10),"/",new PositiveNumber(0))) // 칼큘레이터가 예외를 발생시키는지 확인하는 코드
                .isInstanceOf(ArithmeticException.class)         // 이걸 던지지 않으면 테스트는 실패하는 것
                .hasMessage("0으로는 나눌 수 없습니다."); //postive 객체는 0이 아님을 보장하기 때문에 이 코드는 슬모가 없어서 주석을 해놓은 것 디비전에 있는 주석도 마찬가지임





    }
}

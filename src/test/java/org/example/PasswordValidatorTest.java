package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThatCode;
import static org.assertj.core.api.Assertions.assertThat;

public class PasswordValidatorTest {

    @DisplayName("비밀번호가 최소 8자 이상, 12자 이하면 예외가 발생하지 않는다.")
    @Test
    void validatePasswordTest() {
        // given
        String password = "serverwizard";

        // when
        assertThatCode(() -> Passwordvalidator.validate(password))
                // then
                .doesNotThrowAnyException();
    }
    @DisplayName("비밀번호가 8자 미만 또는 12자 초과하는 경우 IllegalArgumetException 예외가 발생한다")
    @ParameterizedTest
    @ValueSource(strings = {"aabbcce", "aabbccddeeffg"})
    void validatePasswordTest2(String password) {

       // String password = "aabb";
        assertThatCode(() -> Passwordvalidator.validate(password))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("비밀번호는 최소 8자 이상 12자 이하여야 한다");


    }
}

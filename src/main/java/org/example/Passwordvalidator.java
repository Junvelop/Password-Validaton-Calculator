package org.example;

public class Passwordvalidator {

    public static final String STRING = "비밀번호는 최소 8자 이상 12자 이하여야 한다";

    /**
     * 비밀번호가 8자 미만 또는 12자 초과하는 경우 IllegalArgumentException 예외가 발생한다.
     */
    public static void validate(String password) {

        int length = password.length();
        if (length < 8 || length > 12){

            throw new IllegalArgumentException(STRING);
        }



    }
}

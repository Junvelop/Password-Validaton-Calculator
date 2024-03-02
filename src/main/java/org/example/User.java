package org.example;

import java.util.Random;

public class User {
    private String password;

    public void initPassword(PasswordGenerator passwordGenerator) {
        // PasswordGenerator 인스턴스를 통해 generatePassword 메서드 호출
        String randompassword = passwordGenerator.generatePassword();

        if (randompassword.length() >= 8 && randompassword.length() <= 12) {
            this.password = randompassword;
        }
    }


    public String getPassword() {
        return password;
    }
}
